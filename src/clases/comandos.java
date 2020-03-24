
package clases;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class comandos extends conexion{
    private ResultSet rs;
    private Statement query;
    
    public comandos(){
        super();
    }
    
    public ResultSet consulta(String sql){
        try {
            try {
                query=con.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(comandos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex);
            }
            rs=query.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(comandos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public void ejecutar(String sql) throws SQLException{
        query=con.createStatement();
        query.executeUpdate(sql);
    }
    public String fecha_servidor(){
        String fecha = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date f = new Date();
        fecha = sdf.format(f);
        return fecha;
    }
}
