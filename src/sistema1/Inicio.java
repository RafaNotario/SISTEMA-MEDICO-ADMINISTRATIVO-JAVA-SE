package sistema1;

import com.sun.awt.AWTUtilities;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

// Comentar para que no se mueva
    int x,y;

    private static conexionDB con2;
    RespInicioFrame dos;
//    Connection cn = con.conexion();
    
    public Inicio() {
        this.setUndecorated(true);
        initComponents();
        cargarLogin();
        getScreenSize();
        jLabel21.setVisible(false);
        this.setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27);
        AWTUtilities.setWindowShape(this, forma);
        jPanel1.setSize(500,java.awt.Toolkit.getDefaultToolkit().getScreenSize().width);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabelusuario = new javax.swing.JLabel();
        jTextFieldUusario = new javax.swing.JTextField();
        jLabelpass = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonIniciarsesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA NUÑO");
        setBackground(new java.awt.Color(102, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1350, 640));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1350, 640));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 708));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelusuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelusuario.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabelusuario.setText("Usuario:");
        jPanel2.add(jLabelusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 110, 50));

        jTextFieldUusario.setBackground(new java.awt.Color(87, 89, 88));
        jTextFieldUusario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldUusario.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUusario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUusarioKeyPressed(evt);
            }
        });
        jPanel2.add(jTextFieldUusario, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 220, 50));

        jLabelpass.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabelpass.setText("Contraseña:");
        jPanel2.add(jLabelpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 120, 50));

        jPasswordField1.setBackground(new java.awt.Color(87, 89, 88));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, 220, 50));

        jButtonIniciarsesion.setBackground(new java.awt.Color(102, 102, 102));
        jButtonIniciarsesion.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonIniciarsesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniciarsesion.setText("Iniciar Sesion");
        jButtonIniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarsesionActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonIniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, 170, 50));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PEDIATRIA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 400, 70));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MEDICINA GENERAL, ESPECIALIDAD");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 490, 70));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dr. Rene Jimenez Cano");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 400, 70));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 10, 180));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/simbolo_medicina_recortada.png"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 400, 380));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UNIVERSIDAD POPULAR DEL ESTADO DE PUEBLA          CED. PROF. -------       CED. ESPEC. ------");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 680, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        PanelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(1350, 690));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1366, 708));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1350, 60));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("SISTEMA PARA EL CONTROL DE PACIENTES");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 530, 40));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rojo.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 40, 40));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarillo.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 40, 40));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x-x, p.y-y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
    jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rojo_c.png")));
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
    jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rojo.png")));
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
    this.setExtendedState(Inicio.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
    jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarillo_c.png")));
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
    jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarillo.png")));
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
    jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde_c.png")));
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
    jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde.png")));        
    }//GEN-LAST:event_jLabel22MouseExited

    private void jButtonIniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarsesionActionPerformed
        String user = jTextFieldUusario.getText();
        String pass = jPasswordField1.getText();
        if(user.equals("10") && pass.equals("135"))
        {
            try {
                limpiar();
                dos = new RespInicioFrame();
                dos.setVisible(true);
                
                PanelPrincipal.setLayout(new GridLayout(1,1));
                PanelPrincipal.add(dos);
                PanelPrincipal.validate();
                PanelPrincipal.setVisible(true);
                PanelPrincipal.setEnabled(true);
            } catch (Throwable ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else
        {
            JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrecto");
        }
    }//GEN-LAST:event_jButtonIniciarsesionActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            jButtonIniciarsesion.doClick();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextFieldUusarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUusarioKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            jButtonIniciarsesion.doClick();
        }
    }//GEN-LAST:event_jTextFieldUusarioKeyPressed

    
    void cargarLogin(){
        limpiar();
        jPanel2.setVisible(true);
        PanelPrincipal.setLayout(new GridLayout(1,1));
        PanelPrincipal.add(jPanel2);
        PanelPrincipal.validate();
        PanelPrincipal.setVisible(true);
        PanelPrincipal.setEnabled(true);
    }
    
    public void limpiar()
    {
        PanelPrincipal.removeAll();
        PanelPrincipal.validate();
        PanelPrincipal.repaint();
    }
    
    public void getScreenSize(){
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        System.out.println("ancho="+ancho+"\n alto="+alto);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelPrincipal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonIniciarsesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelpass;
    private javax.swing.JLabel jLabelusuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldUusario;
    // End of variables declaration//GEN-END:variables
}
