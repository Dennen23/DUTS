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



public class sesion extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    public sesion() {
        initComponents();
        Usuarios.crearAdmin();
        rsscalelabel.RSScaleLabel.setScaleLabel(escudo, "src/imagenes/escudo.png");
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
        derecha = new javax.swing.JPanel();
        escudo = new javax.swing.JLabel();
        TITULO = new javax.swing.JLabel();
        IniciarSesion = new javax.swing.JLabel();
        UsuarioTitulo = new javax.swing.JLabel();
        ingresoUsuario = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        ConstraseñaTitulo1 = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        contraseñas = new javax.swing.JPasswordField();
        botonIngreso = new javax.swing.JPanel();
        Ingreso = new javax.swing.JLabel();
        encabezado = new javax.swing.JPanel();
        Salida = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        Registro = new javax.swing.JLabel();
        register = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(800, 410));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        derecha.setBackground(new java.awt.Color(153, 153, 153));

        escudo.setBackground(new java.awt.Color(204, 204, 204));
        escudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escudo.png"))); // NOI18N

        TITULO.setFont(new java.awt.Font("Roboto Black", 3, 14)); // NOI18N
        TITULO.setText("SISTEMA DUTS");

        javax.swing.GroupLayout derechaLayout = new javax.swing.GroupLayout(derecha);
        derecha.setLayout(derechaLayout);
        derechaLayout.setHorizontalGroup(
            derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(derechaLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, derechaLayout.createSequentialGroup()
                        .addComponent(escudo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, derechaLayout.createSequentialGroup()
                        .addComponent(TITULO)
                        .addGap(51, 51, 51))))
        );
        derechaLayout.setVerticalGroup(
            derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(derechaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(escudo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TITULO)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        background.add(derecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 220, 410));

        IniciarSesion.setFont(new java.awt.Font("Roboto Black", 3, 24)); // NOI18N
        IniciarSesion.setText("INICIAR SESION");
        background.add(IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        UsuarioTitulo.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        UsuarioTitulo.setText("USUARIO");
        background.add(UsuarioTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        ingresoUsuario.setFont(new java.awt.Font("Roboto Condensed", 2, 14)); // NOI18N
        ingresoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        ingresoUsuario.setText("Ingrese el usuario");
        ingresoUsuario.setBorder(null);
        ingresoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingresoUsuarioMousePressed(evt);
            }
        });
        ingresoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoUsuarioActionPerformed(evt);
            }
        });
        background.add(ingresoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 400, 30));

        separador1.setForeground(new java.awt.Color(0, 0, 0));
        background.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 470, 10));

        ConstraseñaTitulo1.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        ConstraseñaTitulo1.setText("CONTRASEÑA");
        background.add(ConstraseñaTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 20));

        separador2.setForeground(new java.awt.Color(0, 0, 0));
        background.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 470, 10));

        contraseñas.setForeground(new java.awt.Color(204, 204, 204));
        contraseñas.setText("********");
        contraseñas.setBorder(null);
        contraseñas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñasMousePressed(evt);
            }
        });
        background.add(contraseñas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 470, -1));

        botonIngreso.setBackground(new java.awt.Color(153, 153, 153));

        Ingreso.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        Ingreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ingreso.setText("INGRESAR");
        Ingreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ingreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IngresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IngresoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout botonIngresoLayout = new javax.swing.GroupLayout(botonIngreso);
        botonIngreso.setLayout(botonIngresoLayout);
        botonIngresoLayout.setHorizontalGroup(
            botonIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        botonIngresoLayout.setVerticalGroup(
            botonIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(botonIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 50));

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
            .addGroup(encabezadoLayout.createSequentialGroup()
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 732, Short.MAX_VALUE))
        );
        encabezadoLayout.setVerticalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        Registro.setFont(new java.awt.Font("Roboto Condensed Light", 2, 12)); // NOI18N
        Registro.setText("Si no tienes una cuenta aún, regístrate");
        background.add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        register.setFont(new java.awt.Font("Roboto Condensed Light", 2, 12)); // NOI18N
        register.setForeground(new java.awt.Color(0, 0, 204));
        register.setText("aquí");
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        background.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoUsuarioActionPerformed

    private void encabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encabezadoMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_encabezadoMousePressed

    private void encabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encabezadoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_encabezadoMouseDragged

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salida.setBackground(Color.red);
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salida.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_SalirMouseExited

    private void IngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoMouseEntered
        botonIngreso.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_IngresoMouseEntered

    private void IngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoMouseExited
        botonIngreso.setBackground(Color.gray);
    }//GEN-LAST:event_IngresoMouseExited

    private void ingresoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoUsuarioMousePressed
        if (ingresoUsuario.getText().equals("Ingrese el usuario")){
        ingresoUsuario.setText("");
        ingresoUsuario.setForeground(Color.black);
        }
        if (String.valueOf(contraseñas.getPassword()).isEmpty()){
        contraseñas.setText("********");
        contraseñas.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ingresoUsuarioMousePressed

    private void contraseñasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñasMousePressed
        if(ingresoUsuario.getText().isEmpty()){
        ingresoUsuario.setText("ingrese el usuario");
        ingresoUsuario.setForeground(Color.gray);
        }
        if(contraseñas.getText().equals("********")){
        contraseñas.setText("");
        contraseñas.setForeground(Color.black);
        }
    }//GEN-LAST:event_contraseñasMousePressed

    private void IngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoMouseClicked
        String user = ingresoUsuario.getText().trim();
        String contraseña = new String(contraseñas.getPassword()).trim();
        
        System.out.println("Usuario ingresado" + user);
        System.out.println("Contraseña ingresada" + contraseña);
        
        if (user.isEmpty() || contraseña.isEmpty()){
            JOptionPane.showMessageDialog(this, "Usuario y contraseña son obligatorios", "error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Usuarios usuarioAutenticado = Usuarios.validarLogin(user, contraseña);
        
        if (usuarioAutenticado != null){
            menu m1 = new menu();
            m1.setLocation(this.getLocation());
            m1.getLocation();
            m1.show();
            dispose();   
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_IngresoMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        registro r1 = new registro();
        r1.setLocation(this.getLocation());
        r1.getLocation();
        r1.show();
        dispose();
    }//GEN-LAST:event_registerMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sesion().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConstraseñaTitulo1;
    private javax.swing.JLabel Ingreso;
    private javax.swing.JLabel IniciarSesion;
    private javax.swing.JLabel Registro;
    private javax.swing.JPanel Salida;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel TITULO;
    private javax.swing.JLabel UsuarioTitulo;
    private javax.swing.JPanel background;
    private javax.swing.JPanel botonIngreso;
    private javax.swing.JPasswordField contraseñas;
    private javax.swing.JPanel derecha;
    private javax.swing.JPanel encabezado;
    private javax.swing.JLabel escudo;
    private javax.swing.JTextField ingresoUsuario;
    private javax.swing.JLabel register;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    // End of variables declaration//GEN-END:variables
}
