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
        PanelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA MEDICO");
        setBackground(new java.awt.Color(102, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1350, 640));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel20.setToolTipText("Cerrar");
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
        jLabel22.setToolTipText("Minimizar");
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
    
    public void limpiar()
    {
        PanelPrincipal.removeAll();
        PanelPrincipal.validate();
        PanelPrincipal.repaint();
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
