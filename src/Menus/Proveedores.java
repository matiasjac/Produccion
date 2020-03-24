
package Menus;

import clases.comandos;
import clases.conexion;
import clases.configuracion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Proveedores extends javax.swing.JPanel {

    conexion co = new conexion();
    comandos c = new comandos();
    configuracion conf = new configuracion();
    int mod = 0;
    public Proveedores() {
        initComponents();
        co.Conexion();
        ActualizaTabla();
        nombres.requestFocus();
    }
    
    public void ActualizaTabla(){
        DefaultTableModel md = (DefaultTableModel)registros.getModel();
        md.setRowCount(0);
        ResultSet s = c.consulta("select PROV_CODIGO, PROV_DESCRIPCION from PROVEEDORES where PROV_ESTADO='AC' order by PROV_CODIGO asc");
        try {
            while(s.next()){
                Object v[]= new Object[2];
                v[0] = s.getObject(1);
                v[1] = s.getString(2);
                md.addRow(v);
            }
            registros.setModel(md);
        } catch (SQLException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        registros = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRES Y APELLIDOS:");

        nombres.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombresKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel7.setText("CODIGO:");

        codigo.setEditable(false);
        codigo.setBackground(new java.awt.Color(255, 255, 255));
        codigo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 1, 18))); // NOI18N

        registros.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombres y Apellidos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(registros);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 1, 14))); // NOI18N

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar.png"))); // NOI18N
        agregar.setBorder(null);
        agregar.setBorderPainted(false);
        agregar.setContentAreaFilled(false);
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        modificar.setBorder(null);
        modificar.setBorderPainted(false);
        modificar.setContentAreaFilled(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        eliminar.setBorder(null);
        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        guardar.setBorder(null);
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(guardar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardar)
                    .addComponent(agregar)
                    .addComponent(modificar)
                    .addComponent(eliminar))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo)
                            .addComponent(nombres)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PROVEEDORES", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jTabbedPane1)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jTabbedPane1)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombresKeyReleased

    }//GEN-LAST:event_nombresKeyReleased

    private void nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombresKeyTyped
        char n = evt.getKeyChar();
        if(Character.isLetter(n)){
            String cad = (""+n).toUpperCase();
            n=cad.charAt(0);
            evt.setKeyChar(n);
        }
    }//GEN-LAST:event_nombresKeyTyped

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        nombres.requestFocus();
        conf.borrar_texto(new Object[]{codigo,nombres});
        mod=0;
    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if(registros.getSelectedRowCount()>0){
            codigo.setText(""+registros.getValueAt(registros.getSelectedRow(),0));
            nombres.setText(""+registros.getValueAt(registros.getSelectedRow(),1));
            registros.clearSelection();
            nombres.requestFocus();
            mod = 1;
        }else{
            conf.mensaje(2,"Debe seleccionar al menos un registro","Programa");
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(registros.getSelectedRowCount()>0){
            String prov_cod = String.valueOf(registros.getValueAt(registros.getSelectedRow(),0));
            String nom = String.valueOf(registros.getValueAt(registros.getSelectedRow(),1));
            try {
                c.ejecutar("call PROC_ABM_PROVEEDORES("+prov_cod+",'"+nom+"','IN')");
                conf.mensaje(3,"Se ha eliminado correctamente","Programa");
                agregar.doClick();
                registros.clearSelection();
                ActualizaTabla();
            } catch (SQLException ex) {
                Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            conf.mensaje(2,"Debe seleccionar al menos un registro","Programa");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String nom = nombres.getText();
        if(mod==0){
            try {
                c.ejecutar("call PROC_ABM_PROVEEDORES(null,'"+nom+"','AC')");
                conf.mensaje(3,"Se ha agregado correctamente","Programa");
                agregar.doClick();
                ActualizaTabla();
            } catch (SQLException ex) {
                Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            try {
                c.ejecutar("call PROC_ABM_PROVEEDORES("+codigo.getText()+",'"+nom+"','AC')");
                conf.mensaje(3,"Se ha modificado correctamente","Programa");
                agregar.doClick();
                ActualizaTabla();
            } catch (SQLException ex) {
                Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombres;
    private javax.swing.JTable registros;
    // End of variables declaration//GEN-END:variables
}
