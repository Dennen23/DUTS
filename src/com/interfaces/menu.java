/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.interfaces;


import Clases.Usuarios;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import principal.Inicio;
import principal.Movimientos;
import principal.principal;
import principal.Eventos;
import principal.Noticias;
import principal.NoticiasAdmin;
import principal.Perfil;


/**
 *
 * @author prueb
 */
public class menu extends javax.swing.JFrame {

    int xMouse, yMouse;
    public menu() {
        initComponents();
        setDate();
        initContent();
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

        jComboBox1 = new javax.swing.JComboBox<>();
        background = new javax.swing.JPanel();
        superior = new javax.swing.JPanel();
        btnSalir = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        CERRAR = new javax.swing.JPanel();
        cerrarSesion = new javax.swing.JLabel();
        inferior = new javax.swing.JPanel();
        inicio = new javax.swing.JPanel();
        Inicio = new javax.swing.JLabel();
        movimiento = new javax.swing.JPanel();
        Movimiento = new javax.swing.JLabel();
        evento = new javax.swing.JPanel();
        Evento = new javax.swing.JLabel();
        perfil = new javax.swing.JPanel();
        Perfil = new javax.swing.JLabel();
        noticias = new javax.swing.JPanel();
        notice = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        superior.setBackground(new java.awt.Color(204, 204, 204));
        superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                superiorMouseDragged(evt);
            }
        });
        superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                superiorMousePressed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));

        salir.setBackground(new java.awt.Color(255, 204, 204));
        salir.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(51, 51, 51));
        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setText("SALIR");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        fecha.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        fecha.setText("{dayname} {day} de {month} de {year}");

        CERRAR.setBackground(new java.awt.Color(204, 204, 204));
        CERRAR.setPreferredSize(new java.awt.Dimension(119, 28));

        cerrarSesion.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(51, 51, 51));
        cerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarSesion.setText("CERRAR SESION");
        cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesion.setPreferredSize(new java.awt.Dimension(107, 28));
        cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerrarSesionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout CERRARLayout = new javax.swing.GroupLayout(CERRAR);
        CERRAR.setLayout(CERRARLayout);
        CERRARLayout.setHorizontalGroup(
            CERRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );
        CERRARLayout.setVerticalGroup(
            CERRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout superiorLayout = new javax.swing.GroupLayout(superior);
        superior.setLayout(superiorLayout);
        superiorLayout.setHorizontalGroup(
            superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(superiorLayout.createSequentialGroup()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 393, Short.MAX_VALUE)
                .addComponent(CERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        superiorLayout.setVerticalGroup(
            superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(superiorLayout.createSequentialGroup()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        inferior.setBackground(new java.awt.Color(153, 153, 153));
        inferior.setForeground(new java.awt.Color(255, 255, 255));

        inicio.setBackground(new java.awt.Color(153, 153, 153));
        inicio.setForeground(new java.awt.Color(255, 255, 255));

        Inicio.setBackground(new java.awt.Color(102, 102, 102));
        Inicio.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inicio.setText("INICIO");
        Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InicioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        movimiento.setBackground(new java.awt.Color(153, 153, 153));
        movimiento.setForeground(new java.awt.Color(255, 255, 255));
        movimiento.setPreferredSize(new java.awt.Dimension(184, 48));

        Movimiento.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Movimiento.setForeground(new java.awt.Color(255, 255, 255));
        Movimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Movimiento.setText("MOVIMIENTOS");
        Movimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Movimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MovimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MovimientoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovimientoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout movimientoLayout = new javax.swing.GroupLayout(movimiento);
        movimiento.setLayout(movimientoLayout);
        movimientoLayout.setHorizontalGroup(
            movimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Movimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );
        movimientoLayout.setVerticalGroup(
            movimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Movimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        evento.setBackground(new java.awt.Color(153, 153, 153));
        evento.setForeground(new java.awt.Color(255, 255, 255));
        evento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        evento.setPreferredSize(new java.awt.Dimension(149, 48));

        Evento.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Evento.setForeground(new java.awt.Color(255, 255, 255));
        Evento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Evento.setText("NOTICIAS");
        Evento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Evento.setPreferredSize(new java.awt.Dimension(44, 17));
        Evento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EventoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EventoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EventoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout eventoLayout = new javax.swing.GroupLayout(evento);
        evento.setLayout(eventoLayout);
        eventoLayout.setHorizontalGroup(
            eventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Evento, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );
        eventoLayout.setVerticalGroup(
            eventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Evento, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        perfil.setBackground(new java.awt.Color(153, 153, 153));
        perfil.setForeground(new java.awt.Color(255, 255, 255));
        perfil.setPreferredSize(new java.awt.Dimension(149, 48));

        Perfil.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Perfil.setForeground(new java.awt.Color(255, 255, 255));
        Perfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Perfil.setText("PERFIL");
        Perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PerfilMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PerfilMousePressed(evt);
            }
        });

        javax.swing.GroupLayout perfilLayout = new javax.swing.GroupLayout(perfil);
        perfil.setLayout(perfilLayout);
        perfilLayout.setHorizontalGroup(
            perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );
        perfilLayout.setVerticalGroup(
            perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        noticias.setBackground(new java.awt.Color(153, 153, 153));
        noticias.setPreferredSize(new java.awt.Dimension(121, 48));

        notice.setFont(new java.awt.Font("Roboto Black", 3, 14)); // NOI18N
        notice.setForeground(new java.awt.Color(255, 255, 255));
        notice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notice.setText("EVENTOS");
        notice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noticeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                noticeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                noticeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout noticiasLayout = new javax.swing.GroupLayout(noticias);
        noticias.setLayout(noticiasLayout);
        noticiasLayout.setHorizontalGroup(
            noticiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notice, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        noticiasLayout.setVerticalGroup(
            noticiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notice, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout inferiorLayout = new javax.swing.GroupLayout(inferior);
        inferior.setLayout(inferiorLayout);
        inferiorLayout.setHorizontalGroup(
            inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(movimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(evento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noticias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        inferiorLayout.setVerticalGroup(
            inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(noticias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(inferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 60));

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        background.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 800, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_superiorMousePressed

    private void superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_superiorMouseDragged

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        System.exit(0);
    }//GEN-LAST:event_salirMousePressed

    private void InicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseEntered
        inicio.setBackground(Color.gray);
    }//GEN-LAST:event_InicioMouseEntered

    private void InicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseExited
        inicio.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_InicioMouseExited

    private void MovimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMouseEntered
        movimiento.setBackground(Color.gray);
    }//GEN-LAST:event_MovimientoMouseEntered

    private void MovimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMouseExited
        movimiento.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_MovimientoMouseExited

    private void EventoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventoMouseEntered
        evento.setBackground(Color.gray);
    }//GEN-LAST:event_EventoMouseEntered

    private void EventoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventoMouseExited
        evento.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_EventoMouseExited

    private void PerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMouseEntered
        perfil.setBackground(Color.gray);
    }//GEN-LAST:event_PerfilMouseEntered

    private void PerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMouseExited
        perfil.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_PerfilMouseExited

    private void cerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMousePressed
        sesion s1 = new sesion();
        s1.setLocation(this.getLocation());
        s1.setVisible(true);
        s1.show();
        dispose();
    }//GEN-LAST:event_cerrarSesionMousePressed

    private void InicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMousePressed
        Inicio I1 = new Inicio();
        I1.setSize(800, 410);
        I1.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(I1, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_InicioMousePressed

    private void MovimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMousePressed
        Movimientos M1 = new Movimientos();
        M1.setSize(800,410);
        M1.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(M1, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_MovimientoMousePressed

    private void EventoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventoMousePressed
        Eventos E1 = new Eventos();
        E1.setSize(800,410);
        E1.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(E1, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_EventoMousePressed

    private void PerfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMousePressed
        Perfil p1 = new Perfil();
        p1.setSize(800,410);
        p1.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(p1, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_PerfilMousePressed

    private void noticeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noticeMouseEntered
        noticias.setBackground(Color.gray);
    }//GEN-LAST:event_noticeMouseEntered

    private void noticeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noticeMouseExited
        noticias.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_noticeMouseExited

    private void noticeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noticeMousePressed
        if(Usuarios.getUsuarioActivo().equals("admin")){
            NoticiasAdmin n1 = new NoticiasAdmin();
            n1.setSize(800,410);
            n1.setLocation(0, 0);
            contenido.removeAll();
            contenido.add(n1, BorderLayout.CENTER);
            contenido.revalidate();
            contenido.repaint();
        } else {
        
            Noticias n2 = new Noticias();
            n2.setSize(800,410);
            n2.setLocation(0, 0);
            contenido.removeAll();
            contenido.add(n2, BorderLayout.CENTER);
            contenido.revalidate();
            contenido.repaint();
        }
    }//GEN-LAST:event_noticeMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }
    
    private void setDate(){
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        fecha.setText(now.format(DateTimeFormatter.ofPattern("EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
    private void initContent(){
        principal p1 = new principal();
        p1.setSize(800,410);
        p1.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(p1, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CERRAR;
    private javax.swing.JLabel Evento;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel Movimiento;
    private javax.swing.JLabel Perfil;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JLabel cerrarSesion;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel evento;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel inferior;
    private javax.swing.JPanel inicio;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel movimiento;
    private javax.swing.JLabel notice;
    private javax.swing.JPanel noticias;
    private javax.swing.JPanel perfil;
    private javax.swing.JLabel salir;
    private javax.swing.JPanel superior;
    // End of variables declaration//GEN-END:variables
}
