
package Menus;

import Animacion.Animacion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import clases.*;
import java.sql.SQLException;


public class Principal extends javax.swing.JFrame {
    int b=0;
    conexion c = new conexion();
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        new CambiaPanel(pnlPrincipal, new Menus.home());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        home = new javax.swing.JButton();
        button_clientes = new javax.swing.JButton();
        button_productos = new javax.swing.JButton();
        button_facturas = new javax.swing.JButton();
        button_compras = new javax.swing.JButton();
        button_barra = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        pnlCentro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        pnlMenu.setBackground(new java.awt.Color(204, 204, 204));
        pnlMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(239, 238, 244)));

        home.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        home.setText("INICIO              ");
        home.setBorder(null);
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        button_clientes.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        button_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.png"))); // NOI18N
        button_clientes.setText("CLIENTES          ");
        button_clientes.setBorder(null);
        button_clientes.setBorderPainted(false);
        button_clientes.setContentAreaFilled(false);
        button_clientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_clientes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_clientesActionPerformed(evt);
            }
        });

        button_productos.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        button_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/producto.png"))); // NOI18N
        button_productos.setText("PRODUCTOS  ");
        button_productos.setBorder(null);
        button_productos.setBorderPainted(false);
        button_productos.setContentAreaFilled(false);
        button_productos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_productos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_productosActionPerformed(evt);
            }
        });

        button_facturas.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        button_facturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/factura.png"))); // NOI18N
        button_facturas.setText("FACTURA       ");
        button_facturas.setBorder(null);
        button_facturas.setBorderPainted(false);
        button_facturas.setContentAreaFilled(false);
        button_facturas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_facturas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_facturasActionPerformed(evt);
            }
        });

        button_compras.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        button_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/compras__2_-removebg-preview.png"))); // NOI18N
        button_compras.setText("COMPRAS        ");
        button_compras.setBorder(null);
        button_compras.setBorderPainted(false);
        button_compras.setContentAreaFilled(false);
        button_compras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_compras.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_comprasActionPerformed(evt);
            }
        });

        button_barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barra.png"))); // NOI18N
        button_barra.setBorder(null);
        button_barra.setBorderPainted(false);
        button_barra.setContentAreaFilled(false);
        button_barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_barraActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proveedor.png"))); // NOI18N
        jButton1.setText("PROVEEDORES ");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMenuLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jSeparator4)
                .addGap(7, 7, 7))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jSeparator5)
                .addContainerGap())
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_compras, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(button_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_barra)
                .addGap(47, 47, 47))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(home)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(button_clientes)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(button_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(button_facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(button_compras)
                .addGap(10, 10, 10)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(430, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 8.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        jPanel1.add(pnlMenu, gridBagConstraints);

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlPrincipal);

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(pnlCentro, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void button_barraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_barraActionPerformed
        
        if(b==1){
            Animacion a = new Animacion();
            a.mover_derecha(-130, 0, 10,5, pnlMenu);
            
            pnlCentro.setLocation(223, 0);
            b=0;
        }else{

            Animacion a = new Animacion();
            a.mover_izquierda(0,-130, 10,5, pnlMenu);
            pnlCentro.setLocation(100, 0);
            b=1;
        }
    }//GEN-LAST:event_button_barraActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        new CambiaPanel(pnlPrincipal, new Menus.home());
    }//GEN-LAST:event_homeActionPerformed

    private void button_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_clientesActionPerformed
        new CambiaPanel(pnlPrincipal, new Menus.Clientes());
    }//GEN-LAST:event_button_clientesActionPerformed

    private void button_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_productosActionPerformed
        new CambiaPanel(pnlPrincipal, new Menus.Productos());
    }//GEN-LAST:event_button_productosActionPerformed

    private void button_facturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_facturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_facturasActionPerformed

    private void button_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_comprasActionPerformed
        new CambiaPanel(pnlPrincipal, new Menus.Compras());
    }//GEN-LAST:event_button_comprasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CambiaPanel(pnlPrincipal, new Menus.Proveedores());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        c.Conexion();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            c.Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new Principal().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_barra;
    private javax.swing.JButton button_clientes;
    private javax.swing.JButton button_compras;
    private javax.swing.JButton button_facturas;
    private javax.swing.JButton button_productos;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
