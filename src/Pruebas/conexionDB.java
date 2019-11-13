

package Pruebas;

import java.sql.*;

/**
 *
 * @author JOGUA
 */
public class conexionDB {

    Connection cn;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/clinica","root","");
            
            System.out.println("CONEXION EXITOSA");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }return cn;
    }
            
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
