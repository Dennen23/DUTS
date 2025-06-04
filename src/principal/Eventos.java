/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prueb
 */
public class Eventos extends javax.swing.JPanel {

    /**
     * Creates new form Eventos
     */
    public Eventos() {
        initComponents();
        cargarEventos();
    }

    private void cargarEventos(){
        eventos.removeAll();
        eventos.setLayout(new BoxLayout(eventos, BoxLayout.Y_AXIS));
        
        JLabel lblCargando = new JLabel("Cargando...");
        eventos.add(lblCargando);
        eventos.revalidate();
        
        new SwingWorker<List<JPanel>, Void>(){
            @Override
            protected List<JPanel> doInBackground() throws Exception{
                List<JPanel> tarjetas = new ArrayList<>();
        try {
            Document doc = Jsoup.connect("https://www.uts.edu.co/sitio/noticias/")
                    .userAgent("Mozilla/5.0(Windows NT 10.0; Win64;x64) AppleWebKit/537.36")
                    .timeout(10000).get();
            Elements noticias = doc.select("div[id^='post-']");
            

            
            for (Element noticia : noticias){
                String imgUrl="";
                
                Element tituloElement = noticia.select("h4.entry-title").first();
                String titulo = tituloElement != null ? tituloElement.text() : tituloElement.ownText();
                
                Element imgElement = noticia.select("img.wp-post-image, img.attachment-thumbnail").first();
                if(imgElement != null){
                    imgUrl=imgElement.attr("src");
                }
                
                String descripcion = noticia.select("div.entry-content, p").text();
                String enlace = noticia.select("a").attr("abs:href");

                JPanel tarjeta = crearTarjetas(titulo, imgUrl, descripcion, enlace);
                tarjetas.add(tarjeta);
                
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return tarjetas;
    }
    @Override
    protected void done(){
        try{
            eventos.removeAll();
            
            List<JPanel> tarjetas = get();
            
            for(JPanel tarjeta : tarjetas){
                eventos.add(tarjeta);
                eventos.add(Box.createRigidArea(new Dimension(0,10)));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        eventos.revalidate();
        eventos.repaint();
    }
    }.execute();
    }
    
    private JPanel crearTarjetas(String titulo, String imgUrl, String descripcion, String enlace){
        JPanel cardPanel = new JPanel (new BorderLayout(10,10));
        cardPanel.setBorder(BorderFactory.createLineBorder(new Color(200,200,200)));
        
        JPanel topPanel = new JPanel(new BorderLayout(10, 10));
    
    // Imagen
    JLabel lblImagen = new JLabel();
    try {
        ImageIcon icon = new ImageIcon(new URL(imgUrl));
        Image img = icon.getImage().getScaledInstance(120, 90, Image.SCALE_SMOOTH);
        lblImagen.setIcon(new ImageIcon(img));
    } catch (Exception e) {
        lblImagen.setIcon(new ImageIcon("src/imagenes/placeholder.png")); // Imagen por defecto
    }
    topPanel.add(lblImagen, BorderLayout.WEST);

    // Título
    JLabel lblTitulo = new JLabel(titulo);
    lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 14));
    topPanel.add(lblTitulo, BorderLayout.CENTER);

    //Descripción
    JTextArea txtDesc = new JTextArea(descripcion);
    txtDesc.setEditable(false);
    txtDesc.setLineWrap(true);
    txtDesc.setBackground(new Color(240, 240, 240));

    //Botón Ver más
    JButton btnVerMas = new JButton("Ver más");
    btnVerMas.addActionListener(e -> {
        try {
            Desktop.getDesktop().browse(new URI("https://www.uts.edu.co/sitio/noticias/"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    });

    // Ensamblar todo
    cardPanel.add(topPanel, BorderLayout.NORTH);
    cardPanel.add(new JScrollPane(txtDesc), BorderLayout.CENTER);
    cardPanel.add(btnVerMas, BorderLayout.SOUTH);
        return cardPanel;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        background = new javax.swing.JPanel();
        regresar = new javax.swing.JPanel();
        regreso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventos = new javax.swing.JPanel();

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

        javax.swing.GroupLayout eventosLayout = new javax.swing.GroupLayout(eventos);
        eventos.setLayout(eventosLayout);
        eventosLayout.setHorizontalGroup(
            eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        eventosLayout.setVerticalGroup(
            eventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(eventos);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
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
    private javax.swing.JPanel background;
    private javax.swing.JPanel eventos;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel regresar;
    private javax.swing.JLabel regreso;
    // End of variables declaration//GEN-END:variables
};
