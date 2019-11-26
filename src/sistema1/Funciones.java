
package sistema1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rafa
 */
public class Funciones {

 ///   conexionDB con = new conexionDB();
//    Connection cn = con.conexion();
    static ConexionDBOriginal con2 = new ConexionDBOriginal();
//formato para date sql
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
    static Scanner teclado = new Scanner(System.in);
    
    SimpleDateFormat formatoPrueba = new SimpleDateFormat("yyyy/MM/dd");

public String getFecha(JDateChooser jd){
    if(jd.getDate()!= null){
        return formato.format(jd.getDate());
    }else{
        return null;
    }
}

public Date StringDate(String fecha){//tenia: java.util.Date
//    SimpleDateFormat formato_texto = new SimpleDateFormat("dd/MM/yyyy");
    Date fechaE = null;
    try{
        fechaE = formato.parse(fecha);
        return fechaE;
    }catch(ParseException ex){
        return null;
    }
}

public String setDateActual(){
//        DateFormat df = DateFormat.getDateInstance();
    Date fechaAct = new Date();
    
//        jDateChooser1.setDate(fechaAct);
        return formato.format(fechaAct);
}

    private int ultimoRegistroConsulta(){
        Connection cn = con2.conexion();
        String ultimo="",consul="";
        int num=0,i=1;
        String sql = "SELECT id_consulta,expediente FROM consulta ORDER BY id_Consulta DESC LIMIT 1";
        Statement st = null;
        ResultSet rs= null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            rs.beforeFirst();
            while(rs.next())
            {
                consul = rs.getString(1);
                ultimo = rs.getString(2);
//                System.out.println(consul+" "+ultimo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
//                    System.out.println( "cierra conexion a la base de datos" );    
                    try {
                        if(cn != null) cn.close();
//                        if(cn !=null) cn.close();
                    } catch (SQLException ex) {
                        System.err.println( ex.getMessage() );    
                    }
                }
        num=Integer.parseInt(ultimo);
        
        return num;
    }

    public String sumaFecha(){
        Date prox = null;
        Calendar cal = Calendar.getInstance(); 

//obtenemos la fecha actual y la convertmos a date
        cal.setTime(StringDate(setDateActual()));
        cal.add(Calendar.MONTH, 9);       
        prox=cal.getTime();        
        return formato.format(prox);
    }   
    
    public static Calendar toCalendar(Date date){ 
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }
    
    public String sumaFechaParam(String fech){
        String var="";
        Calendar cal = Calendar.getInstance(); 
        Date prox = null;

//obtenemos la fecha actual y la convertmos a date
        cal.setTime(StringDate(fech));
//        cal.add(Calendar.MONTH, 9);
        cal.add(Calendar.DATE,280);
        prox=cal.getTime();
        
        var=formato.format(prox);
        //JOptionPane.showMessageDialog(null, "fecha -"+formato.format(prox));
        
        return var;
    }
    
    //DIFERENCIA FECHAS
    public static int diferenciaFechas(String fec1, String fec2,int valor){ 
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd"); 
        int retorno=0; 
        java.util.Date date1 = null; 
        java.util.Date date2 = null; 
        try 
        { 
            Calendar cal1 = null; 
            date1=df.parse(fec1); 
            cal1=Calendar.getInstance(); 

            Calendar cal2 = null; 
            date2=df.parse(fec2); 
            cal2=Calendar.getInstance(); 

// different date might have different offset 
            cal1.setTime(date1); 
            long ldate1 = date1.getTime() + cal1.get(Calendar.ZONE_OFFSET) + cal1.get(Calendar.DST_OFFSET); 

            cal2.setTime(date2); 
            long ldate2 = date2.getTime() + cal2.get(Calendar.ZONE_OFFSET) + cal2.get(Calendar.DST_OFFSET); 

// Use integer calculation, truncate the decimals 
            int hr1 = (int)(ldate1/3600000); //60*60*1000 
            int hr2 = (int)(ldate2/3600000); 

            int days1 = (int)hr1/24; 
            int days2 = (int)hr2/24; 

            int dateDiff = days2 - days1; 
            int yearDiff = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR); 
            int monthDiff = yearDiff * 12 + cal2.get(Calendar.MONTH) - cal1.get(Calendar.MONTH); 

            if(valor==1) 
            { 
                if (dateDiff<0) dateDiff=dateDiff*(-1); 
                retorno=dateDiff; 
            }else 
                if(valor==2)
                { 
                    if (monthDiff<0) monthDiff=monthDiff*(-1); 
                    retorno=monthDiff; 
                }else
                    if(valor==3)
                    { 
                        if (yearDiff<0) yearDiff=yearDiff*(-1); 
                    retorno=yearDiff; 
                    } 
            }catch (ParseException pe) 
            { 
                pe.printStackTrace(); 
            } 
            return retorno; 
        } 
    
    
    //OPC 2
    
    /**
 * Calcula la diferencia entre dos fechas. Devuelve el resultado en días, meses o años según sea el valor del parámetro 'tipo'
 * @param fechaInicio Fecha inicial
 * @param fechaFin Fecha final
 * @param tipo 0=TotalAños; 1=TotalMeses; 2=TotalDías; 3=MesesDelAnio; 4=DiasDelMes
 * @return numero de días, meses o años de diferencia
 */
    public long getDiffDates(Date fechaInicio, Date fechaFin, int tipo) {
	// Fecha inicio
	Calendar calendarInicio = Calendar.getInstance();
	calendarInicio.setTime(fechaInicio);
	int diaInicio = calendarInicio.get(Calendar.DAY_OF_MONTH);
	int mesInicio = calendarInicio.get(Calendar.MONTH) + 1; // 0 Enero, 11 Diciembre
	int anioInicio = calendarInicio.get(Calendar.YEAR);
 
	// Fecha fin
	Calendar calendarFin = Calendar.getInstance();
	calendarFin.setTime(fechaFin);
	int diaFin = calendarFin.get(Calendar.DAY_OF_MONTH);
	int mesFin = calendarFin.get(Calendar.MONTH) + 1; // 0 Enero, 11 Diciembre
	int anioFin = calendarFin.get(Calendar.YEAR);
 
	int anios = 0;
	int mesesPorAnio = 0;
	int diasPorMes = 0;
	int diasTipoMes = 0;
 
	//
	// Calculo de días del mes
	//
	if (mesInicio == 2) {
		// Febrero
		if ((anioFin % 4 == 0) && ((anioFin % 100 != 0) || (anioFin % 400 == 0))) {
			// Bisiesto
			diasTipoMes = 29;
		} else {
			// No bisiesto
			diasTipoMes = 28;
		}
	} else if (mesInicio <= 7) {
		// De Enero a Julio los meses pares tienen 30 y los impares 31
		if (mesInicio % 2 == 0) {
			diasTipoMes = 30;
		} else {
			diasTipoMes = 31;
		}
	} else if (mesInicio > 7) {
		// De Julio a Diciembre los meses pares tienen 31 y los impares 30
		if (mesInicio % 2 == 0) {
			diasTipoMes = 31;
		} else {
			diasTipoMes = 30;
		}
	}
 
 
	//
	// Calculo de diferencia de año, mes y dia
	//
	if ((anioInicio > anioFin) || (anioInicio == anioFin && mesInicio > mesFin)
			|| (anioInicio == anioFin && mesInicio == mesFin && diaInicio > diaFin)) {
		// La fecha de inicio es posterior a la fecha fin
		// System.out.println("La fecha de inicio ha de ser anterior a la fecha fin");
		return -1;
	} else {
		if (mesInicio <= mesFin) {
			anios = anioFin - anioInicio;
			if (diaInicio <= diaFin) {
				mesesPorAnio = mesFin - mesInicio;
				diasPorMes = diaFin - diaInicio;
			} else {
				if (mesFin == mesInicio) {
					anios = anios - 1;
				}
				mesesPorAnio = (mesFin - mesInicio - 1 + 12) % 12;
				diasPorMes = diasTipoMes - (diaInicio - diaFin);
			}
		} else {
			anios = anioFin - anioInicio - 1;
//			System.out.println(anios);
			if (diaInicio > diaFin) {
				mesesPorAnio = mesFin - mesInicio - 1 + 12;
				diasPorMes = diasTipoMes - (diaInicio - diaFin);
			} else {
				mesesPorAnio = mesFin - mesInicio + 12;
				diasPorMes = diaFin - diaInicio;
			}
		}
	}
	//System.out.println("Han transcurrido " + anios + " Años, " + mesesPorAnio + " Meses y " + diasPorMes + " Días.");		
 
	//
	// Totales
	//
	long returnValue = -1;
 
	switch (tipo) {
		case 0:
			// Total Años
			returnValue = anios;
			// System.out.println("Total años: " + returnValue + " Años.");
			break;
 
		case 1:
			// Total Meses
			returnValue = anios * 12 + mesesPorAnio;
			// System.out.println("Total meses: " + returnValue + " Meses.");
			break;
 
		case 2:
			// Total Dias (se calcula a partir de los milisegundos por día)
			long millsecsPerDay = 86400000; // Milisegundos al día
			returnValue = (fechaFin.getTime() - fechaInicio.getTime()) / millsecsPerDay;
			// System.out.println("Total días: " + returnValue + " Días.");
			break;
 
		case 3:
			// Meses del año
			returnValue = mesesPorAnio;
			// System.out.println("Meses del año: " + returnValue);
			break;
 
		case 4:
			// Dias del mes
			returnValue = diasPorMes;
			// System.out.println("Dias del mes: " + returnValue);
			break;
 
		default:
			break;
	}
 
	return returnValue;
}
    
    public void RealizaConsulta(String idConsul){
        Connection cn = con2.conexion();

        String consul = "SELECT * FROM consulta WHERE id_Consulta = '"+idConsul+"'";
        
//        System.out.println("Consulta: "+consul);
        int i = 1;
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consul);
            while(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(6));
                System.out.println(rs.getString(7));
                System.out.println(rs.getString(8));
                System.out.println(rs.getString(9));
                System.out.println(rs.getString(10));
                System.out.println(rs.getString(11));
                System.out.println(rs.getString(12));
                
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void limpiar(JPanel Pn){
        Pn.removeAll();
        Pn.validate();
        Pn.repaint();
    }
    
    
//METODO ORIGINAL para validar si existe coincidencia en la base de datos mediante un JOptionPane
    public void ValidaExpediente(String exp) {
        try{
            PreparedStatement pstm = con2.conexion().prepareStatement("SELECT expediente FROM t_personas WHERE expediente = '" + exp+ "'");
            ResultSet res = pstm.executeQuery();
            if(res.next())
            {
                JOptionPane.showMessageDialog(null, "Expediente encontrado: ", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
                res.close();
                pstm.close();
                res.close();
            } else
             JOptionPane.showMessageDialog(null, "NO existe el expediente: " + exp, "Error de expediente",JOptionPane.ERROR_MESSAGE);
                res.close();
                pstm.close();
                res.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }


//metodo modificado para devolver boleano 
    public boolean ValidaExpedienteBool(String exp) {
        boolean bad= false;
        PreparedStatement pstm=null;
        ResultSet res=null;
        try{
            pstm = con2.conexion().prepareStatement("SELECT expediente FROM t_personales WHERE expediente = '" + exp+ "'");
            res = pstm.executeQuery();
            if(res.next()){
//                JOptionPane.showMessageDialog(null, "si se encontro ->"+exp);
                bad=true;
                
            }
            else{
                bad=false;
//            JOptionPane.showMessageDialog(null, "nada viejo!!! ->"+exp);
            }
            pstm.close();
            res.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "class Funciones in line -> 408"+e);
        }
        return bad;
    }
    
    
        public boolean ValidaConsultaBool(String idConsulta) {
        boolean bad= false;
        PreparedStatement pstm=null;
        ResultSet res=null;
        try{
            pstm = con2.conexion().prepareStatement("SELECT id_consultas FROM t_consultas WHERE id_consultas = '" +idConsulta+ "'");
            res = pstm.executeQuery();
            if(res.next())
                bad=true;
             else
                bad=false;
                
            pstm.close();
            res.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return bad;
    }
        
    public boolean ValidaHeredofamiliarBool(String id) {
        boolean bad= false;
        PreparedStatement pstm=null;
        ResultSet res=null;
        try{
            pstm = con2.conexion().prepareStatement("SELECT expediente FROM h_clinica WHERE expediente = '" +id+ "'");
            res = pstm.executeQuery();
            if(res.next())
                bad=true;
             else
                bad=false;
                
            pstm.close();
            res.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    return bad;
    }
        
        public String[] DevuelveID(int var,String param,int consul){
//            JOptionPane.showMessageDialog(null, "Llego");
            String[] arr = new String[2]; 
            String sql = "",tabla = "",cad="";
            int par = 0;
            if(var == 0)    //caso para estados civiles
            {
                tabla = "c_estadosciviles";
            }
            
            if(var == 1)
            {
                tabla = "c_medicamentos";
            }
            
            if(var == 2)
            {
                tabla = "c_tratamientos";
            }
            
            if(consul == 0)
            {
                cad = "nombre";
            }
            
            if(consul == 1)
            {
                cad = "clave";
            }
            
            sql = "SELECT * FROM "+tabla+" WHERE "+cad+" = '"+param+"'";

//            JOptionPane.showMessageDialog(null, sql);
            
            Connection cn = con2.conexion();
            PreparedStatement pr = null;
            ResultSet rs =  null;
            try{
                pr = cn.prepareStatement(sql);
                rs = pr.executeQuery();
                rs.beforeFirst();
            while(rs.next())
            {
                arr[0] = rs.getString(1);
                arr[1] = rs.getString(2);
//                par =rs.getInt(1);
            }
            pr.close();
            rs.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
            
        return arr;
        }
        
        public String volteaFecha(String cad,int opc){
            //cad = "16/06/2017";
            char var[];
            var = cad.toCharArray();
            String p1 ="",p2="",p3="",newFech="";
            
            if(opc == 0)
            {
                for(int i = 0; i< var.length;i++){
                    if(i<2)
                        p1+=var[i];
                
                    if(i>2 && i<5)
                        p2+=var[i];
                
                    if(i>5 && i<var.length)
                        p3+=var[i];
                }
            }

            if(opc == 1)
            {
                for(int i = 0;i<var.length;i++){
                    if(i<4)
                        p1+=var[i];
                    
                    if(i>4 && i<7)
                        p2+=var[i];
                    
                    if(i>7 && i<var.length)
                        p3+=var[i];
                }
            }
            
            newFech=p3+"/"+p2+"/"+p1;
            
            return newFech;
        }
        
    public boolean ValidaRecetaConsul(String id) {
        boolean bad= false;
        PreparedStatement pstm=null;
        ResultSet res=null;
        try{
            pstm = con2.conexion().prepareStatement("SELECT id_consultas FROM t_recetas WHERE id_consultas = '" +id+ "'");
            res = pstm.executeQuery();
            if(res.next())
                bad=true;
             else
                bad=false;
                
            pstm.close();
            res.close();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    return bad;
    }

    //CALCULA IMC  12/11/2019
    public float calcImc(String peso, String estatura){
        float pesoC = Float.parseFloat(peso);
        float estaturaC = (Float.parseFloat(estatura))/100;
             
        float imc = pesoC/(float)(Math.pow(estaturaC,2));
        imc = (float)(Math.round(imc * 100) / 100d);
       // DecimalFormat formato1 = new DecimalFormat("#.00");
       // imc  = Float.valueOf(formato1.format(imc));
        return imc;
    }
    
    public static void delaySegundo()
    {
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }
    
public static void main(String[] args){
    //int val = diferenciaFechas("2017/01/11","2017/01/30",1);
    String[] array = null;
    String var = "";
    int param=0;
    Funciones fn = new Funciones();
    long monts=0,days=0;
    
 //System.out.println(fn.calcImc("70","171"));
    // monts = getDiffDates(fn.StringDate("2017/01/11"),fn.StringDate("2017/03/10"),1);
    //days = getDiffDates(fn.StringDate("2017/01/11"),fn.StringDate("2017/03/10"),2);
    //System.out.println("Actual: "+ fn.sumaFechaParam("2017/01/11"));
    
    //fn.RealizaConsulta("72");
//    System.out.println("Numero de tabla 1,2,3");
    //array = fn.DevuelveID(0, "KINERASE(  N6 FURFURILADENINA   ) 1%  LOCION FACIAL  Y CORPORAL", 0);
//    System.out.println(" d3e fehca regreso llego facil lectura->"+fn.volteaFecha("16/06/2017",0));
//S    System.out.println(" d3e fehca regreso ->"+fn.volteaFecha("2017/06/16",1));
    //for(int i =0; i<array.length; i++)
    //System.out.println("valores ->"+array[i]);
    
    
   
    //JOptionPane.showMessageDialog(null, "resultado es: \t"+ param,"Alerta",JOptionPane.ERROR_MESSAGE );
    //DevuelveID(param);
      
    //JOptionPane.showMessageDialog(null, "resultado es: \t"+ fn.ValidaExpedienteBool("2"),"Alerta",JOptionPane.ERROR_MESSAGE );
    }
}
