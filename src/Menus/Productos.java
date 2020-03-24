
package Menus;

import clases.comandos;
import clases.conexion;
import clases.configuracion;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Productos extends javax.swing.JPanel {

    conexion co = new conexion();
    comandos c = new comandos();
    configuracion conf = new configuracion();
    int mod = 0;
    String cod_prov = "";
    String aux[] = new String[0];
    Component temp;
    
    public Productos() {
        initComponents();        
        co.Conexion();
        ActualizaTabla();
        temp = panel.getComponentAt(1);
        panel.removeTabAt(1);
        
    }
    
    public void CargaTablaProveeedor(){
        DefaultTableModel model = (DefaultTableModel) registros_proveedores.getModel();
        model.setRowCount(0);
        Object vector[]= new Object[2];
        try {                
            ResultSet aux =  c.consulta("select PROV_CODIGO,PROV_DESCRIPCION from proveedores where PROV_ESTADO='AC' ORDER BY PROV_CODIGO");
            while(aux.next()){
                for(int i=0;i<2;i++){
                    vector[i] = aux.getObject(i+1);
                }
                model.addRow(vector);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);            
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    
    }
    public void ActualizaTabla(){
        int p = 0;
        aux= new String[0];
        DefaultTableModel md = (DefaultTableModel)registros.getModel();
        md.setRowCount(0);
        ResultSet s = c.consulta("select p.PROD_CODIGO,p.PROD_DESCRIPCION,p.PROD_STOCK,p.PROD_PRECIO_UNITARIO,pr.prov_descripcion,p.PROV_CODIGO \n" +
        "from productos p, proveedores pr where pr.prov_codigo=p.prov_codigo and p.prod_estado='AC' order by p.PROD_CODIGO asc");
        try {
            while(s.next()){
                Object v[]= new Object[5];
                v[0]=s.getObject(1);
                v[1]=s.getObject(2);
                v[2]=s.getObject(3);
                v[3]=s.getObject(4);
                v[4]=s.getObject(5);
                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[p]=String.valueOf(s.getObject(6));
                p++;
                md.addRow(v);
            }
            registros.setModel(md);
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        descripcion.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        stock = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
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
        proveedor = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        ventana_buscar = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        filtro = new javax.swing.JComboBox<>();
        campo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        registros_proveedores = new javax.swing.JTable();

        panel.setForeground(new java.awt.Color(51, 51, 51));
        panel.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N

        stock.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setText("DESCRIPCION:");

        jLabel5.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel5.setText("PROVEEDOR:");

        jLabel4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel4.setText("PRECIO:");

        descripcion.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descripcionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcionKeyTyped(evt);
            }
        });

        precio.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel3.setText("STOCK:");

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
                "Codigo", "Descripcion", "Stock", "Precio", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
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
                .addContainerGap(27, Short.MAX_VALUE)
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
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardar)
                    .addComponent(agregar)
                    .addComponent(modificar)
                    .addComponent(eliminar))
                .addGap(17, 17, 17))
        );

        proveedor.setEditable(false);
        proveedor.setBackground(new java.awt.Color(255, 255, 255));
        proveedor.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        buscar.setBorder(null);
        buscar.setBorderPainted(false);
        buscar.setContentAreaFilled(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo)
                            .addComponent(descripcion)
                            .addComponent(stock)
                            .addComponent(precio)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(proveedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar)
                                .addGap(4, 4, 4))))
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
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buscar)))
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.addTab("PRODUCTOS", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuadro de Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Filtrar por:");

        filtro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombres" }));
        filtro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroItemStateChanged(evt);
            }
        });

        campo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campo.setText("Ingrese Valor de Busqueda....");
        campo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoFocusLost(evt);
            }
        });
        campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoActionPerformed(evt);
            }
        });
        campo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoKeyTyped(evt);
            }
        });

        registros_proveedores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        registros_proveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        registros_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registros_proveedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(registros_proveedores);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(filtro, 0, 166, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(campo, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout ventana_buscarLayout = new javax.swing.GroupLayout(ventana_buscar);
        ventana_buscar.setLayout(ventana_buscarLayout);
        ventana_buscarLayout.setHorizontalGroup(
            ventana_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ventana_buscarLayout.setVerticalGroup(
            ventana_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel.addTab("SELECCIONAR", ventana_buscar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(panel)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(panel)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void descripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionKeyReleased

    }//GEN-LAST:event_descripcionKeyReleased

    private void descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionKeyTyped
        char n = evt.getKeyChar();
        if(Character.isLetter(n)){
            String cad = (""+n).toUpperCase();
            n=cad.charAt(0);
            evt.setKeyChar(n);
        }
    }//GEN-LAST:event_descripcionKeyTyped

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        descripcion.requestFocus();
        conf.borrar_texto(new Object[]{codigo,descripcion,stock,precio,proveedor});
        stock.setEnabled(true);
        mod=0;
    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if(registros.getSelectedRowCount()>0){
            codigo.setText(""+registros.getValueAt(registros.getSelectedRow(),0));
            descripcion.setText(""+registros.getValueAt(registros.getSelectedRow(),1));
            stock.setText(""+registros.getValueAt(registros.getSelectedRow(),2));
            precio.setText(""+registros.getValueAt(registros.getSelectedRow(),3));
            proveedor.setText(""+registros.getValueAt(registros.getSelectedRow(),4));
            cod_prov = aux[registros.getSelectedRow()];
            stock.setEnabled(false);
            stock.setBackground(Color.WHITE);
            registros.clearSelection();
            descripcion.requestFocus();
            mod = 1;
        }else{
            conf.mensaje(2,"Debe seleccionar al menos un registro","Programa");
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(registros.getSelectedRowCount()>0){
            String prod_cod = String.valueOf(registros.getValueAt(registros.getSelectedRow(),0));
            String nom = String.valueOf(registros.getValueAt(registros.getSelectedRow(),1));
            String stock = String.valueOf(registros.getValueAt(registros.getSelectedRow(),2));
            String precio =String.valueOf(registros.getValueAt(registros.getSelectedRow(),3));

            cod_prov = aux[registros.getSelectedRow()];
            try {
                c.ejecutar("call PROC_ABM_PRODUCTOS("+prod_cod+",'"+nom+"',"+stock+","+precio+",'IN',"+cod_prov+")");
                conf.mensaje(3,"Se ha eliminado correctamente","Programa");
                agregar.doClick();

                registros.clearSelection();
                ActualizaTabla();
            } catch (SQLException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            conf.mensaje(2,"Debe seleccionar al menos un registro","Programa");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if(proveedor.getText().trim().length()>0){
            String nom = descripcion.getText();
            String cantidad = stock.getText();
            String Precio = precio.getText();
            if(mod==0){
                try {
                    c.ejecutar("call PROC_ABM_PRODUCTOS(null,'"+nom+"',"+cantidad+","+Precio+",'AC',"+cod_prov+")");                    
                    conf.mensaje(3,"Se ha agregado correctamente","Programa");
                    agregar.doClick();
                    ActualizaTabla();
                } catch (SQLException ex) {
                    Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                try {
                    c.ejecutar("call PROC_ABM_PRODUCTOS("+codigo.getText()+",'"+nom+"',"+cantidad+","+Precio+",'AC',"+cod_prov+")");
                    conf.mensaje(3,"Se ha modificado correctamente","Programa");
                    agregar.doClick();
                    ActualizaTabla();
                } catch (SQLException ex) {
                    Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            conf.mensaje(2,"Debe seleccionar al menos un proveedor","Programa");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        CargaTablaProveeedor();

        panel.add(temp.getName(),temp);
        panel.setTitleAt(1, "Buscar Proveedor");
        panel.setSelectedIndex(1);

        campo.requestFocus();
    }//GEN-LAST:event_buscarActionPerformed

    private void filtroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroItemStateChanged

    }//GEN-LAST:event_filtroItemStateChanged

    private void campoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoFocusGained
        if(campo.getText().trim().toLowerCase().equals("ingrese valor de busqueda....")){
            campo.setText("");
        }
    }//GEN-LAST:event_campoFocusGained

    private void campoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoFocusLost
        if( campo.getText().trim().equals("") || campo.getText().trim().toLowerCase().equals("ingrese valor de busqueda....")){
            campo.setText("Ingrese Valor de Busqueda....");
        }
    }//GEN-LAST:event_campoFocusLost

    private void campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoActionPerformed

    private void campoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoKeyReleased
        DefaultTableModel model = (DefaultTableModel) registros_proveedores.getModel();
        model.setRowCount(0);
        Object vector[]= new Object[2];
        if(filtro.getSelectedIndex()==0){
            try {
                ResultSet aux =  c.consulta("select PROV_CODIGO,PROV_DESCRIPCION from proveedores where PROV_CODIGO like  '%"+campo.getText()+"%' and PROV_ESTADO='AC' order by PROV_CODIGO asc");
                while(aux.next()){
                    for(int i=0;i<2;i++){
                        vector[i] = aux.getObject(i+1);
                    }
                    model.addRow(vector);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }else if (filtro.getSelectedIndex()==1){
            try {
                ResultSet aux =  c.consulta("select PROV_CODIGO,PROV_DESCRIPCION from proveedores where PROV_DESCRIPCION like  '%"+campo.getText()+"%' and PROV_ESTADO='AC' order by PROV_CODIGO asc");
                while(aux.next()){
                    for(int i=0;i<2;i++){
                        vector[i] = aux.getObject(i+1);
                    }
                    model.addRow(vector);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_campoKeyReleased

    private void campoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoKeyTyped
        char n = evt.getKeyChar();
        if(Character.isLetter(n)){
            String cad = (""+n).toUpperCase();
            n=cad.charAt(0);
            evt.setKeyChar(n);
        }
    }//GEN-LAST:event_campoKeyTyped

    private void registros_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registros_proveedoresMouseClicked
        cod_prov = String.valueOf(registros_proveedores.getValueAt(registros_proveedores.getSelectedRow(),0));
        proveedor.setText(""+registros_proveedores.getValueAt(registros_proveedores.getSelectedRow(),1));
        precio.requestFocus();
        campo.setText("Ingrese Valor de Busqueda....");
        temp = panel.getComponentAt(1);
        panel.removeTabAt(1);
    }//GEN-LAST:event_registros_proveedoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField campo;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton modificar;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField proveedor;
    private javax.swing.JTable registros;
    private javax.swing.JTable registros_proveedores;
    private javax.swing.JTextField stock;
    private javax.swing.JPanel ventana_buscar;
    // End of variables declaration//GEN-END:variables
}
