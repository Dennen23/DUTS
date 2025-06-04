
package Clases;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import Clases.Evento;

public class Usuarios extends Persona implements Inscripciones {
    private double saldo;
    private static String usuarioActivo;
    private static String celularActivo;
    private String rutaFoto;
    private boolean esAdmin;
    private static List<Usuarios> usuariosRegistrados = new ArrayList<>();
    private List<deposito> Deposito = new ArrayList<>();
    private List<Evento> eventosInscritos = new ArrayList<>();

    public Usuarios(String nombre, String apellido, String correo, String celular, String user,String contraseña, boolean esAdmin) {
        super(nombre, apellido, correo, celular, user, contraseña);
        this.saldo = 0.0;
        this.esAdmin = esAdmin;
    }
    
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getPromedioMensual(){
        return calcularPromedio("Mensual");
    }
    
    public double getPromedioSemestral(){
        return calcularPromedio("Semestral");
    }
    
    public double getPromedioAnual(){
        return calcularPromedio("Anual");
    }
    
        //fake DB
    
    public static void guardarArchivo(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", false))){
            for (Usuarios usuario : usuariosRegistrados){
                String linea = String.join("|",
                        usuario.getNombre(),
                        usuario.getApellido(),
                        usuario.getCorreo(),
                        usuario.getCelular(),
                        usuario.getUser(),
                        usuario.getContraseña(),
                        String.valueOf(usuario.getSaldo()),
                        usuario.getRutaFoto() != null ? usuario.getRutaFoto() : "");
                writer.write(linea);
                writer.newLine();
            }
            writer.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void cargarArchivo(){
        usuariosRegistrados.clear();
        File archivo = new File("usuarios.txt");
        
        try(BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = reader.readLine()) != null){
                
                String[] datos = linea.split("\\|");
                
                if(datos.length >= 7){
                    Usuarios usuario = new Usuarios(
                    datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],Boolean.parseBoolean(datos[6])
                    );
                    usuario.saldo = Double.parseDouble(datos[6]);
                    usuario.setRutaFoto(datos.length > 7 && !datos[7].isEmpty() ? datos[7] : getRutaDefecto());
                    usuariosRegistrados.add(usuario);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public static void registrarUsuarios(Usuarios usuario){
        usuariosRegistrados.add(usuario);
        guardarArchivo();
    }
    
    public static Usuarios validarLogin(String user, String contraseña){
        cargarArchivo();
        System.out.println("validando usuarios");
        System.out.println("usuario: " + user + " ccontraseña " + contraseña);
        System.out.println("total usuarios" + usuariosRegistrados.size());
        
        for(Usuarios u : usuariosRegistrados){
            if (u.getUser().equals(user)){
                    if (u.getContraseña().equals(contraseña.trim())){
                        setUsuarioActivo(user);
                return u;
            } else
                        System.out.println("contraseña no coincided");
            }
        }
        return null;
    }
    
    // validaciones unicas
    
    public static boolean correoExiste(String correo){
     return usuariosRegistrados.stream().anyMatch(u -> u.getCorreo().equalsIgnoreCase(correo.trim()));
    }
    
    public static boolean celularExiste(String celular){
        return usuariosRegistrados.stream().anyMatch(u -> u.getCelular().equals(celular.trim()));
    }
    
    public static boolean usuarioExiste(String user){
        return usuariosRegistrados.stream().anyMatch(u -> u.getUser().equalsIgnoreCase(user.trim()));
    }
    
    
    //TRANSFERENCIAS
    
    public static Usuarios buscarPorTelefono(String celular){
        cargarArchivo();
        for(Usuarios u : usuariosRegistrados){
            if(u.getCelular().equals(celular)){
                return u;
            }
        }
        return null;
    }
    
    public static Usuarios buscarUser(String username){
        cargarArchivo();
        for(Usuarios usuario : usuariosRegistrados){
            if(usuario.getUser().equals(username)){
                return usuario;
            }
        }
        return null;
    }
    
    public static boolean transferir(String emisorUser, String celularReceptor, double monto){
        cargarArchivo();
        Usuarios emisor = buscarUser(emisorUser);
        System.out.println("referencia en memoria" + System.identityHashCode(emisor));
        Usuarios receptor = buscarPorTelefono(celularReceptor);
        
        
        
        if (emisor.getUser().equals(receptor.getUser())){
            JOptionPane.showMessageDialog(null, "No te puedes transferir a ti mismo");
            return false;
        }
        
        if (emisor == null || receptor == null){
            JOptionPane.showMessageDialog(null, "Usuario o celular incorrectos");
            return false;
        }
        
        if(emisor.getSaldo()<monto){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            return false;
        }
        
        for (Usuarios u : usuariosRegistrados){
            if (u.getUser().equals(emisorUser)){
                System.out.println("Modificando saldo del emisor en la lista");
                u.setSaldo(u.getSaldo() - monto);
            }
            if (u.getCelular().equals(celularReceptor)){
                System.out.println("Modificando saldo del receptor en la lista");
                u.setSaldo(u.getSaldo() + monto);
            }
        }
        guardarArchivo();
        
        deposito movEmisor = new deposito("dd/MM/YYYY HH:mm",emisorUser,receptor.getCelular(), - monto);
        Movements.guardarMovimientos(movEmisor);
        deposito movReceptor = new deposito("dd/MM/YYYY HH:mm", receptor.getUser(), emisor.getCelular(), monto);
        Movements.guardarMovimientos(movReceptor);
        
        return true;
    }

    
    
    // promedios
    
    public double calcularPromedio(String periodo){
        List<deposito> movimientosFiltrados = filtrarDeposito(periodo);
        
        if(movimientosFiltrados.isEmpty()) return 0.0;
        
        return movimientosFiltrados.stream().mapToDouble(deposito::getMonto).average().orElse(0.0);
    }
    
    private List<deposito> filtrarDeposito(String periodo){
        LocalDate fechaLimite;
        switch(periodo.toUpperCase()){
            case "Mensual":
                fechaLimite = LocalDate.now().minusMonths(1);
                break;
            case "Semestral":
                fechaLimite = LocalDate.now().minusMonths(6);
                break;
            case "Anual" : 
                fechaLimite = LocalDate.now().minusYears(1);
                break;
            default : 
                return Deposito;
        }
        return Deposito.stream().filter(m -> LocalDate.parse(m.getFecha().split(" ")[0], 
                DateTimeFormatter.ofPattern("dd/MM/YYYY")).isAfter(fechaLimite)).collect(Collectors.toList());
    }

    //revisar usuario logueado

    public static String getUsuarioActivo() {
        return usuarioActivo;
    }

    public static void setUsuarioActivo(String user) {
        usuarioActivo = user;
    }
    
    public static Usuarios obtenerUsuarioActivo(){
        if(usuarioActivo == null) return null;
        
        for(Usuarios u : usuariosRegistrados){
            if(u.getUser().equals(usuarioActivo)){
                return u;
            }
        }
        return null;
    }

    public static String getCelularActivo() {
        return celularActivo;
    }

    public static void setCelularActivo(String celular) {
        celularActivo = celular;
    }

    public static Usuarios obtenerCelularActivo(){
        if(celularActivo==null) return null;
        
        for(Usuarios u : usuariosRegistrados){
            if(u.getCelular().equals(celularActivo)){
                return u;
            }
        }
        return null;
    }
    
    //GUARDAR RUTA Y FOTOS

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String ruta) {
        this.rutaFoto = ruta;
    }
    
    public static String getRutaDefecto(){
        return "src/imagenes/IconPerson.png";
    }
    
    
    //validación de admin
    
    public boolean isAdmin(){
        return esAdmin;
    }

    public boolean isEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }
    
    
    
    //Inscripción a eventos
    
    public void inscripcionEvento(Evento evento){
        if(!this.esAdmin){
            evento.agregarParticipantes(this);
        }
    }
    
    //administrador
    
    public static void crearAdmin(){
        cargarArchivo();
        
        boolean adminExiste = usuariosRegistrados.stream().anyMatch(u->u.getUser().equalsIgnoreCase("admin"));
        
        if(!adminExiste){
            Usuarios admin = new Usuarios(
            "Admin","Root", "admin@gmail.com","3183986365","admin","admin123", true);
            usuariosRegistrados.add(admin);
            guardarArchivo();
        }
    }
    
    public static class adminControl{
        public static Evento crearEvento(String nombre, String descripcion, LocalDate fecha, double premio){
            Usuarios admin = Usuarios.obtenerUsuarioActivo();
            
            if(admin == null || !admin.isAdmin()){
                JOptionPane.showMessageDialog(null, "Solo administradores pueden crear eventos");
                return null;
            }
            Evento nuevoEvento = new Evento(nombre, descripcion, fecha, premio);
            Usuarios.agregarEvento(nuevoEvento);
            return nuevoEvento;
        }
        
        public static void darPremio(Evento evento, Usuarios usuario){
            if(evento.getParticipantes().contains(usuario)){
                usuario.setSaldo(usuario.getSaldo()+evento.getPremio());
                JOptionPane.showMessageDialog(null, "Premio entregado a " + usuario.getUser());
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no está inscrito en el evento");
            }
        }
    }
    
    private static final String ARCHIVO = "eventos.txt";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void agregarEvento(Evento evento) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
            // Formato: nombre|descripcion|fecha|premio|participantes
            String participantes = evento.getParticipantes().stream()
                .map(Usuarios::getUser)
                .collect(Collectors.joining(","));
            
            writer.write(
                evento.getNombre() + "|" +
                evento.getDescripcion() + "|" +
                evento.getFecha().format(formatter) + "|" +
                evento.getPremio() + "|" +
                (evento.getRutaImg() != null ? evento.getRutaImg() : "") + "|" +
                participantes
            );
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Evento> cargarEventos() {
        
        
        List<Evento> eventos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split("\\|");
                if (datos.length >= 5) {
                    Evento evento = new Evento(
                        datos[0],
                        datos[1],
                        LocalDate.parse(datos[2], formatter),
                        Double.parseDouble(datos[3])
                    );
                    
                    if(datos.length >4 && !datos[4].isEmpty()){
                        evento.setRutaImg(datos[4]);
                    }
                    
                    if (datos.length > 5 && !datos[5].isEmpty()) {
                        for (String user : datos[5].split(",")) {
                            Usuarios usuario = Usuarios.buscarUser(user);
                            if(usuario != null) evento.agregarParticipantes(usuario);
                        }
                    }
                    eventos.add(evento);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return eventos;
    }
    
    //eliminar eeventos
    
    public static void guardarEventos(List<Evento> eventos) {
    File archivo = new File("eventos.txt");

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, false))) {
        for (Evento evento : eventos) {
            String linea = evento.getNombre() + "|" +
                           evento.getDescripcion() + "|" +
                           evento.getFecha().format(formatter) + "|" +
                           evento.getPremio() + "|" +
                           evento.getRutaImg();
            writer.write(linea);
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
    public static boolean eliminarEvento(Evento eventoAEliminar) {
    List<Evento> eventos = cargarEventos();
    boolean eliminado = eventos.removeIf(e -> e.getNombre().equals(eventoAEliminar.getNombre())); // o usa un ID si tienes
    if (eliminado) {
        guardarEventos(eventos);
        return true;
    }
    return false;
}

    
    //interfaces

@Override
public boolean inscribirse(Evento evento) {
    if (!eventosInscritos.contains(evento)) {
        eventosInscritos.add(evento);
        guardarInscripcion(evento);
        return true;
    }
    return false;
}

@Override
public boolean cancelarInscripcion(Evento evento) {
    if (eventosInscritos.remove(evento)) {
        eliminarInscripcionDeArchivo(evento);
        return true;
    }
    return false;
}

    public List<Evento> getEventosInscritos() {
        return eventosInscritos;
    }
    
    public void guardarInscripcion(Evento evento) {
    try (FileWriter fw = new FileWriter("inscripciones.txt", true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter out = new PrintWriter(bw)) {
        out.println(this.getUser()+ "," + evento.getNombre());
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
    public void eliminarInscripcionDeArchivo(Evento evento) {
    File original = new File("inscripciones.txt");
    File temporal = new File("temp.txt");

    try (BufferedReader reader = new BufferedReader(new FileReader(original));
         BufferedWriter writer = new BufferedWriter(new FileWriter(temporal))) {

        String linea;
        while ((linea = reader.readLine()) != null) {
            if (!linea.equals(this.getUser() + "," + evento.getNombre())) {
                writer.write(linea);
                writer.newLine();
            }
        }

    } catch (IOException e) {
        e.printStackTrace();
    }

    original.delete();
    temporal.renameTo(original);
}
    
    public void cargarInscripciones(List<Evento> eventosDisponibles) {
    eventosInscritos.clear();

    try (BufferedReader br = new BufferedReader(new FileReader("inscripciones.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",", 2);
            if (partes.length == 2 && partes[0].equals(getUser())) {
                String nombreEvento = partes[1];
                for (Evento e : eventosDisponibles) {
                    if (e.getNombre().equals(nombreEvento)) {
                        eventosInscritos.add(e);
                        break;
                    }
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}

