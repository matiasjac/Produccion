package clases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    public static Connection con; 
    public conexion(){
        
    }
    public boolean Conexion() {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
            con= DriverManager.getConnection(BaseDeDatos,"PROD","123456");
            if(con!=null){
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Conexión Fallida");
            }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
     
        return false;
    }
    public void Cerrar() throws SQLException{
        con.close();
    }
}
