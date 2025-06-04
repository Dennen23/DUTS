/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import Clases.Usuarios;
import java.awt.BorderLayout;
import java.awt.Color;

public class Inicio extends javax.swing.JPanel {

    
    public Inicio() {
        initComponents();
        actualizarDatos();
    }
    
    //actualizar saldo
    
    public void actualizarDatos(){
        Usuarios usuario = Usuarios.obtenerUsuarioActivo();
        
        if(usuario != null){
            double saldo = usuario.getSaldo();
            
            Saldo.setText("$" + saldo);
            pmensual.setText("$" + usuario.getPromedioMensual());
            psemestre.setText("$" + usuario.getPromedioSemestral());
            panual.setText("$" + usuario.getPromedioAnual());
        } else {
            System.out.println("No hay usuario activo");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pilar1 = new javax.swing.JPanel();
        regresar = new javax.swing.JPanel();
        regreso = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Disponible1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Mensual = new javax.swing.JLabel();
        Semestral = new javax.swing.JLabel();
        Anual = new javax.swing.JLabel();
        pmensual = new javax.swing.JLabel();
        psemestre = new javax.swing.JLabel();
        panual = new javax.swing.JLabel();
        fondo2 = new javax.swing.JPanel();
        Disponible = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();

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

        javax.swing.GroupLayout pilar1Layout = new javax.swing.GroupLayout(pilar1);
        pilar1.setLayout(pilar1Layout);
        pilar1Layout.setHorizontalGroup(
            pilar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pilar1Layout.createSequentialGroup()
                .addGap(0, 67, Short.MAX_VALUE)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pilar1Layout.setVerticalGroup(
            pilar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pilar1Layout.createSequentialGroup()
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Disponible1.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        Disponible1.setText("PROMEDIOS:");

        Mensual.setFont(new java.awt.Font("Roboto Condensed Black", 1, 14)); // NOI18N
        Mensual.setForeground(new java.awt.Color(102, 102, 102));
        Mensual.setText("Mensual");

        Semestral.setFont(new java.awt.Font("Roboto Condensed Black", 1, 14)); // NOI18N
        Semestral.setForeground(new java.awt.Color(102, 102, 102));
        Semestral.setText("Semestral");

        Anual.setFont(new java.awt.Font("Roboto Condensed Black", 1, 14)); // NOI18N
        Anual.setForeground(new java.awt.Color(102, 102, 102));
        Anual.setText("Anual");

        pmensual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pmensual.setText("jLabel4");

        psemestre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        psemestre.setText("jLabel4");

        panual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panual.setText("jLabel4");

        fondo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Disponible.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        Disponible.setText("SU SALDO DISPONIBLE ES:");

        Saldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Saldo.setText("jLabel1");

        javax.swing.GroupLayout fondo2Layout = new javax.swing.GroupLayout(fondo2);
        fondo2.setLayout(fondo2Layout);
        fondo2Layout.setHorizontalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondo2Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Disponible)
                        .addGroup(fondo2Layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(Saldo)))
                    .addContainerGap(105, Short.MAX_VALUE)))
        );
        fondo2Layout.setVerticalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fondo2Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(Disponible)
                    .addGap(6, 6, 6)
                    .addComponent(Saldo)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(Disponible1)
                                .addGap(0, 258, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Mensual)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(pmensual)))
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(Semestral))
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGap(204, 204, 204)
                                        .addComponent(psemestre)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panual)
                                    .addComponent(Anual))
                                .addGap(16, 16, 16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)))
                .addComponent(pilar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pilar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Disponible1)
                .addGap(47, 47, 47)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mensual)
                    .addComponent(Semestral)
                    .addComponent(Anual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pmensual)
                    .addComponent(psemestre)
                    .addComponent(panual))
                .addContainerGap(149, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anual;
    private javax.swing.JLabel Disponible;
    private javax.swing.JLabel Disponible1;
    private javax.swing.JLabel Mensual;
    private javax.swing.JLabel Saldo;
    private javax.swing.JLabel Semestral;
    private javax.swing.JPanel background;
    private javax.swing.JPanel fondo2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel panual;
    private javax.swing.JPanel pilar1;
    private javax.swing.JLabel pmensual;
    private javax.swing.JLabel psemestre;
    private javax.swing.JPanel regresar;
    private javax.swing.JLabel regreso;
    // End of variables declaration//GEN-END:variables
}
