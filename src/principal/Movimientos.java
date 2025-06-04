/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import Clases.Usuarios;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author prueb
 */
public class Movimientos extends javax.swing.JPanel {

    public Movimientos() {
        initComponents();
        costumizeMovimientoTable();
        costumizeRowColors();
        cargarMovimientos();
    }
    
    private DefaultTableModel movimientosModel;
    
    public void cargarMovimientos(){
        DefaultTableModel modelo = (DefaultTableModel) movements.getModel();
        modelo.setRowCount(0);
        
        Usuarios usuario = Usuarios.obtenerUsuarioActivo();
        String nombreUsuario = usuario.getUser();
        String celularUsuario = usuario.getCelular();
        
        try(BufferedReader reader = new BufferedReader(new FileReader("movimientos.txt"))){
            String linea;
            while((linea = reader.readLine()) != null){
                String[] dato = linea.split(",");
                
                if (dato.length == 4){
                    String fecha = dato[0];
                    String usuarioRemitente = dato[1];
                    String celularDestino = dato[2];
                    double monto = Double.parseDouble(dato[3]);
                    
                    Usuarios receptor = Usuarios.buscarPorTelefono(celularDestino);
                    String nombreDestino = (receptor != null) ? receptor.getUser() : "Desconocido";
                    
                    if(usuarioRemitente.equals(nombreUsuario) || celularDestino.equals(celularUsuario)){
                        String tipoTransaccion;
                        
                        if(usuarioRemitente.equals(nombreUsuario)){
                            tipoTransaccion = "Enviado a " + nombreDestino;
                        } else {
                            tipoTransaccion = "Recibido de " + usuarioRemitente;
                        }
                        Object[] fila = {fecha,tipoTransaccion,String.format("$%,.2f", Math.abs(monto))};
                        modelo.addRow(fila);
                    }
                }
            }
        } catch (IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al leer movimientos");
        }
    }
    
    private void costumizeRowColors(){
        movements.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, 
                    boolean isSelected, boolean hasFocus, int row,  int column){
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String tipo = (String) table.getModel().getValueAt(row, 2);
                
                if(isSelected){
                    c.setBackground(new Color(220,240,255));
                }else{
                    c.setBackground(Color.white);
                }
                
                if (column == 3){
                    c.setForeground(tipo.equals("Enviado") ? new Color(200,50,50) : new Color(50,150,150));
                    ((JLabel) c).setHorizontalAlignment(SwingConstants.RIGHT);
                }
                return c;
            }
        });
    }
    
    private void costumizeMovimientoTable(){
        JTableHeader header = movements.getTableHeader();
        
        header.setDefaultRenderer(new DefaultTableCellRenderer(){
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean
                hasFocus, int row, int column){
            JLabel label = (JLabel) super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
            
            
            
            label.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(200,200,200)));
            label.setOpaque(true);
            label.setBackground(new Color(245,245,245));
            label.setForeground(new Color(70,70,70));
            
            return label;
        }
    });
        
        header.setPreferredSize(new Dimension(header.getWidth(), 30));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        regresar = new javax.swing.JPanel();
        regreso = new javax.swing.JLabel();
        movement = new javax.swing.JScrollPane();
        movements = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        Inscripcion = new javax.swing.JPanel();
        Inscription = new javax.swing.JLabel();
        VerTodo = new javax.swing.JPanel();
        ViewAll = new javax.swing.JLabel();

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

        movements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Transacción", "Monto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        movement.setViewportView(movements);

        Title.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        Title.setText("¿Qué acción va a realizar?");

        Inscripcion.setBackground(new java.awt.Color(51, 51, 51));

        Inscription.setFont(new java.awt.Font("Roboto Condensed Medium", 2, 14)); // NOI18N
        Inscription.setForeground(new java.awt.Color(255, 255, 255));
        Inscription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inscription.setText("TRANSFERIR");
        Inscription.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InscriptionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout InscripcionLayout = new javax.swing.GroupLayout(Inscripcion);
        Inscripcion.setLayout(InscripcionLayout);
        InscripcionLayout.setHorizontalGroup(
            InscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Inscription, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );
        InscripcionLayout.setVerticalGroup(
            InscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Inscription, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        VerTodo.setBackground(new java.awt.Color(51, 51, 51));
        VerTodo.setPreferredSize(new java.awt.Dimension(284, 55));

        ViewAll.setFont(new java.awt.Font("Roboto Condensed Medium", 2, 14)); // NOI18N
        ViewAll.setForeground(new java.awt.Color(255, 255, 255));
        ViewAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAll.setText("VER TODOS LOS MOVIMIENTOS");
        ViewAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout VerTodoLayout = new javax.swing.GroupLayout(VerTodo);
        VerTodo.setLayout(VerTodoLayout);
        VerTodoLayout.setHorizontalGroup(
            VerTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        VerTodoLayout.setVerticalGroup(
            VerTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewAll, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(movement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addComponent(Title)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(VerTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Inscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(Title))
                            .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Inscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(VerTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 147, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(movement, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
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

    private void InscriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InscriptionMouseClicked
        Transferencia t1 = new Transferencia();
        t1.setSize(800,410);
        t1.setLocation(0,0);
        
        background.removeAll();
        background.add(t1, BorderLayout.CENTER);
        background.revalidate();
        background.repaint();
    }//GEN-LAST:event_InscriptionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inscripcion;
    private javax.swing.JLabel Inscription;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel VerTodo;
    private javax.swing.JLabel ViewAll;
    private javax.swing.JPanel background;
    private javax.swing.JScrollPane movement;
    private javax.swing.JTable movements;
    private javax.swing.JPanel regresar;
    private javax.swing.JLabel regreso;
    // End of variables declaration//GEN-END:variables
}
