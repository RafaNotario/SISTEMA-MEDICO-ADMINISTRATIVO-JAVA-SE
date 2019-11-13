

package sistema1;

import java.sql.*;

/**
 *
 * @author JOGUA
 */
public class ConexionDBOriginal {

    Connection cn;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/db_doctores","root","0ehn4TNU5I");
            
           // System.out.println("CONEXION EXITOSA ConexionDBOriginal");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }return cn;
    }
            
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
