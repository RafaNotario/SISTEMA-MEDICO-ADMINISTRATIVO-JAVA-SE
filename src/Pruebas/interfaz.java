
package Pruebas;

import com.sun.awt.AWTUtilities;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import sistema1.Inicio;
import sistema1.RespInicioFrame;

public class interfaz extends javax.swing.JFrame {
    int x,y;   
    public interfaz() {
        this.setUndecorated(true);
        initComponents();
        //jLabelamarillo.setVisible(false);
        this.setLocationRelativeTo(null);
        Shape forma= new RoundRectangle2D.Double(0,0,this.getBounds().width, this.getBounds().height,27,27);
        AWTUtilities.setWindowShape(this, forma);//NeuroBio@.-
    }    
   
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/iconHos.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonIniciarsesion = new javax.swing.JButton();
        jLabelrojo = new javax.swing.JLabel();
        jLabelicono = new javax.swing.JLabel();
        jLabelusuario = new javax.swing.JLabel();
        jLabelverde = new javax.swing.JLabel();
        jLabelamarillo = new javax.swing.JLabel();
        jLabelpass = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextFieldUusario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setModalExclusionType(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA MEDICO ADMINISTRATIVO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 350, 20));

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MEDICINA DEL ENFERMO EN ESTADO CRITICO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 580, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Postgraduado Centro Médico Nacional de Occidente IMSS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 490, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dr. Armando Velázquez Merino");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 510, 70));

        jButtonIniciarsesion.setBackground(new java.awt.Color(153, 153, 153));
        jButtonIniciarsesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonIniciarsesion.setText("Iniciar Sesion");
        jButtonIniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarsesionActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonIniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 130, 40));

        jLabelrojo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelrojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rojo.png"))); // NOI18N
        jLabelrojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelrojoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelrojoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelrojoMouseExited(evt);
            }
        });
        jPanel1.add(jLabelrojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 30, 30));

        jLabelicono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-velazquez2.jpg"))); // NOI18N
        jPanel1.add(jLabelicono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 320, 240));

        jLabelusuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelusuario.setForeground(new java.awt.Color(0, 102, 102));
        jLabelusuario.setText("Usuario:");
        jPanel1.add(jLabelusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 80, 30));

        jLabelverde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde.png"))); // NOI18N
        jLabelverde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelverdeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelverdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelverdeMouseExited(evt);
            }
        });
        jPanel1.add(jLabelverde, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 30, 30));

        jLabelamarillo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelamarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarillo.png"))); // NOI18N
        jLabelamarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelamarilloMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelamarilloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelamarilloMouseExited(evt);
            }
        });
        jPanel1.add(jLabelamarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 30, 30));

        jLabelpass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelpass.setForeground(new java.awt.Color(0, 102, 102));
        jLabelpass.setText("Password:");
        jPanel1.add(jLabelpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 90, 30));

        jPasswordField1.setBackground(new java.awt.Color(0, 153, 153));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 180, 30));

        jTextFieldUusario.setBackground(new java.awt.Color(0, 153, 153));
        jTextFieldUusario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldUusario.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldUusario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 180, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 580, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("UNIVERSIDAD DE GUADALAJARA          CED. PROF. 3503456       CED. ESPEC.6926261");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 580, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Certificado por el Consejo Mexicano de Medicina  Critica");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 490, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelrojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelrojoMouseClicked
     System.exit(0);
    }//GEN-LAST:event_jLabelrojoMouseClicked

    private void jLabelrojoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelrojoMouseEntered
     jLabelrojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rojo_c.png")));  // TODO add your handling code here:
    }//GEN-LAST:event_jLabelrojoMouseEntered

    private void jLabelrojoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelrojoMouseExited
    jLabelrojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rojo.png"))); // TODO add your handling code here:
    }//GEN-LAST:event_jLabelrojoMouseExited

    private void jLabelamarilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelamarilloMouseClicked
     this.setExtendedState(interfaz.MAXIMIZED_BOTH);  // TODO add your handling code here:
    }//GEN-LAST:event_jLabelamarilloMouseClicked

    private void jLabelamarilloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelamarilloMouseEntered
     jLabelamarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarillo_c.png"))); // TODO add your handling code here:
     // TODO add your handling code here:
    }//GEN-LAST:event_jLabelamarilloMouseEntered

    private void jLabelamarilloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelamarilloMouseExited
      jLabelamarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/amarillo.png"))); // TODO add your handling code here:
       // TODO add your handling code here:
    }//GEN-LAST:event_jLabelamarilloMouseExited

    private void jLabelverdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelverdeMouseClicked
     this.setExtendedState(ICONIFIED);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabelverdeMouseClicked

    private void jLabelverdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelverdeMouseEntered
    jLabelverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde_c.png"))); // TODO add your handling code here:
       // TODO add your handling code here:
    }//GEN-LAST:event_jLabelverdeMouseEntered

    private void jLabelverdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelverdeMouseExited
    jLabelverde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verde.png"))); // TODO add your handling code here:
    }//GEN-LAST:event_jLabelverdeMouseExited

    private void jButtonIniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarsesionActionPerformed
        String user = jTextFieldUusario.getText();
        String pass = jPasswordField1.getText();
        if(user.equals("admin1") && pass.equals("1234"))
        {            
           Inicio in =new Inicio();
           RespInicioFrame uno = new RespInicioFrame();
            in.limpiar();
            uno.setVisible(true);
            in.PanelPrincipal.setLayout(new GridLayout(1,1));
            in.PanelPrincipal.add(uno);
            in.PanelPrincipal.validate();
            in.PanelPrincipal.setVisible(true);
            in.PanelPrincipal.setEnabled(true);
            this.dispose();
            in.setVisible(true);
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarsesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelamarillo;
    private javax.swing.JLabel jLabelicono;
    private javax.swing.JLabel jLabelpass;
    private javax.swing.JLabel jLabelrojo;
    private javax.swing.JLabel jLabelusuario;
    private javax.swing.JLabel jLabelverde;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldUusario;
    // End of variables declaration//GEN-END:variables
}
