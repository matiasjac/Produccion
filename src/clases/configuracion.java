
package clases;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class configuracion {
    static int i;
    JButton boton;
    JTextField texto;
    JRadioButton radio;
    JComboBox<Object> combo;
    static int b1,b2;
    public void mensaje(int tipo, String men,String tmensaje){
        switch(tipo){
           case 1:
               JOptionPane.showMessageDialog(null, men,tmensaje,JOptionPane.WARNING_MESSAGE);
               break;
            case 2:
               JOptionPane.showMessageDialog(null, men,tmensaje,JOptionPane.ERROR_MESSAGE);
               break;
            case 3:
               JOptionPane.showMessageDialog(null, men,tmensaje,JOptionPane.INFORMATION_MESSAGE);
               break;
            case 4:
               JOptionPane.showMessageDialog(null, men,tmensaje,JOptionPane.QUESTION_MESSAGE);
               break;
        }
    }
    public int verificar_texto(Object[] array){
        b1=0;
       for(i=0;i<array.length;i++){
           texto=(JTextField)array[i];
           if(texto.getText().trim().isEmpty()){
               b1=1;
           }
       } 
     return b1;  
   };
   public int verificar_radio(Object[] array){
       b2=0;
       for(i=0;i<array.length;i++){
           radio=(JRadioButton)array[i];
           if(radio.isSelected()){
               b2=1;
           }
       } 
     return b2;  
   };
   public void habilitar_texto(Object[] array){
       for(i=0;i<array.length;i++){
           texto=(JTextField)array[i];
           texto.setEnabled(true);
       }
   }
   public void deshabilitar_texto(Object[] array){
       for(i=0;i<array.length;i++){
           texto=(JTextField)array[i];
           texto.setText("");
           texto.setEnabled(false);
       }
   }
   public void habilitar_boton(Object[] array){
       for(i=0;i<array.length;i++){
           boton=(JButton)array[i];
           boton.setEnabled(true);
       }
   }
   public void deshabilitar_boton(Object[] array){
        for(i=0;i<array.length;i++){
           boton=(JButton)array[i];
           boton.setEnabled(false);
        }
   }
   public void borrar_texto(Object[] array){
       for(i=0;i<array.length;i++){
           texto=(JTextField)array[i];
           texto.setText("");
       }
   }
    public void habilitar_radio(Object[] array){
       for(i=0;i<array.length;i++){
           radio=(JRadioButton)array[i];
           radio.setEnabled(true);
       }
   }
   public void deshabilitar_radio(Object[] array){
       for(i=0;i<array.length;i++){
           radio=(JRadioButton)array[i];
           radio.setEnabled(false);
       }
   }
   public void habilitar_lista(Object array){
       combo=(JComboBox<Object>) array;
       combo.setEnabled(true);
   }
   public void deshabilitar_lista(Object array){
       combo=(JComboBox<Object>) array;
       combo.setEnabled(false);
   }
   
}
