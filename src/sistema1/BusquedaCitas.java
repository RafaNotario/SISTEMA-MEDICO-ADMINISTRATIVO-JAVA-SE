/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BusquedaCitas extends javax.swing.JPanel {

    ConexionDBOriginal con2 = new ConexionDBOriginal();
//    Connection cn = con.conexion();
    String fech = "";
    
    public BusquedaCitas() {
        initComponents();
        agregarOyente();
}
    
    
    private void agregarOyente() {
        jCalendarProximas.getDayChooser().addPropertyChangeListener(
                new java.beans.PropertyChangeListener() {
                    @Override
                    public void propertyChange(java.beans.PropertyChangeEvent evt) {
                        if (evt.getPropertyName().compareTo("day") == 0) {
                            SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy/MM/dd");
                                fech=formatoDeFecha.format(jCalendarProximas.getDate());
                                
                                txtCitas.setText(fech);
//                                String sql = "SELECT a.expediente,a.nombre,a.paterno,a.materno FROM paciente a, consulta b WHERE '"+fech+"' = b.fecha and b.expediente=a.expediente ";
                                mostrarTabla(fech);
//Letrero de pruebas    JOptionPane.showMessageDialog(null,formatoDeFecha.format(jCalendarProximas.getDate()));
                        }
                    }
                });
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        RealConsulta = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCalendarProximas = new com.toedter.calendar.JCalendar();
        jLabel20 = new javax.swing.JLabel();
        txtCitas = new javax.swing.JTextField();

        RealConsulta.setText("Realizar Consulta");
        RealConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealConsultaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(RealConsulta);

        Eliminar.setText("Eliminar Agenda");
        jPopupMenu1.add(Eliminar);

        setBackground(new java.awt.Color(245, 244, 243));
        setPreferredSize(new java.awt.Dimension(460, 658));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("PACIENTES PARA EL DÍA:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 240, 40));

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
        });
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 430, 300));

        jCalendarProximas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCalendarProximas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(jCalendarProximas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 430, 250));

        jLabel20.setBackground(new java.awt.Color(255, 255, 225));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("SELECCIONE FECHA:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 270, 30));

        txtCitas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 160, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void RealConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealConsultaActionPerformed
        
        
        
    }//GEN-LAST:event_RealConsultaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount()==1){
//            System.out.println("Se ha hecho un click");
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    void mostrarTabla(String var){
        Connection cn = con2.conexion();
//        System.out.println(var);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Expediente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Hora");
        jTable1.setModel(modelo);
        
        String consul = "SELECT t_personales.expediente, t_personales.nombre, t_personales.apellidos,t_consultas.horaCita FROM t_personales INNER JOIN t_consultas ON t_personales.expediente = t_consultas.expediente AND t_consultas.fechacita = '"+var+"' ORDER BY nombre,apellidos ASC";

//      Hacer invisible la primer columna de la tabla
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);

        String datos[] =  new String[4];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(consul);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                
                modelo.addRow(datos);
            }
            
            jTable1.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(BusquedaCitas.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
//                    System.out.println( "cierra conexion a la base de datos" );    
                    try {
                        if(rs != null) rs.close();
                        if(st != null) st.close();
                        if(cn != null) cn.close();
                    } catch (SQLException ex) {
                        System.err.println( ex.getMessage() );    
                    }
                }
    }

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem RealConsulta;
    private com.toedter.calendar.JCalendar jCalendarProximas;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCitas;
    // End of variables declaration//GEN-END:variables
}

