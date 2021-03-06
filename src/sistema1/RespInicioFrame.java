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
    Valoracion jPanValoracion;
    ExamSanguineos sanguineos;
    
    
    
    public RespInicioFrame() {
        initComponents();
        mostrarTabla1("");
        ponLaAyuda();
        //BtnHelp.setVisible(false);
        //jButton3.setVisible(false);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14));
//        jPanelAltaPacientes.setVisible(false);
        //jPanel1.setBounds(100, 100, 700, 100);
//        cargafecha();
    //txtValoracion.setVisible(false);
    //Heredofamiliar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        HistorConsul = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        TodasConsul = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanelBarraMenu = new javax.swing.JPanel();
        BtnHelp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanTabla = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtConsul = new javax.swing.JTextField();
        jRadioApellido = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setBackground(new java.awt.Color(255, 255, 204));
        setMinimumSize(new java.awt.Dimension(1350, 700));
        setPreferredSize(new java.awt.Dimension(1920, 975));

        jPanelBarraMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraMenu.setPreferredSize(new java.awt.Dimension(1366, 50));
        jPanelBarraMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnHelp.setBackground(new java.awt.Color(255, 255, 255));
        BtnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/helpBN.png"))); // NOI18N
        BtnHelp.setToolTipText("Muestra la ventana de ayuda.");
        BtnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHelpActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(BtnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 60, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modifyBN.png"))); // NOI18N
        jButton1.setToolTipText("Crea o visualiza una nota medica.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 60, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stethoscope.png"))); // NOI18N
        jButton2.setToolTipText("Muestra antecedente heredofamiliar del paciente.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 60, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exam_blood32px.png"))); // NOI18N
        jButton3.setToolTipText("Guarda o visualiza resultado de analisis sanguineos.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 60, 50));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/payMethod.png"))); // NOI18N
        jButton4.setToolTipText("Realizar o consultar los cobros pendientes o realizados.");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 60, 50));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        jButton5.setToolTipText("Recargar la lista de pacientes.");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 60, 50));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addBN.png"))); // NOI18N
        jButton6.setToolTipText("Nuevo paciente o ver informacion de uno existente.");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 60, 50));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/citaBN.png"))); // NOI18N
        jButton7.setToolTipText("Consultar las proximas citas por dia.");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 60, 50));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultaBN.png"))); // NOI18N
        jButton8.setToolTipText("Realizar una nueva consulta medica.");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 60, 50));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/optionsBN.png"))); // NOI18N
        jButton9.setToolTipText("Agregar nuevas opciones de Medicamento, tratamiento, estado civil y familiares.");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 60, 50));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chatBN.png"))); // NOI18N
        jButton10.setToolTipText("Muestra ventana de chat del programa.");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 60, 50));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clearBN.png"))); // NOI18N
        jButton11.setToolTipText("Limpiar ventana.");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 60, 50));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exitBN.png"))); // NOI18N
        jButton12.setToolTipText("Salir del sistema.");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanelBarraMenu.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 60, 50));

        jPanTabla.setBackground(new java.awt.Color(245, 244, 243));
        jPanTabla.setPreferredSize(new java.awt.Dimension(460, 658));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("CONSULTAR POR:");

        txtConsul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConsul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConsulKeyPressed(evt);
            }
        });

        jRadioApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioApellido.setText("APELLIDO");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
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

        javax.swing.GroupLayout jPanTablaLayout = new javax.swing.GroupLayout(jPanTabla);
        jPanTabla.setLayout(jPanTablaLayout);
        jPanTablaLayout.setHorizontalGroup(
            jPanTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanTablaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jRadioApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanTablaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtConsul, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanTablaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanTablaLayout.setVerticalGroup(
            jPanTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanTablaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioApellido))
                .addGap(5, 5, 5)
                .addComponent(txtConsul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanTrabajo.setPreferredSize(new java.awt.Dimension(910, 658));
        jPanTrabajo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 658));
        jPanTrabajo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel2.setPreferredSize(new java.awt.Dimension(460, 658));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanTrabajo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
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
    }//GEN-LAST:event_TodasConsulActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if (evt.getClickCount() > 1)
           {
           Connection cn = con2.conexion();
           String[] arr = null;
           String param="",sex="";
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
                        //AP.txtEdad.setText(rs.getString(5));
                        AP.jDateChooser3.setDate(rs.getDate(5));
                        arr = fn.DevuelveID(0, rs.getString((6)), 1);
                        AP.jComboBox1.setSelectedItem(arr[1]);
                        AP.txtCalle.setText(rs.getString(7));
                        AP.txtpoblacion.setText(rs.getString(8));
                        sex = rs.getString(9);
                        
                        if(sex.equals("F")){
                            AP.jRadioFeminazi.setSelected(true);
                            AP.jPanelHConsultas.setVisible(true);
                        }else{
                            AP.jRadioMen.setSelected(true);
                            AP.jPanelHConsultas.setVisible(false);
                        } 
                        AP.txtCel.setText(rs.getString(10));
                        
                        AP.txtGestas.setText(rs.getString(11));
                        AP.txtPartos.setText(rs.getString(12));
                        AP.txtAbortos.setText(rs.getString(13));
                        AP.txtCesareas.setText(rs.getString(14));

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
           }
    }//GEN-LAST:event_jTable1MousePressed

    private void BtnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnHelpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
        diez.llenacombo();
        diez.cargaDatos();
 
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
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        int fila = jTable1.getSelectedRow();////txtValoracion
        String var="";        
        if(fila >= 0)
        {
        var=jTable1.getValueAt(fila, 0).toString();
        jPanValoracion = new Valoracion(Integer.parseInt(var));     
//        if(fn.ValidaHeredofamiliarBool(var))
  //          diez.jLabel16.setVisible(false);           
        //diez.txtexpediente.setText(var);
        limpiar(jPanTrabajo);//limpiamos pane principal
        //diez.cargaDatos();
        //diez.llenacombo();
            //diez.txtexpediente.setText(jTable1.getValueAt(fila, 0).toString());     
        jPanValoracion.setVisible(true);
        jPanTrabajo.setLayout(new GridLayout(1,1));
        jPanTrabajo.add(jPanValoracion);
        jPanTrabajo.validate();
        jPanTrabajo.setVisible(true);
        jPanTrabajo.setEnabled(true);
        }
        else
            JOptionPane.showMessageDialog(null, "No selecciono nada");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila = jTable1.getSelectedRow();////txtValoracion
        String var="";        
        if(fila >= 0)
        {
        var=jTable1.getValueAt(fila, 0).toString();
        //System.out.println("Param: "+var);
        sanguineos = new ExamSanguineos(Integer.parseInt(var));     
//        if(fn.ValidaHeredofamiliarBool(var))
  //          diez.jLabel16.setVisible(false);           
        //diez.txtexpediente.setText(var);
        limpiar(jPanTrabajo);//limpiamos pane principal
        //diez.cargaDatos();
        //diez.llenacombo();
            //diez.txtexpediente.setText(jTable1.getValueAt(fila, 0).toString());     
        sanguineos.setVisible(true);
        jPanTrabajo.setLayout(new GridLayout(1,1));
        jPanTrabajo.add(sanguineos);
        jPanTrabajo.validate();
        jPanTrabajo.setVisible(true);
        jPanTrabajo.setEnabled(true);
        }
        else
            JOptionPane.showMessageDialog(null, "No selecciono nada");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
    int fila = jTable1.getSelectedRow();
    String var="";        
    if(fila >= 0)
    {
        var=jTable1.getValueAt(fila, 0).toString();
//        diez = new JPanelHistoriaClinica(Integer.parseInt(var));
//        diez.txtexpediente.setText(var);
        Cobros.txtBuscar.setText(var);
      //  Cobros.JRBExped.setSelected(true);
        limpiar(jPanTrabajo);
//diez.cargaDatos();
//diez.llenacombo();
//diez.txtexpediente.setText(jTable1.getValueAt(fila, 0).toString());
        Cobros.setVisible(true);
        limpiar(Cobros.PanelMedicine);
        jPanTrabajo.setLayout(new GridLayout(1,1));
        jPanTrabajo.add(Cobros);
        jPanTrabajo.validate();
        jPanTrabajo.setVisible(true);
        jPanTrabajo.setEnabled(true);
    }else
        JOptionPane.showMessageDialog(null, "No selecciono nada");
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtConsul.setText("");
        atributo = "nombre";
        mostrarTabla1("");
        jRadioApellido.setSelected(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Connection cn = con2.conexion();    
        int fila = jTable1.getSelectedRow();
        String param = "",sex="";
        
        if(evt.ACTION_PERFORMED > 1){
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
                    
            if(fila >= 0 && evt.ACTION_PERFORMED == 1)
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

                        //AP.txtEdad.setText(rs.getString(5));
                       AP.jDateChooser3.setDate(rs.getDate(5));
                        var = fn.DevuelveID(0, rs.getString(6), 1);
                        
//                      JOptionPane.showMessageDialog(null, "valor para vaciar al ComboBox"+var[1]);
                        AP.jComboBox1.setSelectedItem(var[1]);
                        AP.txtCalle.setText(rs.getString(7));
                        AP.txtpoblacion.setText(rs.getString(8));
                       sex = rs.getString(9);
                       System.out.println("Sexo = "+sex);
                        if(sex.equals("F")){
                            AP.jRadioFeminazi.setSelected(true);
                            AP.jPanelHConsultas.setVisible(true);
                        }else{
                            AP.jRadioMen.setSelected(true);
                            AP.jPanelHConsultas.setVisible(false);
                        } 
                       // AP.txtTelefono.setText(rs.getString(9));
                        AP.txtCel.setText(rs.getString(10));
                        AP.txtGestas.setText(rs.getString(11));
                        AP.txtAbortos.setText(rs.getString(12));
                        AP.txtPartos.setText(rs.getString(13));
                        AP.txtCesareas.setText(rs.getString(14));
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

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
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

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
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

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
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
*/
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        LectorEscritor Le = new LectorEscritor();
        Le.setEnabled(true);
        Le.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
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
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        System.exit(0);            
    }//GEN-LAST:event_jButton12ActionPerformed

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
                consul = "SELECT expediente,nombre,apellidos from t_personales WHERE (CONCAT(nombre,' ',apellidos)) LIKE '"+var+"%' ORDER BY nombre,apellidos ASC LIMIT 50";
                modelo.addColumn("EXP");
                modelo.addColumn("NOMBRE");
                modelo.addColumn("APELLIDOS");
                band = 0;
            }else{
               if(atributo.equals("apellidos")){
            consul = "SELECT expediente,nombre,apellidos from t_personales WHERE (CONCAT(apellidos,' ',nombre)) LIKE '"+var+"%' ORDER BY apellidos ASC LIMIT 50";
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
            File fichero = new File("C:/SistemaMedico1366-768/src/help/help_set.hs");           
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
    public javax.swing.JButton BtnHelp;
    private javax.swing.JMenuItem HistorConsul;
    private javax.swing.JMenuItem TodasConsul;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
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