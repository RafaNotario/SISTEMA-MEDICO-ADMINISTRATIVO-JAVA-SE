

package sistema1;

import java.sql.*;
import sun.applet.Main;

/**
 *
 * @author JOGUA
 */
public class conexionDB {

    Connection cn;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/db_doctores","root","0ehn4TNU5I");
            
           // System.out.println("CONEXION EXITOSA conexionDB");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }return cn;
    }
            
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
    
    
}
