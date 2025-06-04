/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import Clases.Usuarios;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import javax.swing.plaf.FileChooserUI;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter; 
import java.io.File; 
import java.awt.Image;

/**
 *
 * @author prueb
 */
public class Perfil extends javax.swing.JPanel {

    /**
     * Creates new form Perfil
     */
    public Perfil() {
        initComponents();
        actualizarDato();
    }
    
    public void actualizarDato(){
        Usuarios usuario = Usuarios.obtenerUsuarioActivo();
        
        if(usuario != null){
            nombre.setText(usuario.getNombre() + usuario.getApellido());
            correo.setText(usuario.getCorreo());
            numero.setText(usuario.getCelular());
            
            String rutaFoto = (usuario.getRutaFoto() != null && !usuario.getRutaFoto().isEmpty()) ? usuario.getRutaFoto() 
                    : Usuarios.getRutaDefecto();
            ImageIcon imgPerfil = new ImageIcon(rutaFoto);
            Image img = imgPerfil.getImage().getScaledInstance(129, 259, Image.SCALE_SMOOTH);
            foto.setIcon(new ImageIcon(img));
            
        } else {
            System.out.println("No hay usuario registrado");
        }
    }
    
    private void cargarImagen(String rutaImagen){
        try{
            ImageIcon imgReal = new ImageIcon(rutaImagen);
            Image imgRenderizado = imgReal.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_SMOOTH);
            
            foto.setIcon(new ImageIcon(imgRenderizado));
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error al cargar la imagen", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        regresar = new javax.swing.JPanel();
        regreso = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        numero = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        Foto = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        seleccion = new javax.swing.JPanel();
        selectImg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));

        regresar.setBackground(new java.awt.Color(204, 204, 204));

        regreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regreso.setText("X");
        regreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regresoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout regresarLayout = new javax.swing.GroupLayout(regresar);
        regresar.setLayout(regresarLayout);
        regresarLayout.setHorizontalGroup(
            regresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );
        regresarLayout.setVerticalGroup(
            regresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regreso, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Panel.setBackground(new java.awt.Color(51, 51, 51));
        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        numero.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        numero.setForeground(new java.awt.Color(255, 255, 255));
        numero.setText("jLabel3");

        number.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        number.setForeground(new java.awt.Color(255, 255, 255));
        number.setText("NUMERO DE TELEFONO:");

        correo.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(255, 255, 255));
        correo.setText("jLabel3");

        email.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("CORREO ELECTRONICO:");

        nombre.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("jLabel3");

        Name.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("NOMBRE COMPLETO:");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(number)
                        .addGap(18, 18, 18)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addComponent(email)
                            .addGap(18, 18, 18)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addComponent(Name)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(nombre))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(correo))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number)
                    .addComponent(numero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(51, 51, 51));

        Foto.setBackground(new java.awt.Color(204, 204, 204));
        Foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        Foto.setForeground(new java.awt.Color(255, 255, 255));

        foto.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout FotoLayout = new javax.swing.GroupLayout(Foto);
        Foto.setLayout(FotoLayout);
        FotoLayout.setHorizontalGroup(
            FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        FotoLayout.setVerticalGroup(
            FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );

        seleccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        selectImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectImg.setText("Seleccionar foto..");
        selectImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectImgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout seleccionLayout = new javax.swing.GroupLayout(seleccion);
        seleccion.setLayout(seleccionLayout);
        seleccionLayout.setHorizontalGroup(
            seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectImg, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        seleccionLayout.setVerticalGroup(
            seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void regresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresoMouseEntered
        regresar.setBackground(Color.gray);
    }//GEN-LAST:event_regresoMouseEntered

    private void regresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresoMouseExited
        regresar.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_regresoMouseExited

    private void regresoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresoMousePressed
        principal p1 = new principal();
        p1.setSize(800,410);
        p1.setLocation(0,0);

        background.removeAll();
        background.add(p1, BorderLayout.CENTER);
        background.revalidate();
        background.repaint();
    }//GEN-LAST:event_regresoMousePressed

    private void selectImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectImgMouseClicked
        JFileChooser seleccionar = new JFileChooser();
        seleccionar.setDialogTitle("Selecciona tu foto de perfil");
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "jpg", "jpeg", "png", "gif");
        seleccionar.setFileFilter(filtro);
        
        int resultado = seleccionar.showOpenDialog(this);
        
        if(resultado == JFileChooser.APPROVE_OPTION){
            File archivo = seleccionar.getSelectedFile();
            cargarImagen(archivo.getAbsolutePath());
            
            Usuarios usuario = Usuarios.obtenerUsuarioActivo();
            usuario.setRutaFoto(archivo.getAbsolutePath());
            usuario.guardarArchivo();
        }
    }//GEN-LAST:event_selectImgMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Foto;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel background;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel email;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel number;
    private javax.swing.JLabel numero;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel regresar;
    private javax.swing.JLabel regreso;
    private javax.swing.JPanel seleccion;
    private javax.swing.JLabel selectImg;
    // End of variables declaration//GEN-END:variables
}
