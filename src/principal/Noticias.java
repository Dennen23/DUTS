/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import Clases.Evento;
import Clases.Usuarios;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author prueb
 */
public class Noticias extends javax.swing.JPanel {


    public Noticias() {
        initComponents();
        cargarEventos();
    }

    

    private void cargarEventos(){
        noticias.removeAll();
        noticias.setLayout(new javax.swing.BoxLayout(noticias, javax.swing.BoxLayout.Y_AXIS));
        
        List<Evento> eventos = Usuarios.cargarEventos();
        
        for(Evento evento : eventos){
            JPanel card = crearCarta(evento);
            noticias.add(card);
            noticias.add(Box.createRigidArea(new Dimension(0,10)));
        }
        
        noticias.revalidate();
        noticias.repaint();
    }
    
    private JPanel crearCarta(Evento evento) {
    // Panel principal de la card
    JPanel card = new JPanel();
    card.setLayout(new BorderLayout());
    card.setBackground(Color.WHITE);
    card.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(200, 200, 200)),
        BorderFactory.createEmptyBorder(10, 10, 10, 10)
    ));
    card.setPreferredSize(new Dimension(600, 120));

    // Parte izquierda (imagen)
    JLabel lblImagen = new JLabel();
    if (evento.getRutaImg() != null && !evento.getRutaImg().isEmpty()) {
        ImageIcon icono = new ImageIcon(evento.getRutaImg());
        Image imagen = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lblImagen.setIcon(new ImageIcon(imagen));
    } else {
        lblImagen.setIcon(new ImageIcon("src/imagenes/default_event.png")); // Imagen por defecto
    }
    lblImagen.setHorizontalAlignment(JLabel.CENTER);
    card.add(lblImagen, BorderLayout.WEST);

    // Parte central (datos)
    JPanel panelDatos = new JPanel();
    panelDatos.setLayout(new BoxLayout(panelDatos, BoxLayout.Y_AXIS));
    panelDatos.setBackground(Color.WHITE);
    
    JLabel lblTitulo = new JLabel(evento.getNombre());
    lblTitulo.setFont(new Font("Roboto", Font.BOLD, 16));
    
    JLabel lblDescripcion = new JLabel("<html>" + evento.getDescripcion() + "</html>");
    lblDescripcion.setFont(new Font("Roboto", Font.PLAIN, 12));
    
    JLabel lblPremio = new JLabel("Premio: $" + evento.getPremio());
    lblPremio.setFont(new Font("Roboto", Font.BOLD, 14));
    lblPremio.setForeground(new Color(0, 150, 0));
    
    panelDatos.add(lblTitulo);
    panelDatos.add(Box.createRigidArea(new Dimension(0, 5)));
    panelDatos.add(lblDescripcion);
    panelDatos.add(Box.createRigidArea(new Dimension(0, 5)));
    panelDatos.add(lblPremio);
    
    card.add(panelDatos, BorderLayout.CENTER);

    return card;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        regresar = new javax.swing.JPanel();
        regreso = new javax.swing.JLabel();
        laterales = new javax.swing.JScrollPane();
        noticias = new javax.swing.JPanel();
        Inscripcion = new javax.swing.JPanel();
        inscripcion = new javax.swing.JLabel();
        Cancelar = new javax.swing.JPanel();
        eliminarInscr = new javax.swing.JLabel();

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

        laterales.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout noticiasLayout = new javax.swing.GroupLayout(noticias);
        noticias.setLayout(noticiasLayout);
        noticiasLayout.setHorizontalGroup(
            noticiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        noticiasLayout.setVerticalGroup(
            noticiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        laterales.setViewportView(noticias);

        Inscripcion.setBackground(new java.awt.Color(51, 51, 51));

        inscripcion.setFont(new java.awt.Font("Roboto Black", 3, 14)); // NOI18N
        inscripcion.setForeground(new java.awt.Color(255, 255, 255));
        inscripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inscripcion.setText("INSCRIBIRSE");
        inscripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inscripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inscripcionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout InscripcionLayout = new javax.swing.GroupLayout(Inscripcion);
        Inscripcion.setLayout(InscripcionLayout);
        InscripcionLayout.setHorizontalGroup(
            InscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inscripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        InscripcionLayout.setVerticalGroup(
            InscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inscripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        );

        Cancelar.setBackground(new java.awt.Color(51, 51, 51));
        Cancelar.setPreferredSize(new java.awt.Dimension(187, 77));

        eliminarInscr.setFont(new java.awt.Font("Roboto Black", 3, 14)); // NOI18N
        eliminarInscr.setForeground(new java.awt.Color(255, 255, 255));
        eliminarInscr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarInscr.setText("ELIMINAR INSCRIPCIÓN");
        eliminarInscr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout CancelarLayout = new javax.swing.GroupLayout(Cancelar);
        Cancelar.setLayout(CancelarLayout);
        CancelarLayout.setHorizontalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarInscr, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );
        CancelarLayout.setVerticalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarInscr, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(laterales, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Inscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(laterales)
                        .addContainerGap())
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Inscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void inscripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscripcionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_inscripcionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cancelar;
    private javax.swing.JPanel Inscripcion;
    private javax.swing.JPanel background;
    private javax.swing.JLabel eliminarInscr;
    private javax.swing.JLabel inscripcion;
    private javax.swing.JScrollPane laterales;
    private javax.swing.JPanel noticias;
    private javax.swing.JPanel regresar;
    private javax.swing.JLabel regreso;
    // End of variables declaration//GEN-END:variables
}
