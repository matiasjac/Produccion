
package Menus;

import clases.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JPanel {

    conexion co = new conexion();
    comandos c = new comandos();
    configuracion conf = new configuracion();
    int mod = 0;
    public Clientes() {
        initComponents();
        co.Conexion();
        ActualizaTabla();
        nombres.requestFocus();
    }

    public void ActualizaTabla(){
        DefaultTableModel md = (DefaultTableModel)registros.getModel();
        md.setRowCount(0);
        ResultSet s = c.consulta("select CLIE_CODIGO,CLIE_NOMBRE,CLIE_APELLIDO,CLIE_NRO_DOCUMENTO from clientes where CLIE_ESTADO='AC' order by clie_codigo asc");
        try {
            while(s.next()){
                Object v[]= new Object[6];
                v[0] = s.getObject(1);
                v[1] = s.getString(2);
                v[2] = s.getString(3);
                v[3]=s.getObject(4);
                v[4]="";
                v[5]="";
                md.addRow(v);
            }
            registros.setModel(md);
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        apellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        telefono = new javax.swing.JTextField();
        domicilio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        documento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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

        apellidos.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidosKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel6.setText("TELEFONO:");

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRES:");

        telefono.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        domicilio.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        domicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                domicilioKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel5.setText("DOMICILIO:");

        jLabel4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel4.setText("N° DOCUMENTO:");

        nombres.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombresKeyTyped(evt);
            }
        });

        documento.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                documentoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel3.setText("APELLIDOS:");

        jLabel7.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel7.setText("CODIGO:");

        codigo.setEditable(false);
        codigo.setBackground(new java.awt.Color(255, 255, 255));
        codigo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 1, 14))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N

        registros.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombres", "Apellidos", "N° Documento", "Domicilio", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 0, 14))); // NOI18N

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
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
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo)
                            .addComponent(nombres)
                            .addComponent(apellidos)
                            .addComponent(documento)
                            .addComponent(domicilio)
                            .addComponent(telefono)))
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
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CLIENTES", jPanel1);

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
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jTabbedPane1)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidosKeyTyped
        char n = evt.getKeyChar();
        if(Character.isLetter(n)){
            String cad = (""+n).toUpperCase();
            n=cad.charAt(0);
            evt.setKeyChar(n);
        }
    }//GEN-LAST:event_apellidosKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        char n = evt.getKeyChar();
        if(Character.isLetter(n)){
            String cad = (""+n).toUpperCase();
            n=cad.charAt(0);
            evt.setKeyChar(n);
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void domicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_domicilioKeyTyped
        char n = evt.getKeyChar();
        if(Character.isLetter(n)){
            String cad = (""+n).toUpperCase();
            n=cad.charAt(0);
            evt.setKeyChar(n);
        }
    }//GEN-LAST:event_domicilioKeyTyped

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

    private void documentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentoKeyTyped
        char n = evt.getKeyChar();
        if(Character.isLetter(n)){
            String cad = (""+n).toUpperCase();
            n=cad.charAt(0);
            evt.setKeyChar(n);
        }
    }//GEN-LAST:event_documentoKeyTyped

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        nombres.requestFocus();
        registros.clearSelection();
        conf.borrar_texto(new Object[]{codigo,nombres,apellidos,documento,domicilio,telefono});
        mod=0;
    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if(registros.getSelectedRowCount()>0){
            codigo.setText(""+registros.getValueAt(registros.getSelectedRow(),0));
            nombres.setText(""+registros.getValueAt(registros.getSelectedRow(),1));
            apellidos.setText(""+registros.getValueAt(registros.getSelectedRow(),2));
            documento.setText(""+registros.getValueAt(registros.getSelectedRow(),3));
            registros.clearSelection();
            nombres.requestFocus();
            mod = 1;
        }else{
            conf.mensaje(2,"Debe seleccionar al menos un registro","Programa");
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(registros.getSelectedRowCount()>0){
            String clie_cod = String.valueOf(registros.getValueAt(registros.getSelectedRow(),0));
            String nom = String.valueOf(registros.getValueAt(registros.getSelectedRow(),1));
            String ape = String.valueOf(registros.getValueAt(registros.getSelectedRow(),2));
            String doc = String.valueOf(registros.getValueAt(registros.getSelectedRow(),3));
            try {
                c.ejecutar("call proc_abm_clientes("+clie_cod+",'"+nom+"','"+ape+"','"+doc+"','IN')");                
                conf.mensaje(3,"Se ha eliminado correctamente","Programa");
                agregar.doClick();
                registros.clearSelection();
                ActualizaTabla();
            } catch (SQLException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            conf.mensaje(2,"Debe seleccionar al menos un registro","Programa");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String nom = nombres.getText();
        String ape = apellidos.getText();
        String doc = documento.getText();
        if(mod==0){           
            try {
                c.ejecutar("call proc_abm_clientes(null,'"+nom+"','"+ape+"','"+doc+"','AC')");
                conf.mensaje(3,"Se ha agregado correctamente","Programa");                
                agregar.doClick();
                ActualizaTabla();
            } catch (SQLException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
            }            
        }else{
            try {
                c.ejecutar("call proc_abm_clientes("+codigo.getText()+",'"+nom+"','"+ape+"','"+doc+"','AC')");
                conf.mensaje(3,"Se ha modificado correctamente","Programa");
                agregar.doClick();
                ActualizaTabla();
            } catch (SQLException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
    }//GEN-LAST:event_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField documento;
    private javax.swing.JTextField domicilio;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
