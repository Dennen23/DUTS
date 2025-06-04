/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Evento {
private String nombre;
private String descripcion;
private LocalDate fecha;
private double premio; // Dinero por asistencia
private String rutaImg;
private List<Usuarios> participantes = new ArrayList<>();

public Evento(String nombre, String descripcion, LocalDate fecha, double premio){
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.fecha = fecha;
    this.premio = premio;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public List<Usuarios> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Usuarios> participantes) {
        this.participantes = participantes;
    }

    public String getRutaImg() {
        return rutaImg;
    }

    public void setRutaImg(String rutaImg) {
        this.rutaImg = rutaImg;
    }
    
    public static String getRutaDefecto(){
        return "src/imagenes/IconPerson.png";
    }



public void agregarParticipantes(Usuarios usuario){
    participantes.add(usuario);
    }
}
