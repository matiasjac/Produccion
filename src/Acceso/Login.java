
package Acceso;

import Menus.Principal;
import clases.*;
public class Login extends javax.swing.JFrame {

    configuracion conf = new configuracion();
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("CONTRASEÑA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel4.setBackground(new java.awt.Color(238, 112, 82));
        jLabel4.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 112, 82));
        jLabel4.setText("USUARIO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_User_96px_2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        user.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        user.setForeground(new java.awt.Color(153, 153, 153));
        user.setText("Ingrese Usuario");
        user.setBorder(null);
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userFocusLost(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 270, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 310, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 310, -1));

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("password123456");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 270, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_customer_32px_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Key_32px.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enter_OFF.png"))); // NOI18N
        ingresar.setBorder(null);
        ingresar.setBorderPainted(false);
        ingresar.setContentAreaFilled(false);
        ingresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enter_ON.png"))); // NOI18N
        ingresar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enter_ON.png"))); // NOI18N
        ingresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enter_ON.png"))); // NOI18N
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusGained
        if(user.getText().equals("Ingrese Usuario")){
            user.setText("");
        }
    }//GEN-LAST:event_userFocusGained

    private void userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusLost
        if(user.getText().equals("")){
            user.setText("Ingrese Usuario");
        }
    }//GEN-LAST:event_userFocusLost

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        ingresar.doClick();
    }//GEN-LAST:event_userActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if(password.getText().equals("password123456")){
            password.setText("");
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if(password.getText().equals("")){
            password.setText("password123456");
        }
    }//GEN-LAST:event_passwordFocusLost

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        if(user.getText().equals("admin") && password.getText().equals("admin123")){
            this.dispose();
            Principal p = new Principal();
            p.setVisible(true);
        }else{
            conf.mensaje(2,"Usuario o contraseña incorrectos.Vuelva a intentarlo","Programa");
        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        ingresar.doClick();
    }//GEN-LAST:event_passwordActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexion c = new conexion();
        c.Conexion();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
