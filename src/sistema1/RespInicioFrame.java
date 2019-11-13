package sistema1;

import Reportes.Reportes;
import com.sun.awt.AWTUtilities;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import Pruebas.interfaz;
        
public class RespInicioFrame extends javax.swing.JPanel {
    
    conexionDB con = new conexionDB();
    
    
    ConexionDBOriginal con2 = new ConexionDBOriginal();
    //Connection cn = con.conexion();
    Reportes rp = new Reportes();
    int registros = 0;
    String atributo="";
    Funciones fn = new Funciones();
    DefaultTableModel modeloReceta = new DefaultTableModel();
    
//TODOS LOS JPANELES QUE SE UTILIZAN PARA LA APLICACION
    JPanelAltaPacientes AP = new JPanelAltaPacientes();
    BusquedaCitas uno = new BusquedaCitas();
    HistorConsultas HC = new HistorConsultas();
    AltasMedicina AMedicine = new AltasMedicina();
    JPanelConsulta ocho = new JPanelConsulta();
    CobrosConsulta Cobros = new CobrosConsulta();
    
    JPanelHistoriaClinica diez;
    
    
    
    public RespInicioFrame() {
        initComponents();
        mostrarTabla1("");
        ponLaAyuda();
        BtnHelp.setVisible(false);
        //jButton3.setVisible(false);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14));
//        jPanelAltaPacientes.setVisible(false);
        //jPanel1.setBounds(100, 100, 700, 100);
//        cargafecha();

jLabel2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        HistorConsul = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        TodasConsul = new javax.swing.JMenuItem();
        jPanelBarraMenu = new javax.swing.JPanel();
        Paciente = new javax.swing.JLabel();
        RECETAnew = new javax.swing.JLabel();
        Chat = new javax.swing.JLabel();
        ALTASmtc = new javax.swing.JLabel();
        jLabel2CDxFC = new javax.swing.JLabel();
        Heredofamiliar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Pruebas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblHelp = new javax.swing.JLabel();
        BtnHelp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanTabla = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtConsul = new javax.swing.JTextField();
        jRadioApellido = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanTrabajo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        jPopupMenu1.add(jSeparator1);

        HistorConsul.setText("Historial Consultas");
        HistorConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorConsulActionPerformed(evt);
            }
        });
        jPopupMenu1.add(HistorConsul);
        jPopupMenu1.add(jSeparator2);

        TodasConsul.setText("Todas Consultas ");
        TodasConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodasConsulActionPerformed(evt);
            }
        });
        jPopupMenu1.add(TodasConsul);

        setBackground(new java.awt.Color(255, 255, 204));
        setMinimumSize(new java.awt.Dimension(1350, 700));
        setPreferredSize(new java.awt.Dimension(1920, 975));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBarraMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraMenu.setPreferredSize(new java.awt.Dimension(1366, 50));
        jPanelBarraMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Paciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addBN.png"))); // NOI18N
        Paciente.setToolTipText("Nuevo paciente o ver informacion de uno existente.");
        Paciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Paciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PacienteMouseClicked(evt);
            }
        });
        jPanelBarraMenu.add(Paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 60, 50));

        RECETAnew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RECETAnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultaBN.png"))); // NOI18N
        RECETAnew.setToolTipText("Realizar una nueva consulta medica.");
        RECETAnew.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RECETAnew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RECETAnew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RECETAnewMouseClicked(evt);
            }
        });
        jPanelBarraMenu.add(RECETAnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 60, 50));

        Chat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chatBN.png"))); // NOI18N
        Chat.setToolTipText("Muestra ventana de chat del programa.");
        Chat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChatMouseClicked(evt);
            }
        });
        jPanelBarraMenu.add(Chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 60, 50));

        ALTASmtc.setBackground(new java.awt.Color(255, 204, 153));
        ALTASmtc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ALTASmtc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ALTASmtc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/optionsBN.png"))); // NOI18N
        ALTASmtc.setToolTipText("Agregar nuevas opciones de Medicamento, tratamiento, estado civil y familiares.");
        ALTASmtc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ALTASmtc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ALTASmtcMouseClicked(evt);
            }
        });
        jPanelBarraMenu.add(ALTASmtc, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 60, 50));

        jLabel2CDxFC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2CDxFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2CDxFC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/citaBN.png"))); // NOI18N
        jLabel2CDxFC.setToolTipText("Consultar las proximas citas por dia.");
        jLabel2CDxFC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2CDxFC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2CDxFCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2CDxFCMouseEntered(evt);
            }
        });
        jPanelBarraMenu.add(jLabel2CDxFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 60, 50));

        Heredofamiliar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Heredofamiliar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heredofamiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modifyBN.png"))); // NOI18N
        Heredofamiliar.setToolTipText("Consultar, modificar o ver Antecedentes Heredo Familiares de algun paciente.");
        Heredofamiliar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Heredofamiliar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeredofamiliarMouseClicked(evt);
            }
        });
        jPanelBarraMenu.add(Heredofamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 60, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        jLabel1.setToolTipText("Recargar la lista de pacientes.");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanelBarraMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 60, 50));

        Pruebas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Pruebas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pruebas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clearBN.png"))); // NOI18N
        Pruebas.setToolTipText("Limpiar ventana.");
        Pruebas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pruebas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PruebasMouseClicked(evt);
            }
        });
        jPanelBarraMenu.add(Pruebas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 60, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/payMethod.png"))); // NOI18N
        jLabel2.setToolTipText("Realizar o consultar los cobros pendientes o realizados.");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanelBarraMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, 50));

        lblHelp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHelp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/helpBN.png"))); // NOI18N
        lblHelp.setToolTipText("Ventana de ayuda del sistema.");
        lblHelp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHelpMouseClicked(evt);
            }
        });
        jPanelBarraMenu.add(lblHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 60, 50));

        BtnHelp.setText("HELP");
        BtnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHelpActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(BtnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exitBN.png"))); // NOI18N
        jLabel3.setToolTipText("Salir del sistema.");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanelBarraMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 60, 50));

        add(jPanelBarraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanTabla.setBackground(new java.awt.Color(245, 244, 243));
        jPanTabla.setPreferredSize(new java.awt.Dimension(460, 658));
        jPanTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("CONSULTAR POR:");
        jPanTabla.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 180, 30));

        txtConsul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConsul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConsulKeyPressed(evt);
            }
        });
        jPanTabla.add(txtConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 290, 40));

        jRadioApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioApellido.setText("APELLIDO");
        jPanTabla.add(jRadioApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.setEditingColumn(0);
        jTable1.setEditingRow(0);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanTabla.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 440, 550));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("REPORTE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanTabla.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        add(jPanTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jPanTrabajo.setPreferredSize(new java.awt.Dimension(910, 658));
        jPanTrabajo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 658));
        jPanTrabajo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel2.setPreferredSize(new java.awt.Dimension(460, 658));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanTrabajo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        add(jPanTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtConsulKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsulKeyPressed
        String var = txtConsul.getText();
        
        if(jRadioApellido.isSelected())
        {
            atributo = "apellidos";
            mostrarTabla1(var);
        }else{
            atributo = "nombre";
            mostrarTabla1(var);
        }
    }//GEN-LAST:event_txtConsulKeyPressed

    private void PacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PacienteMouseClicked
        Connection cn = con2.conexion();    
        int fila = jTable1.getSelectedRow();
        String param = "";
        
        if(evt.getClickCount() > 1){
            limpiar(jPanTrabajo);
            jPanel1.setVisible(true);
        //    jPanel2.setVisible(true);
        
            jPanTrabajo.setLayout(new GridLayout(1,1));//TENIA -> 1,2
            jPanTrabajo.add(jPanel1);
//            jPanTrabajo.add(jPanel2);
           
            jPanTrabajo.validate();
            jPanTrabajo.setVisible(true);
            jPanTrabajo.setEnabled(true);
            
            limpiar(jPanel1);
       //     limpiar(jPanel2);
            AP.setVisible(true);
    //LETRERO DE PRUEBA
        //JOptionPane.showMessageDialog(null, "Opc 2");
            AP.jPanelHConsultas.setVisible(true);
            AP.llenacombo();
            AP.limpiarCampos();
            
            fn.limpiar(AP.jPaneDatosMedicine);
                    AP.limpiatabla();
                    AP.jLabel20.setVisible(false);
            jPanel1.setLayout(new GridLayout(1,1));
            jPanel1.add(AP);
            jPanel1.validate();
            jPanel1.setVisible(true);
            jPanel1.setEnabled(true);
            
    //CODIGO NUEVO PARA REFRESCAR, LIMPIAR Y DESELECCIONAR EL RADIOBUTTON APELLIDOS
            txtConsul.setText("");
            atributo = "nombre";
            mostrarTabla1("");
            jRadioApellido.setSelected(false);
        }
                    
            if(fila >= 0 && evt.getClickCount() == 1)
            {
//codigo para preparar el paneltrabajo
                String[] var=null;
                
                limpiar(jPanTrabajo);
                jPanel1.setVisible(true);
               // jPanel2.setVisible(true);
        
                jPanTrabajo.setLayout(new GridLayout(1,1));
                jPanTrabajo.add(jPanel1);
             //   jPanTrabajo.add(jPanel2);
                jPanTrabajo.validate();
                jPanTrabajo.setVisible(true);
                jPanTrabajo.setEnabled(true);
            
        String val = jTable1.getValueAt(fila,0).toString();
//tambien sirve asi FUCK!!!!!
//String sql = "SELECT A.* FROM t_personales AS A WHERE A.expediente = '"+val+"'";

        String sql = "SELECT * FROM t_personales WHERE expediente = '"+val+"'";
        Statement st = null;
        ResultSet rs = null;
            
        limpiar(jPanel1);
        limpiar(jPanel2);
            
        AP.setVisible(true);
        
        AP.jPanelHConsultas.setVisible(true);
        
        AP.llenacombo();//para vaciar los campos
        AP.jLabel20.setVisible(true);
      //  AP.limpiatabla();

           fn.limpiar(AP.jPaneDatosMedicine);
         
        jPanel1.setLayout(new GridLayout(1,1));
        jPanel1.add(AP);
        jPanel1.validate();
        jPanel1.setVisible(true);
        jPanel1.setEnabled(true);

            try {
                    st = cn.createStatement();
                    rs = st.executeQuery(sql);
                
                    while(rs.next())
                    {
                        param = rs.getString(1);
                        AP.txtExped.setText(param);
                        //JOptionPane.showMessageDialog(null, "FECHA"+rs.getDate(2));
                        AP.jDateChooser1.setDate(rs.getDate(2));
                        AP.txtNombre.setText(rs.getString(3));
                        AP.txtApes.setText(rs.getString(4));

                        AP.txtEdad.setText(rs.getString(5));
                        var = fn.DevuelveID(0, rs.getString(6), 1);
                        
//                      JOptionPane.showMessageDialog(null, "valor para vaciar al ComboBox"+var[1]);
                        AP.jComboBox1.setSelectedItem(var[1]);
                        AP.txtCalle.setText(rs.getString(7));
                        AP.txtpoblacion.setText(rs.getString(8));
                        
                        AP.txtTelefono.setText(rs.getString(9));
                        AP.txtCel.setText(rs.getString(10));
                        AP.txtPareja.setText(rs.getString(11));
                        AP.txtTiempo.setText(rs.getString(12));
                        AP.txtGestas.setText(rs.getString(13));
                        AP.txtAbortos.setText(rs.getString(14));
                        AP.txtPartos.setText(rs.getString(15));
                        AP.txtCesareas.setText(rs.getString(16));
/*                    for(int x = 1;x <= rs.getMetaData().getColumnCount(); x++)
                        System.out.println("Datos -> "+rs.getString(x));
*/
                    }
                     AP.mostrarTabla2(param);
            } catch (SQLException ex) {
                Logger.getLogger(RespInicioFrame.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
//                System.out.println( "cierra conexion a la base de datos" );    
             try {
                 if(st != null) st.close();                
                 if(cn !=null) cn.close();
             } catch (SQLException ex) {
//                 System.err.println( ex.getMessage() );    
             }
         } 
        }else{
                          limpiar(jPanTrabajo);
            jPanel1.setVisible(true);
        
            jPanTrabajo.setLayout(new GridLayout(1,1));
            jPanTrabajo.add(jPanel1);
         //   jPanTrabajo.add(jPanel2);
            jPanTrabajo.validate();
            jPanTrabajo.setVisible(true);
            jPanTrabajo.setEnabled(true);
            
            limpiar(jPanel1);
            
            AP.setVisible(true);
    //LETRERO DE PRUEBA
        //JOptionPane.showMessageDialog(null, "Opc 2");
            AP.jPanelHConsultas.setVisible(true);
            AP.llenacombo();
            AP.limpiarCampos();
            
            AP.jLabel20.setVisible(false);
            AP.limpiatabla();
            fn.limpiar(AP.jPaneDatosMedicine);
         
            jPanel1.setLayout(new GridLayout(1,1));
            jPanel1.add(AP);
            jPanel1.validate();
            jPanel1.setVisible(true);
            jPanel1.setEnabled(true);  
            }
    }//GEN-LAST:event_PacienteMouseClicked

    private void RECETAnewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RECETAnewMouseClicked
        int fila = jTable1.getSelectedRow();
        if(fila >= 0)// && (!jPanel2.isVisible()
        {
            jPanel2.setVisible(true);
            limpiar(jPanel2);
            
            ocho.setVisible(true);
   //llenas combos
            ocho.llenacomboMedicamento();
            ocho.llenacomboTratamiento();
//            ocho.llenacomboCostos();
            jPanel2.setLayout(new GridLayout(1,1));
            jPanel2.add(ocho);
            jPanel2.validate();
            jPanel2.setVisible(true);
            jPanel2.setEnabled(true);
                
            ocho.txtExpCM.setText(jTable1.getValueAt(fila, 0).toString());

            ocho.txtfecConsultaActual.setText(fn.setDateActual());
            ocho.limpiaCampos();
        }else
            JOptionPane.showMessageDialog(null,"Seleccione un paciente por favor.");
    }//GEN-LAST:event_RECETAnewMouseClicked

    private void ChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChatMouseClicked
        LectorEscritor Le = new LectorEscritor();
        Le.setEnabled(true);
        Le.setVisible(true);
    }//GEN-LAST:event_ChatMouseClicked

    private void ALTASmtcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALTASmtcMouseClicked
        AMedicine.setVisible(true);
        
        if(jPanel1.isVisible() || jPanel2.isVisible())
        {
            AMedicine.setEnabled(true);
            limpiar(jPanel1);
            jPanel1.setLayout(new GridLayout(1,1));
            jPanel1.add(AMedicine);
            jPanel1.validate();
            jPanel1.setVisible(true);
            jPanel1.setEnabled(true);
        }else{
                limpiar(jPanTrabajo);
                jPanel1.setVisible(true);
                jPanel2.setVisible(true);
                AMedicine.setEnabled(true);
        
                jPanTrabajo.setLayout(new GridLayout(1,2));
                jPanTrabajo.add(jPanel1);
                jPanTrabajo.add(jPanel2);
                jPanTrabajo.validate();
                jPanTrabajo.setVisible(true);
                jPanTrabajo.setEnabled(true);

                limpiar(jPanel1);
            jPanel1.setLayout(new GridLayout(1,1));
            jPanel1.add(AMedicine);
            jPanel1.validate();
            jPanel1.setVisible(true);
            jPanel1.setEnabled(true);
            
        }
/*        jPanel460x640P.setLayout(new GridLayout(1,1));
        jPanel460x640P.add(uno);
        jPanel460x640P.validate();
        jPanel460x640P.setVisible(true);
        jPanel460x640P.setEnabled(true);
*/// TODO add your handling code here:
    }//GEN-LAST:event_ALTASmtcMouseClicked

    private void jLabel2CDxFCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2CDxFCMouseClicked
        uno.setVisible(true);
        
        limpiar(jPanTrabajo);
        jPanel1.setVisible(true);
        limpiar(jPanel1);
        jPanel2.setVisible(true);

        jPanel1.setLayout(new GridLayout(1,1));
        jPanel1.add(uno);
        jPanel1.validate();
        jPanel1.setVisible(true);
        jPanel1.setEnabled(true);
        
        jPanTrabajo.setLayout(new GridLayout(1,2));
        jPanTrabajo.add(jPanel1);
        jPanTrabajo.add(jPanel2);
        jPanTrabajo.validate();
        jPanTrabajo.setVisible(true);
        jPanTrabajo.setEnabled(true);
        
    }//GEN-LAST:event_jLabel2CDxFCMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        rp.ReportePaciente();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void HeredofamiliarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeredofamiliarMouseClicked
        int fila = jTable1.getSelectedRow();
        String var="";        
        if(fila >= 0)
        {
        var=jTable1.getValueAt(fila, 0).toString();
        diez = new JPanelHistoriaClinica(Integer.parseInt(var));
        
        if(fn.ValidaHeredofamiliarBool(var))
            diez.jLabel16.setVisible(false);        
        diez.txtexpediente.setText(var);
        limpiar(jPanTrabajo);//limpiamos pane principal
        diez.cargaDatos();
        diez.llenacombo();
            //diez.txtexpediente.setText(jTable1.getValueAt(fila, 0).toString());
        
        diez.setVisible(true);
        jPanTrabajo.setLayout(new GridLayout(1,1));
        jPanTrabajo.add(diez);
        jPanTrabajo.validate();
        jPanTrabajo.setVisible(true);
        jPanTrabajo.setEnabled(true);
        }
        else
            JOptionPane.showMessageDialog(null, "No selecciono nada");
        
    }//GEN-LAST:event_HeredofamiliarMouseClicked

    private void PruebasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PruebasMouseClicked
        limpiar(jPanTrabajo);
    //    limpiar(jPanHeredo);
        limpiar(jPanel1);
        limpiar(jPanel2);
        
        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        
        jPanTrabajo.setLayout(new GridLayout(1,2));
        jPanTrabajo.add(jPanel1);
        jPanTrabajo.add(jPanel2);
        
        jPanTrabajo.validate();
        jPanTrabajo.setVisible(true);
        jPanTrabajo.setEnabled(true);

        txtConsul.setText("");
        atributo = "nombre";
        mostrarTabla1("");
        jRadioApellido.setSelected(false);
        
    }//GEN-LAST:event_PruebasMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    //    jRadioApellido.isSelected();
        txtConsul.setText("");
        atributo = "nombre";
        mostrarTabla1("");
        jRadioApellido.setSelected(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2CDxFCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2CDxFCMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2CDxFCMouseEntered

    private void HistorConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorConsulActionPerformed
        int fila = jTable1.getSelectedRow();
        String var="";
        
        if(fila >= 0)
        {
            limpiar(jPanTrabajo);
            jPanel1.setVisible(true);
            jPanel2.setVisible(true);
        
            jPanTrabajo.setLayout(new GridLayout(1,2));
            jPanTrabajo.add(jPanel1);
            jPanTrabajo.add(jPanel2);
            jPanTrabajo.validate();
            jPanTrabajo.setVisible(true);
            jPanTrabajo.setEnabled(true);
            
            var=jTable1.getValueAt(fila, 0).toString();
            HC.setEnabled(true);
            HC.setVisible(true);
            
            limpiar(jPanel1);
            
            jPanel1.setLayout(new GridLayout(1,1));
            jPanel1.add(HC);
            jPanel1.validate();
            jPanel1.setVisible(true);
            jPanel1.setEnabled(true);
            
            HC.txtExped.setText(var);
            HC.txtNombre.setText(jTable1.getValueAt(fila, 1).toString());
            HC.txtApPater.setText(jTable1.getValueAt(fila, 2).toString());
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione un paciente.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_HistorConsulActionPerformed

    private void TodasConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodasConsulActionPerformed
        int fila = jTable1.getSelectedRow();
        String var="";
        
        if(fila >= 0 && jPanel1.isVisible())
        {
            limpiar(jPanel1);
            var=jTable1.getValueAt(fila, 0).toString();
            HC.setEnabled(true);
            HC.setVisible(true);
            jPanel1.setLayout(new GridLayout(1,1));
            jPanel1.add(HC);
            jPanel1.validate();
            jPanel1.setVisible(true);
            jPanel1.setEnabled(true);
            
            HC.txtExped.setText("/");
            HC.txtNombre.setText("/");
            HC.txtApPater.setText("/");
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione un paciente.");
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_TodasConsulActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    int fila = jTable1.getSelectedRow();
    String var="";
        
    if(fila >= 0)
    {
        var=jTable1.getValueAt(fila, 0).toString();
//        diez = new JPanelHistoriaClinica(Integer.parseInt(var));
//        diez.txtexpediente.setText(var);
        Cobros.txtBuscar.setText(var);
        Cobros.JRBExped.setSelected(true);
        limpiar(jPanTrabajo);
//diez.cargaDatos();
//diez.llenacombo();
//diez.txtexpediente.setText(jTable1.getValueAt(fila, 0).toString());
        Cobros.setVisible(true);
        jPanTrabajo.setLayout(new GridLayout(1,1));
        jPanTrabajo.add(Cobros);
        jPanTrabajo.validate();
        jPanTrabajo.setVisible(true);
        jPanTrabajo.setEnabled(true);
    }else
        JOptionPane.showMessageDialog(null, "No selecciono nada");

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        
        if (evt.getClickCount() > 1)
        {
        Connection cn = con2.conexion();
            String[] arr = null;
            String param="";
            limpiar(jPanTrabajo);
            jPanel1.setVisible(true);
//            jPanel2.setVisible(true);
        
            jPanTrabajo.setLayout(new GridLayout(1,1));
            jPanTrabajo.add(jPanel1);
//            jPanTrabajo.add(jPanel2);
            jPanTrabajo.validate();
            jPanTrabajo.setVisible(true);
            jPanTrabajo.setEnabled(true);

            int fila = jTable1.getSelectedRow();
            String val = jTable1.getValueAt(fila,0).toString();
            
            String sql = "SELECT * FROM t_personales WHERE expediente = '"+val+"'";
            Statement st = null;
            ResultSet rs = null;
            
            limpiar(jPanel1);
            
            AP.setVisible(true);
            AP.jPanelHConsultas.setVisible(true);
            AP.jLabel20.setVisible(true);
            fn.limpiar(AP.jPaneDatosMedicine);
            
            jPanel1.setLayout(new GridLayout(1,1));
            jPanel1.add(AP);
            jPanel1.validate();
            jPanel1.setVisible(true);
            jPanel1.setEnabled(true);

            try {
                st = cn.createStatement();
                rs = st.executeQuery(sql);
                
                while(rs.next())
                {
                    param=rs.getString(1);
                        AP.txtExped.setText(param);
//                        JOptionPane.showMessageDialog(null, "FECHA"+rs.getDate(2), sql, HEIGHT);
                        AP.jDateChooser1.setDate(rs.getDate(2));
                        AP.txtNombre.setText(rs.getString(3));
                        AP.txtApes.setText(rs.getString(4));
                        
                        AP.txtEdad.setText(rs.getString(5));
                        
                        arr = fn.DevuelveID(0, rs.getString((6)), 1);
                        AP.jComboBox1.setSelectedItem(arr[1]);

                        AP.txtCalle.setText(rs.getString(7));
                     
                        AP.txtpoblacion.setText(rs.getString(8));
                        
                        AP.txtTelefono.setText(rs.getString(9));
                        AP.txtCel.setText(rs.getString(10));
                        AP.txtPareja.setText(rs.getString(11));
                        AP.txtTiempo.setText(rs.getString(12));
                        AP.txtGestas.setText(rs.getString(13));
                        AP.txtPartos.setText(rs.getString(14));
                        AP.txtAbortos.setText(rs.getString(15));
                        AP.txtCesareas.setText(rs.getString(16));

                }
            } catch (SQLException ex) {
                Logger.getLogger(RespInicioFrame.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                
//             System.out.println("cierra conexion a la base de datos");    
             try {
                                
                 if(st != null) st.close();                
                 if(cn !=null) cn.close();
             } catch (SQLException ex) {
                 System.err.println(ex.getMessage()); 
//                 System.out.println("Error al cerrar la conexon");
             }
         }
        
            AP.mostrarTabla2(param);
  
        //    JOptionPane.showMessageDialog(this, "valor :"+val );
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void lblHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHelpMouseClicked
        BtnHelp.doClick();
    }//GEN-LAST:event_lblHelpMouseClicked

    private void BtnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHelpActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
        
            
    }//GEN-LAST:event_jLabel3MouseClicked

    void mostrarTabla1(String var){
        int band = 0;
        Connection cn = con2.conexion();
        
        DefaultTableModel modelo = new DefaultTableModel()
        { 
            @Override
            public boolean isCellEditable (int fila, int columna) {
                return false;
            }
        };
        
        String consul="";
        

            if(atributo.equals("nombre") || atributo.equals("")){
                consul = "SELECT expediente,nombre,apellidos from t_personales WHERE (CONCAT(nombre,' ',apellidos)) LIKE '"+var+"%' ORDER BY nombre,apellidos ASC";
                modelo.addColumn("EXP");
                modelo.addColumn("NOMBRE");
                modelo.addColumn("APELLIDOS");
                band = 0;
            }else{
               if(atributo.equals("apellidos")){
            consul = "SELECT expediente,nombre,apellidos from t_personales WHERE (CONCAT(apellidos,' ',nombre)) LIKE '"+var+"%' ORDER BY apellidos ASC";
            modelo.addColumn("EXP");
            modelo.addColumn("APELLIDOS");
            modelo.addColumn("NOMBRE");
            band = 1;
               }
         }
         
        
        jTable1.setModel(modelo);
        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
        columnModel.getColumn(1).setPreferredWidth(50);

        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);

        String datos[] =  new String[3];//tenia 4
        Statement st = null;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(consul);
            if(band ==0)
            {
            while(rs.next()){
                datos[0] =rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            }else{
                while(rs.next()){
                datos[0] =rs.getString(1);
                datos[1] = rs.getString(3);
                datos[2] = rs.getString(2);
                modelo.addRow(datos);
            }
            }
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(RespInicioFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
//             System.out.println("cierra conexion a la base de datos");    
             try {
                    if(rs != null) rs.close();              
                    if(st != null) st.close();                
                    if(cn !=null) cn.close();
             } catch (SQLException ex) {
             }
         }
    }    
    
    
    private int ultimoRegistro(){
        Connection cn = con.conexion();
        String ultimo="";
        int num=0;
        String sql = "SELECT expediente FROM paciente";
        Statement st = null;
        ResultSet rs= null;
        
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                ultimo = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RespInicioFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                
//             System.out.println("cierra conexion a la base de datos");    
             try {
                    if(rs != null) rs.close();
                    if(st != null) st.close();                
                    if(cn != null) cn.close();
             } catch (SQLException ex) {
             }
         }
        num=Integer.parseInt(ultimo);
        
        return num+1;
    }
    
    private Date cargafecha(){
        //DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaAct = new Date();
//        jDateChooser1.setDate(fechaAct);
        return fechaAct;
    }
    
    void llenacombo(){
//        jComboBox1.removeAllItems();
        Connection cn = con.conexion();
        String consul = "SELECT estado from civil";
        int i = 1;
        Statement st = null;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(consul);
            while(rs.next()){
//                jComboBox1.addItem(rs.getString(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RespInicioFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                
//             System.out.println("cierra conexion a la base de datos");    
             try {
                    if(rs != null) rs.close();
                    if(st != null) st.close();                
                    if(cn !=null) cn.close();
             } catch (SQLException ex) {
//                 System.err.println(ex.getMessage()); 
//                 System.out.println("Error al cerrar la conexon");
             }
         }
    }

///++++METODOS RECETA MEDICA
    void llenacomboMedicamento(){
        Connection cn = con.conexion();
        String consul = "SELECT descripcion from medicamento";
//        jComboMedicamento.removeAllItems();
        int i = 1;
        Statement st = null;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(consul);
            while(rs.next()){
//               jComboMedicamento.addItem(rs.getString(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AltasMedicina.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                
//             System.out.println("cierra conexion a la base de datos");    
             try {
                    if(rs != null) rs.close();              
                    if(st != null) st.close();                
                    if(cn !=null) cn.close();
             } catch (SQLException ex) {
//                 System.err.println(ex.getMessage()); 
//                 System.out.println("Error al cerrar la conexon");
             }
         }
    }

    void llenacomboTratamiento(){
        Connection cn = con.conexion();
        String consul = "SELECT dosis from tratamiento";
//        jComboTratamiento.removeAllItems();
        int i = 1;
        Statement st = null;
        ResultSet rs = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(consul);
            while(rs.next()){
//                jComboTratamiento.addItem(rs.getString(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RespInicioFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                
//             System.out.println("cierra conexion a la base de datos");    
             try {
                    if(rs != null) rs.close();
                    if(st != null) st.close();                
                    if(cn !=null) cn.close();
             } catch (SQLException ex) {
//                 System.err.println(ex.getMessage()); 
//                 System.out.println("Error al cerrar la conexon");
             }
         }
    }
    
    void LlenaTabla(String medicamento, String tratamiento){
        Object [] fila=new Object[2];
        fila[0]=medicamento;
        fila[1]=tratamiento;
        modeloReceta.addRow(fila);
    }
    
    private int ultimoRegistroConsulta(){
        Connection cn =con.conexion();
        String ultimo="";
        int num=0,i=1;
        String sql = "SELECT * FROM consulta";
        Statement st = null;
        ResultSet rs= null;
        
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            rs.beforeFirst();
            while(rs.next())
            {
                ultimo = rs.getString(1);
//                System.out.println(ultimo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RespInicioFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                
//             System.out.println("cierra conexion a la base de datos");    
             try {
                 if(rs != null) rs.close();               
                 if(st != null) st.close();                
                 if(cn !=null) cn.close();
             } catch (SQLException ex) {
//                 System.err.println(ex.getMessage()); 
//                 System.out.println("Error al cerrar la conexon");
             }
         }
        num=Integer.parseInt(ultimo);
        
        return num;
    }
        
//*****NUEVOS METODOS PANTALLAS ARREGLADAS
    public void limpiar(JPanel Pn)
    {
        Pn.removeAll();
        Pn.validate();
        Pn.repaint();
    }
    
    
// METODOS HELP
    private void ponLaAyuda() {
	try {
	// Carga el fichero de ayuda
            File fichero = new File("C:/Sistema MedicoLAPTOP/SistemaMedicoLAPTOP/src/help/help_set.hs");
            
            URL hsURL = fichero.toURI().toURL();
	// Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();
	// Pone ayuda a item de menu al pulsarlo y a F1 en ventana
	// principal y secundaria.
            hb.enableHelpOnButton(BtnHelp, "aplicacion", helpset);
                        
        //hb.enableHelpKey(this.getParent(), "ventana_principal",helpset);
        //hb.enableHelpKey(secundaria.getContentPane(), "ventana_secundaria",
        //helpset);
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALTASmtc;
    public javax.swing.JButton BtnHelp;
    private javax.swing.JLabel Chat;
    private javax.swing.JLabel Heredofamiliar;
    private javax.swing.JMenuItem HistorConsul;
    public javax.swing.JLabel Paciente;
    private javax.swing.JLabel Pruebas;
    public javax.swing.JLabel RECETAnew;
    private javax.swing.JMenuItem TodasConsul;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2CDxFC;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanTabla;
    public javax.swing.JPanel jPanTrabajo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBarraMenu;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioApellido;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JTextField txtConsul;
    // End of variables declaration//GEN-END:variables


}

//CODIGO UTILIZABLE
/*        Connection cn = con.conexion();
        int fila = jTable1.getSelectedRow();
        PreparedStatement preparedStmt = null;
        String var="";
        if(fila >= 0){
            var=jTable1.getValueAt(fila, 0).toString();
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Seguro que desea eliminar al paciente:"+var,"Borrar",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
            try {
            String query = "delete from paciente where expediente = '"+var+"' ";
            preparedStmt = cn.prepareStatement(query);
            preparedStmt.execute();
      
            JOptionPane.showMessageDialog(null, "Eliminado");

//            limpiarCampos();
            mostrarTabla1("");

        } catch (SQLException ex) {
            Logger.getLogger(RespInicioFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            System.out.println("cierra conexion a la base de datos");    
            try {
                if(preparedStmt != null) preparedStmt.close();                
                if(cn !=null) cn.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage()); 
                System.out.println("Error al cerrar la conexon");
            }//catch
        }//finally 
            } else {
                JOptionPane.showMessageDialog(null,"No se borro el Expediente:"+var);
            }

        }else
            JOptionPane.showMessageDialog(null,"no selecciono nada");
*/