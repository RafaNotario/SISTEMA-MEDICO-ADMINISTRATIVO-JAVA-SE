

package sistema1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 *
 * @author A. Rafael Notario Rodriguez
 */
public class ConexionDBOriginal {

    Connection cn;
    Funciones fn = new Funciones();
    
    public Connection conexion() {
    //JOptionPane.showMessageDialog(null, cargaConfig()+", tam = "+cargaConfig().length());
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
          // cn = DriverManager.getConnection("jdbc:mysql://"+arr[0]+"/"+arr[1],arr[2],arr[3]); //192.168.0.31
          
          cn = DriverManager.getConnection("jdbc:mysql://"+cargaConfig()+"/db_doctores","root","0ehn4TNU5I");//0ehn4TNU5I
//System.out.println("CONEXION EXITOSA ConexionDBOriginal");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
        return cn;
    }
            
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
    
    private String cargaConfig() {//List
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
         String ruta="C:/SistemaMedico1366-768/config.txt";//2700 los 4; solo dos: 1850del, 1450traseros, 
         //List<String> contentL=new ArrayList<String>();
         String cadena="",rgresa="";  
        try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).     
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        while((cadena = br.readLine())!=null) {
            //contentL.add(cadena.trim());
            rgresa=cadena.trim();
        }
        br.close();
        }catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
        
        return rgresa;
    }
    
}
