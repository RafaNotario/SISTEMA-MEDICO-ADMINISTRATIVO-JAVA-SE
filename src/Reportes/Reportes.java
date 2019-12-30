/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import sistema1.ConexionDBOriginal;
import sistema1.conexionDB;

/**
 *
 * @author JOGUA
 */
public class Reportes {
    
    //conexionDB con = new conexionDB();
    //Connection cn = con.conexion();
    ConexionDBOriginal con2 = new ConexionDBOriginal();
    
    public void ReportePaciente(String param){
    Connection cn = con2.conexion();
    String  var = "C:/SistemaMedico1366-768/src/Reportes/pacienteInfo.jasper";
//C:\Sistema Medico\SistemaMedico\src\Reportes

    JasperReport reporte = null;
        try {
            Map parametro = new HashMap();
            parametro.put("parameter1",param);
            reporte = (JasperReport) JRLoader.loadObjectFromFile(var);
            JasperPrint jp = JasperFillManager.fillReport(reporte, parametro, cn);
            JasperViewer jv = new JasperViewer(jp,false);
            
            //AJUSTAR EL ZOOM AL 75%
            jv.setZoomRatio(new Float(0.7500));
            jv.setVisible(true);
            jv.setTitle("Datos de paciente");
            
            
        } catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                   // System.out.println( "cierra conexion a la base de datos" );    
                    try {
                        if(cn != null) cn.close();
//                        if(cn !=null) cn.close();
                    } catch (SQLException ex) {
                        System.err.println( ex.getMessage() );    
                    }
                }
    }
    
    public void RecetaParam(String var){
        Connection cn = con2.conexion();
        String  ruta = "C:/SistemaMedico1366-768/src/Reportes/reportParameter.jasper";
//        String  ruta = "C:/Sistema Medico1920/SistemaMedico1920-1080/src/Reportes/ReportParameter.jasper";
        JasperReport reporte = null;
        try {
            Map parametro = new HashMap();
            parametro.put("parameter1",var);
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            JasperPrint jp = JasperFillManager.fillReport(reporte, parametro, cn);
            JasperViewer jv = new JasperViewer(jp,false);
            
            //AJUSTAR EL ZOOM AL 75%
            jv.setZoomRatio(new Float(0.7500));
            jv.setVisible(true);
            jv.setTitle("Receta");
            
            
        } catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                    //System.out.println( "cierra conexion a la base de datos" );    
                    try {
                        if(cn != null) cn.close();
//                        if(cn !=null) cn.close();
                    } catch (SQLException ex) {
                        System.err.println( ex.getMessage() );    
                    }
                }
        
    }
    
    //REPORTE HEREDOFAMILIAR
        public void reporteHeredofam(String param){
    Connection cn = con2.conexion();
    String  var = "C:/SistemaMedico1366-768/src/Reportes/reportHeredoFam.jasper";
//C:\Sistema Medico\SistemaMedico\src\Reportes

    JasperReport reporte = null;
        try {
            Map parametro = new HashMap();
            parametro.put("parameter1",param);
            reporte = (JasperReport) JRLoader.loadObjectFromFile(var);
            JasperPrint jp = JasperFillManager.fillReport(reporte, parametro, cn);
            JasperViewer jv = new JasperViewer(jp,false);
            
            //AJUSTAR EL ZOOM AL 75%
            jv.setZoomRatio(new Float(0.7500));
            jv.setVisible(true);
            jv.setTitle("Datos de paciente");
            
            
        } catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                   // System.out.println( "cierra conexion a la base de datos" );    
                    try {
                        if(cn != null) cn.close();
//                        if(cn !=null) cn.close();
                    } catch (SQLException ex) {
                        System.err.println( ex.getMessage() );    
                    }
                }
    }
    
}
