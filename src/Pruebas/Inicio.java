
package Pruebas;

import com.sun.awt.AWTUtilities;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Inicio extends javax.swing.JFrame {

    int x,y,cont;
//    conexionDB con = new conexionDB();
//    Connection cn = con.conexion();
    
    
    public Inicio() {
        this.setUndecorated(true);
        initComponents();
        cargarLogin();
        jLabelUSER.setVisible(false);
        jLabelRECETA.setVisible(false);
        jLabel21.setVisible(false);
//        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        //this.setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27);
        AWTUtilities.setWindowShape(this, forma);

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
        jPanelCabecera = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jLabelUSER = new javax.swing.JLabel();
        jLabelRECETA = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA NUÑO");
        setBackground(new java.awt.Color(102, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1200, 750));
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

        jPanelCabecera.setBackground(new java.awt.Color(21, 149, 163));
        jPanelCabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SISTEMA DE CONTROL DE PACIENTES");
        jPanelCabecera.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 370, 30));

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
        jPanelCabecera.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, -1, -1));

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
        jPanelCabecera.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, -1, -1));

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
        jPanelCabecera.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, -1, -1));

        getContentPane().add(jPanelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 60));

        jPanelMenu.setBackground(new java.awt.Color(177, 174, 159));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUSER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUSER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconNewUser.png"))); // NOI18N
        jLabelUSER.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelUSER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelUSER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUSERMouseClicked(evt);
            }
        });
        jLabelUSER.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelUSERAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanelMenu.add(jLabelUSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabelRECETA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRECETA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconReceta.png"))); // NOI18N
        jLabelRECETA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelRECETA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRECETA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRECETAMouseClicked(evt);
            }
        });
        jPanelMenu.add(jLabelRECETA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO");
        jPanelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 330, 30));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1350, 50));

        PanelPrincipal.setBackground(new java.awt.Color(0, 255, 102));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1350, 640));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1350, 640));

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
        this.dispose();
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

    private void jLabelRECETAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRECETAMouseClicked

        limpiar();
//        AltasMedicina uno = new AltasMedicina();
//        uno.setVisible(true);
        PanelPrincipal.setLayout(new GridLayout(1,1));
//        PanelPrincipal.add(uno);
        PanelPrincipal.validate();
        PanelPrincipal.setVisible(true);
        PanelPrincipal.setEnabled(true);
// LOGIN L1 = new LOGIN();
       // jPanel1.add(L1);
       

    }//GEN-LAST:event_jLabelRECETAMouseClicked

    private void jLabelUSERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUSERMouseClicked
        limpiar();
//        RespInicioFrame uno = new RespInicioFrame();
//        uno.setVisible(true);
        PanelPrincipal.setLayout(new GridLayout(1,1));
//        PanelPrincipal.add(uno);
        PanelPrincipal.validate();
        PanelPrincipal.setVisible(true);
        PanelPrincipal.setEnabled(true);

    }//GEN-LAST:event_jLabelUSERMouseClicked

    private void jLabelUSERAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelUSERAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUSERAncestorAdded

    
    void cargarLogin(){
        limpiar();
//        LOGIN LG = new LOGIN();
//        LG.setVisible(true);
        PanelPrincipal.setVisible(true);
        PanelPrincipal.setLayout(new GridLayout(1,1));
  //      PanelPrincipal.add(LG);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabelRECETA;
    public javax.swing.JLabel jLabelUSER;
    private javax.swing.JPanel jPanelCabecera;
    private javax.swing.JPanel jPanelMenu;
    // End of variables declaration//GEN-END:variables


}
