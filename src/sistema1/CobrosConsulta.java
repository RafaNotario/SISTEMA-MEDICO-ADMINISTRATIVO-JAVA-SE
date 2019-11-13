
package sistema1;

import java.awt.GridLayout;
import java.awt.Point;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author JOGUA
 */
public class CobrosConsulta extends javax.swing.JPanel {

    ConexionDBOriginal con2 = new ConexionDBOriginal();
    //Connection cn = con.conexion();
    
    JPanelConsulta JPC = new JPanelConsulta();
    Funciones fn = new Funciones();

//Dar formato dat al dateChooser    
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
    SimpleDateFormat formatoPrueba = new SimpleDateFormat("dd/MM/yyyy");

    String param = "";
    
    int cont=0;

    public CobrosConsulta() {
        initComponents();
        dateChooserCombo2.setDateFormat(formatoPrueba);
        dateChooserCombo1.setDateFormat(formatoPrueba);
        jPanelCobros.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Cobro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        datosConsul = new javax.swing.JMenuItem();
        BGIdExped = new javax.swing.ButtonGroup();
        BGDias = new javax.swing.ButtonGroup();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        JRBEspecif = new javax.swing.JRadioButton();
        JRBLapso = new javax.swing.JRadioButton();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        JRBIdConsul = new javax.swing.JRadioButton();
        JRBExped = new javax.swing.JRadioButton();
        PanelMedicine = new javax.swing.JPanel();
        jPanelCobros = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        txtPago = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        Cobro.setText("Realiza Cobro");
        Cobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobroActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Cobro);
        jPopupMenu1.add(jSeparator1);

        datosConsul.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        datosConsul.setText("Ver datos de consulta");
        datosConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosConsulActionPerformed(evt);
            }
        });
        jPopupMenu1.add(datosConsul);

        setBackground(new java.awt.Color(245, 244, 243));
        setPreferredSize(new java.awt.Dimension(910, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 80, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 50, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 430, 290));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Busqueda por fecha");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONSULTAS");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(340, 230));
        add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 120, 30));

        BGIdExped.add(JRBEspecif);
        JRBEspecif.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JRBEspecif.setText("DIA ESPECIFICO");
        add(JRBEspecif, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 160, 30));

        BGIdExped.add(JRBLapso);
        JRBLapso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JRBLapso.setText("LAPSO DE DIAS");
        add(JRBLapso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 150, 30));

        dateChooserCombo2.setCalendarPreferredSize(new java.awt.Dimension(340, 230));
        add(dateChooserCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, 30));

        BGIdExped.add(JRBIdConsul);
        JRBIdConsul.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JRBIdConsul.setText("ID CONSULTA");
        add(JRBIdConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 110, -1));

        BGIdExped.add(JRBExped);
        JRBExped.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JRBExped.setText("EXPEDIENTE");
        add(JRBExped, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 130, -1));

        PanelMedicine.setPreferredSize(new java.awt.Dimension(455, 660));
        PanelMedicine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(PanelMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 460, -1));

        jPanelCobros.setBackground(new java.awt.Color(245, 244, 243));
        jPanelCobros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("DETALLE");
        jPanelCobros.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("COBRO");
        jPanelCobros.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 30));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("REALIZADO");
        jPanelCobros.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 120, 30));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("PENDIENTE");
        jPanelCobros.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 130, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("PAGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelCobros.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 90, 40));
        jPanelCobros.add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 70, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("CANTIDAD A COBRAR $");
        jPanelCobros.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 30));

        add(jPanelCobros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 430, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String var = txtBuscar.getText();
        
            if(JRBEspecif.isSelected())
            {
                txtBuscar.setText("");
                mostrarTabla2(var,"fechaAct");// TODO add your handling code here:
            }
            
            if(JRBLapso.isSelected())
            {
                txtBuscar.setText("");
                mostrarTabla2(var,"2fechas");
            }

            if(JRBExped.isSelected())
            {
                mostrarTabla2(var,"expediente");// TODO add your handling code here:
            }
        
            if(JRBIdConsul.isSelected())
            {
                mostrarTabla2(var,"id_Consulta");// TODO add your handling code here:
            }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void CobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobroActionPerformed
        String estado,monto,id;
        int fila = jTable1.getSelectedRow();
        String var="";
        
        if(fila >= 0)
        {
            
            id=jTable1.getValueAt(fila, 0).toString();
            estado=jTable1.getValueAt(fila, 2).toString();
            monto = jTable1.getValueAt(fila, 3).toString();
            
            if(estado.equals("Pendiente"))
                jRadioButton2.setSelected(true);
            else
                jRadioButton1.setSelected(true);
            
            txtPago.setText(monto);
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione un paciente.");
        }
    }//GEN-LAST:event_CobroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection cn = con2.conexion();
        String var=null,var2;
        String estado,monto,id;
        int fila = jTable1.getSelectedRow();
        id=jTable1.getValueAt(fila, 0).toString();
        Statement st = null;
        if(jRadioButton1.isSelected())
           var = "Realizado";
        else{
            if(jRadioButton2.isSelected())
                var="Pendiente";
            else
                JOptionPane.showMessageDialog(null, "No selecciono opcion");
        }
        try
        {
            st = cn.createStatement();
   /* Modificamos el telefono del contacto con id = 2 */
            st.executeUpdate("UPDATE consulta SET estado= '"+var+"' WHERE id_Consulta="+id);
            JOptionPane.showMessageDialog(null, "Pago Realizado");
        }catch (Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al realizar pago");
            
        }finally{
//            System.out.println( "cierra conexion a la base de datos" );    
            try {
                if(st != null) st.close();                
                if(cn !=null) cn.close();
            } catch (SQLException ex) {
                System.err.println( ex.getMessage() );    
            }
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void datosConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosConsulActionPerformed
        int fila = jTable1.getSelectedRow();
        String var="";
        
        if(fila >= 0)
        {
            fn.limpiar(PanelMedicine);
            PanelMedicine.setVisible(true);
            
            var=jTable1.getValueAt(fila, 0).toString();
            JPC.setEnabled(true);
            JPC.setVisible(true);
            
            JPC.RealizaConsulta(var);
            JPC.ConsultaReceta(var);
            
            JPC.jLabelGuardaReceta.setVisible(false);
            JPC.jLabelLlenaTabla.setVisible(false);

            JPC.jLabelPDF.setVisible(true);
            
                        JPC.txtId_Consul.setText(var);

            PanelMedicine.setLayout(new GridLayout(1,1));
            PanelMedicine.add(JPC);
            PanelMedicine.validate();
            PanelMedicine.setVisible(true);
            PanelMedicine.setEnabled(true);
            

        }else{
            JOptionPane.showMessageDialog(null,"Seleccione un paciente.");
        }

    }//GEN-LAST:event_datosConsulActionPerformed

    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if (evt.getClickCount() > 1)
        {
            
            
        }
/*
        Point point = evt.getPoint();
        int row = jTable1.rowAtPoint(point);
        int column = jTable1.columnAtPoint(point);
        TableModel model = jTable1.getModel();
        JOptionPane.showMessageDialog(this, model.getValueAt(row, column));
*/

    }//GEN-LAST:event_jTable1MousePressed

    void mostrarTabla1(String var){
        Connection cn = con2.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        TableColumn columna;
        String consul="";

        modelo.addColumn("Consulta");
        modelo.addColumn("Expediente");
        //modelo.addColumn("Pago");
        //modelo.addColumn("Monto");
        
        jTable1.setModel(modelo);
        columna = jTable1.getColumn("Consulta");
        columna.setPreferredWidth(5);
        //if(var.equals("/"))
        //{
          //  consul = "SELECT id_Consulta, expediente, estado, monto FROM consulta";
        //}else{
            consul = "SELECT id_consultas, expediente FROM t_consultas WHERE expediente = '"+var+"'";
//            System.out.println("Consulta: "+consul);
        //}
        String datos[] =  new String[4];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(consul);
            while(rs.next()){
                datos[0] =rs.getString(1);
                datos[1] = rs.getString(2);
                modelo.addRow(datos);
            }
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(CobrosConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
//            System.out.println( "cierra conexion a la base de datos" );    
            try {
                if(rs != null) rs.close();               
                if(st != null) st.close();                
                if(cn !=null) cn.close();
            } catch (SQLException ex) {
//                System.err.println( ex.getMessage() );    
            }
         }
    }

    void mostrarTabla2(String var,String campo){
        Connection cn = con2.conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        TableColumn columna, columna1;
        String consul="", fech1 = fn.volteaFecha(dateChooserCombo2.getText(),0),fech2 = fn.volteaFecha(dateChooserCombo1.getText(),0);

        modelo.addColumn("Id");
        modelo.addColumn("Exp");
        
        jTable1.setModel(modelo);
        columna = jTable1.getColumn("Id");
        columna1 = jTable1.getColumn("Exp");
        
        columna.setPreferredWidth(5);
        columna1.setPreferredWidth(5);

        if(campo.equals("id_Consulta"))
            consul = "SELECT id_consultas, expediente FROM t_consultas WHERE id_consultas = '"+var+"'";
    
        if(campo.equals("expediente"))
            consul = "SELECT id_consultas, expediente FROM t_consultas WHERE expediente = '"+var+"'";

        if(campo.equals("fechaAct"))
        {
            consul = "SELECT id_consultas, expediente FROM t_consultas WHERE fecha = '"+fech1+"' ";
        }
        if(campo.equals("2fechas"))
        {
            consul = "SELECT id_consultas, expediente FROM t_consultas WHERE fecha BETWEEN '"+fech1+"' AND '"+fech2+"' ";            
        }
        
//        System.out.println("Consulta: "+consul);
        String datos[] =  new String[2];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(consul);
            while(rs.next()){
                datos[0] =rs.getString(1);
                datos[1] = rs.getString(2);

                modelo.addRow(datos);
            }
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(CobrosConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
//            System.out.println( "cierra conexion a la base de datos" );    
            try {
                if(rs != null) rs.close();                
                if(st != null) st.close();                
                if(cn !=null) cn.close();
            } catch (SQLException ex) {
                System.err.println( ex.getMessage() );    
            }
         }
    }        
        
        
        
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGDias;
    private javax.swing.ButtonGroup BGIdExped;
    private javax.swing.JMenuItem Cobro;
    private javax.swing.JRadioButton JRBEspecif;
    public javax.swing.JRadioButton JRBExped;
    private javax.swing.JRadioButton JRBIdConsul;
    private javax.swing.JRadioButton JRBLapso;
    private javax.swing.JPanel PanelMedicine;
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JMenuItem datosConsul;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelCobros;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtPago;
    // End of variables declaration//GEN-END:variables
}