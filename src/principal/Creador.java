/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import Clases.Evento;
import Clases.Usuarios;
import java.awt.*;
import java.io.File;
import java.time.LocalDate;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import principal.NoticiasAdmin;


public class Creador extends javax.swing.JPanel {
    private String rutaImg;

    public Creador() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Izquierda = new javax.swing.JPanel();
        escudo = new javax.swing.JLabel();
        TITULO = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        cancelar = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        Foto = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        seleccion = new javax.swing.JPanel();
        selectImg = new javax.swing.JLabel();
        creation = new javax.swing.JPanel();
        crear = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcione = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        premios = new javax.swing.JPanel();
        DUTS = new javax.swing.JTextField();

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

        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelar.setFont(new java.awt.Font("Roboto Condensed", 2, 14)); // NOI18N
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
            .addComponent(cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
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
        selectImg.setText("Seleccionar foto Evento..");
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

        creation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        creation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creation.setPreferredSize(new java.awt.Dimension(111, 38));

        crear.setFont(new java.awt.Font("Roboto Condensed", 2, 14)); // NOI18N
        crear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crear.setText("CREAR EVENTO");
        crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout creationLayout = new javax.swing.GroupLayout(creation);
        creation.setLayout(creationLayout);
        creationLayout.setHorizontalGroup(
            creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crear, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );
        creationLayout.setVerticalGroup(
            creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Roboto Black", 3, 14)); // NOI18N
        jLabel2.setText("Nombre evento:");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 3, 14)); // NOI18N
        jLabel3.setText("Descripción del evento:");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titulo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titulo.setText("Titulo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descripcione.setColumns(20);
        descripcione.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        descripcione.setRows(5);
        jScrollPane1.setViewportView(descripcione);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Roboto Black", 3, 14)); // NOI18N
        jLabel4.setText("Premio del Evento");

        premios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DUTS.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        DUTS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DUTS.setText("Premio");

        javax.swing.GroupLayout premiosLayout = new javax.swing.GroupLayout(premios);
        premios.setLayout(premiosLayout);
        premiosLayout.setHorizontalGroup(
            premiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DUTS)
        );
        premiosLayout.setVerticalGroup(
            premiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DUTS, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(premios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(creation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(Izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(Izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(premios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(creation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        NoticiasAdmin m1 = new NoticiasAdmin();
        m1.setSize(800, 410);
        m1.setLocation(0,0);

        background.removeAll();
        background.add(m1, BorderLayout.CENTER);
        background.revalidate();
        background.repaint();
    }//GEN-LAST:event_cancelarMouseClicked

    private void selectImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectImgMouseClicked
        JFileChooser seleccionar = new JFileChooser();
        seleccionar.setDialogTitle("Selecciona tu foto de perfil");

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "jpg", "jpeg", "png", "gif");
        seleccionar.setFileFilter(filtro);

        int resultado = seleccionar.showOpenDialog(this);

        if(resultado == JFileChooser.APPROVE_OPTION){
            File archivo = seleccionar.getSelectedFile();
            rutaImg = archivo.getAbsolutePath();
        }
    }//GEN-LAST:event_selectImgMouseClicked

    private void crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseClicked
        
        if(titulo.getText().isEmpty() || descripcione.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "faltan datos por rellenar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Evento nuevoEvento = new Evento(
        titulo.getText(),
        descripcione.getText(),
        LocalDate.now(),
        Double.parseDouble(DUTS.getText())
        );
        
        if(rutaImg != null){
            nuevoEvento.setRutaImg(rutaImg);
        }
        
        Usuarios.agregarEvento(nuevoEvento);
        JOptionPane.showMessageDialog(this, "Evento creado: " + nuevoEvento.getNombre());
        limpiarcampos();
        
        NoticiasAdmin n1 = new NoticiasAdmin();
        n1.setSize(800, 410);
        n1.setLocation(0,0);

        background.removeAll();
        background.add(n1, BorderLayout.CENTER);
        background.revalidate();
        background.repaint();
    }
        
        private void limpiarcampos(){
        titulo.setText("");
        descripcione.setText("");
        DUTS.setText("0");
        rutaImg = null;

    }//GEN-LAST:event_crearMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DUTS;
    private javax.swing.JPanel Foto;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JLabel TITULO;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JLabel cancelar;
    private javax.swing.JLabel crear;
    private javax.swing.JPanel creation;
    private javax.swing.JTextArea descripcione;
    private javax.swing.JLabel escudo;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel premios;
    private javax.swing.JPanel seleccion;
    private javax.swing.JLabel selectImg;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
