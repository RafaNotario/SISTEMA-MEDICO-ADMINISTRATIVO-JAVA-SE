/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema1;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.TextAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
/**
 *
 * @author monit
 */

public class Valoracion extends javax.swing.JPanel {

    Funciones fnVal = new Funciones();
    /**
     * Creates new form Valoracion
     */
    int valExped = 0;
    
    public Valoracion(int param) {
        initComponents();
        this.valExped = param;
        
        recExped();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtTitulo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaanotacion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAnotac = new javax.swing.JTextArea();
        jTxtFolioValoracion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 153, 255));
        setMinimumSize(new java.awt.Dimension(910, 658));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(910, 890));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Tipo Documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Anotaciones");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 170, 40));

        jtxtTitulo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jtxtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTituloActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 310, 40));

        jTextAreaanotacion.setColumns(10);
        jTextAreaanotacion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextAreaanotacion.setLineWrap(true);
        jTextAreaanotacion.setRows(5);
        jTextAreaanotacion.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextAreaanotacion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 570, 150));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("INFORME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 180, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Informacion Heredofamiliar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 170, 40));

        jTextAnotac.setColumns(20);
        jTextAnotac.setLineWrap(true);
        jTextAnotac.setRows(5);
        jScrollPane3.setViewportView(jTextAnotac);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 570, 170));

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 910, 610));
        add(jTxtFolioValoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EXPEDIENTE NO.");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTituloActionPerformed
    }//GEN-LAST:event_jtxtTituloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombDoc = jTxtFolioValoracion.getText();
        String tituloDocumento = jtxtTitulo.getText();
        String contenidoParrafo = jTextAreaanotacion.getText();//RESUMEN DE HEREDOFAMILIAR
        String contenidoParrafo2 = jTextAnotac.getText();
        String[] arre = fnVal.regresaNombreArch(nombDoc);
        //Creamos el documento
XWPFDocument documento = new XWPFDocument();        
//Declaramos el titulo y le asignamos algunas propiedades
XWPFParagraph fech_up = documento.createParagraph();//FECHA
fech_up.setAlignment(ParagraphAlignment.RIGHT);
fech_up.setVerticalAlignment(TextAlignment.TOP);

XWPFParagraph tituloDoc = documento.createParagraph();
tituloDoc.setAlignment(ParagraphAlignment.LEFT);
tituloDoc.setVerticalAlignment(TextAlignment.BOTTOM);

XWPFParagraph nombPaciente = documento.createParagraph();
nombPaciente.setAlignment(ParagraphAlignment.LEFT);
nombPaciente.setVerticalAlignment(TextAlignment.BOTTOM);

//Declaramos el parrafo y le asignamos algunas propiedades
XWPFParagraph parrafo = documento.createParagraph();
parrafo.setAlignment(ParagraphAlignment.BOTH);

XWPFRun r4 = tituloDoc.createRun();//TIPO DEL DOCUMENTO
r4.setBold(true);
r4.setText(tituloDocumento.toUpperCase());
r4.setFontSize(13);

//Para el titulo
XWPFRun r1 = fech_up.createRun();
r1.setText("Tecamachalco Pue. "+fnVal.fechLetra());
r1.setFontFamily("Arial");
r1.setFontSize(11);
r1.setTextPosition(10);
//r1.setUnderline(UnderlinePatterns.SINGLE);SUBRAYA

XWPFRun r5 = nombPaciente.createRun();//NOMBRE PACIENTE
r5.setBold(true);
r5.setText(arre[0]);
r5.setFontSize(12);

//Para el parrafo HEREDOFAMILIAR
XWPFRun r2 = parrafo.createRun();
r2.setText(contenidoParrafo);
r2.setFontSize(12);
r2.addCarriageReturn();
r2.addCarriageReturn();

//PARA PARRAFO2
XWPFRun r3 = parrafo.createRun();
r3.setText(contenidoParrafo2);
r3.setFontSize(12);
r3.addCarriageReturn();

try {
    FileOutputStream word = new FileOutputStream(arre[1]+fnVal.setDateActualGuion()+".docx");
    documento.write(word);
    word.close();
    File file = new File(arre[1]+fnVal.setDateActualGuion()+".docx");
    Desktop.getDesktop().open(file);
    
} catch (FileNotFoundException ex) {
    //Logger.getLogger(JF_Validar.class.getName()).log(Level.SEVERE, null, ex);
    System.out.println("filenotfoundexception");
} catch (IOException ex) {
   // Logger.getLogger(JF_Validar.class.getName()).log(Level.SEVERE, null, ex);
   System.out.println("ioexception");
}
    }//GEN-LAST:event_jButton1ActionPerformed
   
    
    public void recExped(){
        String value ="",cadena=""; 
        String[][] array = null;
        if(valExped != 0){
            value = Integer.toString(valExped);
            jTxtFolioValoracion.setText(value);
            if(fnVal.ValidaHeredofamiliarBool(value)){
                array=fnVal.cargaDatosHeredof(value);
                       jTextAreaanotacion.setText(fnVal.generaText(array));
            }else{
                jTextAreaanotacion.setText("No ha ingresado datos en el apartado de antecedentes heredofamiliar \n Ingrese cualquier texto para relizar informe ");
            } 
        }else{
           jTxtFolioValoracion.setText("/");
        }
    }//cierra funcion recibe
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAnotac;
    private javax.swing.JTextArea jTextAreaanotacion;
    private javax.swing.JTextField jTxtFolioValoracion;
    private javax.swing.JTextField jtxtTitulo;
    // End of variables declaration//GEN-END:variables
}
