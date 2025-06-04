/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import Clases.Usuarios;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author prueb
 */
public class Transferencia extends javax.swing.JPanel {

    /**
     * Creates new form Transferencia
     */
    public Transferencia() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Izquierda = new javax.swing.JPanel();
        escudo = new javax.swing.JLabel();
        TITULO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DutsTransferencia = new javax.swing.JPanel();
        dutsTransfer = new javax.swing.JTextField();
        CelularTransferencia = new javax.swing.JPanel();
        celTransfer = new javax.swing.JTextField();
        btnCancelar2 = new javax.swing.JPanel();
        cancelar2 = new javax.swing.JLabel();
        TransferirMonto = new javax.swing.JPanel();
        Transferencia = new javax.swing.JLabel();
        Duts = new javax.swing.JLabel();
        textoBasico = new javax.swing.JLabel();
        NumCelular = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        jLabel1.setText("TRANSFERENCIAS");

        DutsTransferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dutsTransfer.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        dutsTransfer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dutsTransfer.setText("DUTS");
        dutsTransfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dutsTransferMousePressed(evt);
            }
        });

        javax.swing.GroupLayout DutsTransferenciaLayout = new javax.swing.GroupLayout(DutsTransferencia);
        DutsTransferencia.setLayout(DutsTransferenciaLayout);
        DutsTransferenciaLayout.setHorizontalGroup(
            DutsTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dutsTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        DutsTransferenciaLayout.setVerticalGroup(
            DutsTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dutsTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        CelularTransferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        celTransfer.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        celTransfer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        celTransfer.setText("Celular");
        celTransfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                celTransferMousePressed(evt);
            }
        });

        javax.swing.GroupLayout CelularTransferenciaLayout = new javax.swing.GroupLayout(CelularTransferencia);
        CelularTransferencia.setLayout(CelularTransferenciaLayout);
        CelularTransferenciaLayout.setHorizontalGroup(
            CelularTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(celTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        CelularTransferenciaLayout.setVerticalGroup(
            CelularTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(celTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        btnCancelar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelar2.setFont(new java.awt.Font("Roboto Condensed", 2, 14)); // NOI18N
        cancelar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelar2.setText("CANCELAR");
        cancelar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCancelar2Layout = new javax.swing.GroupLayout(btnCancelar2);
        btnCancelar2.setLayout(btnCancelar2Layout);
        btnCancelar2Layout.setHorizontalGroup(
            btnCancelar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        btnCancelar2Layout.setVerticalGroup(
            btnCancelar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TransferirMonto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TransferirMonto.setPreferredSize(new java.awt.Dimension(177, 45));

        Transferencia.setFont(new java.awt.Font("Roboto Condensed", 2, 14)); // NOI18N
        Transferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Transferencia.setText("TRANSFERIR");
        Transferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Transferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransferenciaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TransferirMontoLayout = new javax.swing.GroupLayout(TransferirMonto);
        TransferirMonto.setLayout(TransferirMontoLayout);
        TransferirMontoLayout.setHorizontalGroup(
            TransferirMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Transferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        TransferirMontoLayout.setVerticalGroup(
            TransferirMontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Transferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        Duts.setFont(new java.awt.Font("Roboto Condensed Black", 3, 14)); // NOI18N
        Duts.setText("Duts a transferir:");

        textoBasico.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        textoBasico.setText("Rellene el formulario con los datos de la persona a quien le va a enviar DUTS");

        NumCelular.setFont(new java.awt.Font("Roboto Condensed Black", 3, 14)); // NOI18N
        NumCelular.setText("Numero de celular:");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(Izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addComponent(Duts)
                                .addGap(62, 62, 62)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CelularTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DutsTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addComponent(TransferirMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(textoBasico)))
                .addGap(272, 272, 272))
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(324, 324, 324)
                    .addComponent(NumCelular)
                    .addContainerGap(560, Short.MAX_VALUE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(Izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoBasico)
                .addGap(46, 46, 46)
                .addComponent(CelularTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DutsTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Duts, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TransferirMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(NumCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGap(264, 264, 264)))
        );

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void cancelar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar2MouseClicked
        Movimientos m1 = new Movimientos();
        m1.setSize(800, 410);
        m1.setLocation(0,0);
        
        background.removeAll();
        background.add(m1, BorderLayout.CENTER);
        background.revalidate();
        background.repaint();
    }//GEN-LAST:event_cancelar2MouseClicked

    private void celTransferMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_celTransferMousePressed
        if (celTransfer.getText().equals("Celular")){
        celTransfer.setText("");
        celTransfer.setForeground(Color.black);
        }
        if (dutsTransfer.getText().isEmpty()){
        dutsTransfer.setText("DUTS");
        dutsTransfer.setForeground(Color.black);
        }
    }//GEN-LAST:event_celTransferMousePressed

    private void dutsTransferMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dutsTransferMousePressed
        if (celTransfer.getText().isEmpty()){
        celTransfer.setText("Celular");
        celTransfer.setForeground(Color.black);
        }
        if (dutsTransfer.getText().equals("DUTS")){
        dutsTransfer.setText("");
        dutsTransfer.setForeground(Color.black);
        }
    }//GEN-LAST:event_dutsTransferMousePressed

    private void TransferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransferenciaMouseClicked
        String celularReceptor = celTransfer.getText().trim();
        String montoTransfer = dutsTransfer.getText().trim();
        
        try{
            double monto = Double.parseDouble(montoTransfer);
            String emisorUser = Usuarios.getUsuarioActivo();
            
            if(Usuarios.transferir(emisorUser, celularReceptor, monto)){
                celTransfer.setText("");
                dutsTransfer.setText("");
                Movimientos m1 = new Movimientos();
                m1.setSize(800, 410);
                m1.setLocation(0,0);
                
                System.out.println("se ha realizado la transrencia");
                background.removeAll();
                background.add(m1, BorderLayout.CENTER);
                background.revalidate();
                background.repaint();
                    }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido");
        }
    }//GEN-LAST:event_TransferenciaMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CelularTransferencia;
    private javax.swing.JLabel Duts;
    private javax.swing.JPanel DutsTransferencia;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JLabel NumCelular;
    private javax.swing.JLabel TITULO;
    private javax.swing.JLabel Transferencia;
    private javax.swing.JPanel TransferirMonto;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnCancelar1;
    private javax.swing.JPanel btnCancelar2;
    private javax.swing.JLabel cancelar;
    private javax.swing.JLabel cancelar1;
    private javax.swing.JLabel cancelar2;
    private javax.swing.JTextField celTransfer;
    private javax.swing.JTextField dutsTransfer;
    private javax.swing.JLabel escudo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel textoBasico;
    // End of variables declaration//GEN-END:variables
}
