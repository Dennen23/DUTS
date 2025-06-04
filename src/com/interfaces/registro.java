/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.interfaces;

import Clases.Usuarios;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author prueb
 */
public class registro extends javax.swing.JFrame {


    int xMouse, yMouse;
    public registro() {
        initComponents();
        setIconImage(getIconImage());
    }

    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon.jpg"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Izquierda = new javax.swing.JPanel();
        escudo = new javax.swing.JLabel();
        TITULO = new javax.swing.JLabel();
        encabezado = new javax.swing.JPanel();
        Salida = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Lastname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        contraseñas = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        variable1 = new javax.swing.JPanel();
        nombres = new javax.swing.JTextField();
        variable2 = new javax.swing.JPanel();
        apellidos = new javax.swing.JTextField();
        variable3 = new javax.swing.JPanel();
        correos = new javax.swing.JTextField();
        variable4 = new javax.swing.JPanel();
        numeros = new javax.swing.JTextField();
        variable5 = new javax.swing.JPanel();
        userName = new javax.swing.JTextField();
        variable6 = new javax.swing.JPanel();
        password = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JPanel();
        registrarse = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        cancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Izquierda.setBackground(new java.awt.Color(153, 153, 153));

        escudo.setBackground(new java.awt.Color(204, 204, 204));
        escudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escudo.png"))); // NOI18N

        TITULO.setFont(new java.awt.Font("Roboto Black", 3, 14)); // NOI18N
        TITULO.setText("SISTEMA DUTS");

        javax.swing.GroupLayout IzquierdaLayout = new javax.swing.GroupLayout(Izquierda);
        Izquierda.setLayout(IzquierdaLayout);
        IzquierdaLayout.setHorizontalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IzquierdaLayout.createSequentialGroup()
                        .addComponent(escudo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IzquierdaLayout.createSequentialGroup()
                        .addComponent(TITULO)
                        .addGap(51, 51, 51))))
        );
        IzquierdaLayout.setVerticalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(escudo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TITULO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(Izquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        encabezado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                encabezadoMouseDragged(evt);
            }
        });
        encabezado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                encabezadoMousePressed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Roboto Condensed ExtraBold", 3, 14)); // NOI18N
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir.setText("SALIR");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SalidaLayout = new javax.swing.GroupLayout(Salida);
        Salida.setLayout(SalidaLayout);
        SalidaLayout.setHorizontalGroup(
            SalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );
        SalidaLayout.setVerticalGroup(
            SalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout encabezadoLayout = new javax.swing.GroupLayout(encabezado);
        encabezado.setLayout(encabezadoLayout);
        encabezadoLayout.setHorizontalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encabezadoLayout.createSequentialGroup()
                .addGap(0, 732, Short.MAX_VALUE)
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        encabezadoLayout.setVerticalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        Title.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        Title.setText("Para registrarse llene el siguiente formulario:");
        background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 51, -1, -1));

        Name.setFont(new java.awt.Font("Roboto SemiCondensed Black", 3, 14)); // NOI18N
        Name.setText("Nombres:");
        background.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 116, -1, -1));

        Lastname.setFont(new java.awt.Font("Roboto SemiCondensed Black", 3, 14)); // NOI18N
        Lastname.setText("Apellidos:");
        background.add(Lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 151, -1, -1));

        email.setFont(new java.awt.Font("Roboto SemiCondensed Black", 3, 14)); // NOI18N
        email.setText("Correo electrónico:");
        background.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 186, -1, -1));

        number.setFont(new java.awt.Font("Roboto SemiCondensed Black", 3, 14)); // NOI18N
        number.setText("Numero de celular:");
        background.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 227, -1, -1));

        contraseñas.setFont(new java.awt.Font("Roboto SemiCondensed Black", 3, 14)); // NOI18N
        contraseñas.setText("Contraseña:");
        background.add(contraseñas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        usuario.setFont(new java.awt.Font("Roboto SemiCondensed Black", 3, 14)); // NOI18N
        usuario.setText("Usuario:");
        background.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        variable1.setBackground(new java.awt.Color(255, 255, 255));
        variable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        variable1.setPreferredSize(new java.awt.Dimension(306, 21));

        nombres.setBorder(null);
        nombres.setPreferredSize(new java.awt.Dimension(64, 16));

        javax.swing.GroupLayout variable1Layout = new javax.swing.GroupLayout(variable1);
        variable1.setLayout(variable1Layout);
        variable1Layout.setHorizontalGroup(
            variable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombres, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );
        variable1Layout.setVerticalGroup(
            variable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombres, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        background.add(variable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 114, -1, -1));

        variable2.setBackground(new java.awt.Color(255, 255, 255));
        variable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        variable2.setPreferredSize(new java.awt.Dimension(306, 21));

        apellidos.setBorder(null);

        javax.swing.GroupLayout variable2Layout = new javax.swing.GroupLayout(variable2);
        variable2.setLayout(variable2Layout);
        variable2Layout.setHorizontalGroup(
            variable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );
        variable2Layout.setVerticalGroup(
            variable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        background.add(variable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 149, -1, -1));

        variable3.setBackground(new java.awt.Color(255, 255, 255));
        variable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        variable3.setPreferredSize(new java.awt.Dimension(306, 21));

        correos.setBorder(null);

        javax.swing.GroupLayout variable3Layout = new javax.swing.GroupLayout(variable3);
        variable3.setLayout(variable3Layout);
        variable3Layout.setHorizontalGroup(
            variable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(correos, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );
        variable3Layout.setVerticalGroup(
            variable3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(correos, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        background.add(variable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 184, -1, -1));

        variable4.setBackground(new java.awt.Color(255, 255, 255));
        variable4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        variable4.setPreferredSize(new java.awt.Dimension(306, 21));

        numeros.setBorder(null);

        javax.swing.GroupLayout variable4Layout = new javax.swing.GroupLayout(variable4);
        variable4.setLayout(variable4Layout);
        variable4Layout.setHorizontalGroup(
            variable4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(numeros, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );
        variable4Layout.setVerticalGroup(
            variable4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(numeros)
        );

        background.add(variable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 223, -1, -1));

        variable5.setBackground(new java.awt.Color(255, 255, 255));
        variable5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        variable5.setPreferredSize(new java.awt.Dimension(306, 21));

        userName.setBorder(null);

        javax.swing.GroupLayout variable5Layout = new javax.swing.GroupLayout(variable5);
        variable5.setLayout(variable5Layout);
        variable5Layout.setHorizontalGroup(
            variable5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );
        variable5Layout.setVerticalGroup(
            variable5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        background.add(variable5, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 260, -1, -1));

        variable6.setBackground(new java.awt.Color(255, 255, 255));
        variable6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        variable6.setPreferredSize(new java.awt.Dimension(306, 21));

        password.setBorder(null);

        javax.swing.GroupLayout variable6Layout = new javax.swing.GroupLayout(variable6);
        variable6.setLayout(variable6Layout);
        variable6Layout.setHorizontalGroup(
            variable6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );
        variable6Layout.setVerticalGroup(
            variable6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        background.add(variable6, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 300, -1, -1));

        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        registrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarse.setText("REGISTRARSE");
        registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        background.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelar.setText("CANCELAR");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        background.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salida.setBackground(Color.red);
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salida.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_SalirMouseExited

    private void encabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encabezadoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_encabezadoMouseDragged

    private void encabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encabezadoMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_encabezadoMousePressed

    private void registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseMouseClicked
        String nombre = nombres.getText();
        String apellido = apellidos.getText();
        String correo = correos.getText();
        String celular = numeros.getText();
        String user = userName.getText();
        String contraseña = password.getText();
        boolean esAdmin = false;
        
        if (nombre.isEmpty() || apellido.isEmpty() || celular.isEmpty() || user.isEmpty() || contraseña.isEmpty() || correo ==null){
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Usuarios nuevoUsuario = new Usuarios(nombre, apellido, correo, celular, user, contraseña, esAdmin);
            Usuarios.registrarUsuarios(nuevoUsuario);
            
            JOptionPane.showMessageDialog(this, "Se ha registrado con éxito", "Exito", JOptionPane.INFORMATION_MESSAGE);
            sesion s2 = new sesion();
            s2.setLocation(this.getLocation());
            s2.getLocation();
            s2.show();
            dispose();
        }
    }//GEN-LAST:event_registrarseMouseClicked

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        sesion s1 = new sesion();
        s1.setLocation(this.getLocation());
        s1.getLocation();
        s1.show();
        dispose();
    }//GEN-LAST:event_cancelarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Izquierda;
    private javax.swing.JLabel Lastname;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel Salida;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel TITULO;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField apellidos;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JLabel cancelar;
    private javax.swing.JLabel contraseñas;
    private javax.swing.JTextField correos;
    private javax.swing.JLabel email;
    private javax.swing.JPanel encabezado;
    private javax.swing.JLabel escudo;
    private javax.swing.JTextField nombres;
    private javax.swing.JLabel number;
    private javax.swing.JTextField numeros;
    private javax.swing.JTextField password;
    private javax.swing.JLabel registrarse;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel usuario;
    private javax.swing.JPanel variable1;
    private javax.swing.JPanel variable2;
    private javax.swing.JPanel variable3;
    private javax.swing.JPanel variable4;
    private javax.swing.JPanel variable5;
    private javax.swing.JPanel variable6;
    // End of variables declaration//GEN-END:variables
}
