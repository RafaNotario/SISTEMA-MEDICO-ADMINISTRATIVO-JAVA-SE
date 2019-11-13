
package sistema1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LectorEscritor extends JFrame{

    Calendar calendario = Calendar.getInstance();
    int hora, minutos, segundos,Escritor,Lector;
    private boolean disponible = false;
    Font fuente=new Font(null, Font.TRUETYPE_FONT, 15);
    
    static ArrayList<String> buff = new ArrayList<String>();
    
    static String var ="",cad="";
    volatile boolean freno = true; 
    
    String ghost,gport;
    int contPaquetes=0;
    Thread t, tLector,tEscritor;
    
//    private DatagramSocket misocket;
    private MulticastSocket escucha;
    
    private JTextField host;
    private JTextField puerto;
    private JTextField enviaMsg;
    
    private JButton boton;
    private JLabel label;
    private JLabel labelhost;
    private JLabel labelpuerto;
    private JLabel Lrecive;
    
    private JTextArea areaT, areaR;
    private JScrollPane scrollT, scrollR;

    private JRadioButton Lec;
    private JRadioButton Esc;
    
    private JRadioButton Editahost;
    private JRadioButton Editaport;
    
    private ButtonGroup group;
    private ButtonGroup groupEdit;
  
    public LectorEscritor(){
        setSize(350,550);
        this.setResizable(false);
        MiComponentes();
        //enviaIP();
        
           addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    this.windowClosed(e);
                    
                    /*                    try{
                        misocket.close();
                    }catch(Exception ex){ex.printStackTrace();}
                    */
                }
            });
        }
        
    private void MiComponentes(){

        Lec = new JRadioButton("Lector",false);
        Esc = new JRadioButton("Escritor",false);
        
        Editahost = new JRadioButton("Edit ip",false);
        Editaport =  new JRadioButton("Edit port",false);
        
        group = new ButtonGroup();
        groupEdit = new ButtonGroup();
        
        host = new JTextField();
        puerto = new JTextField();
        enviaMsg = new JTextField();
        
        labelhost = new JLabel(" IP ");
        labelpuerto = new JLabel(" PORT ");
    
        label = new JLabel("Escribir mensaje");
        Lrecive = new JLabel("Mensajes recibidos");
        
        areaT = new JTextArea();
        
        
        scrollT = new JScrollPane(areaT);
        
        areaR = new JTextArea();
        areaR.setFont(fuente);
        scrollR = new JScrollPane(areaR);
        
        boton = new JButton("Enviar");

    //Layout null no recomendable    
        getContentPane().setLayout(null);
    //Radio Button
        group.add(Lec);
        group.add(Esc);

        
    //etiqueta y text de host
        getContentPane().add(labelhost);
        labelhost.setBounds(50, 50, 70, 30);
        getContentPane().add(host);
        host.setText("228.5.6.7");//230.0.0.1
        host.setEditable(false);
        host.setBounds(120, 50, 120, 30);
        getContentPane().add(Editahost);
        Editahost.setBounds(255, 50, 90, 30);
        
    //etiqueta y text de puerto
        getContentPane().add(labelpuerto);
        labelpuerto.setBounds(50, 90, 70, 30);
        getContentPane().add(puerto);
        puerto.setText("56789");
        puerto.setEditable(false);
        puerto.setBounds(120, 90, 120, 30);
        getContentPane().add(Editaport);
        Editaport.setBounds(255, 90, 90, 30);
        
        groupEdit.add(Editahost);
        groupEdit.add(Editaport);
        
    //etiqueta y text de mensaje
        getContentPane().add(label);
        label.setBounds(15, 130, 150, 30);
        
        getContentPane().add(enviaMsg);
        enviaMsg.setBounds(5, 165, 330, 45);
        enviaMsg.setFont(fuente);

    //boton enviar
        getContentPane().add(boton);
        boton.setBounds(150, 225, 100, 30);

    //laber recibidos
        getContentPane().add(Lrecive);
        Lrecive.setBounds(15,260,150,30);

        getContentPane().add(scrollR);
        scrollR.setBounds(5, 295, 330, 200);

        ghost = host.getText();
        gport = puerto.getText();
        
        try {
            escucha = new MulticastSocket(Integer.parseInt(gport));
            // Nos ponemos a la escucha de la misma IP de Multicast que se uso en la parte de enviar.
            escucha.joinGroup(InetAddress.getByName(host.getText()));
//            misocket = new DatagramSocket(8080);
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo escuchar en el puerto"+gport, "Error en multicastSocket", JOptionPane.ERROR_MESSAGE);
        }

        enviaMsg.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                boton.doClick();
            }
        }

    });

        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //areaT.setText("");
                String txt = enviaMsg.getText().trim();
                
                if(txt.isEmpty())
                    JOptionPane.showMessageDialog(host, "Campo vacio");
                else{
                    creasocket(ghost,gport,txt);
                    areaR.append(obtenerHora()+" YO: "+txt+"\n");
                }
            }
        });

        Editahost.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!Editahost.isSelected() || Editaport.isSelected())
                    host.setEditable(false);
                else
                    host.setEditable(true);
            }
         });
        
        
        Esc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                creasocket(ghost, gport, "E");
                Lec.setEnabled(false);
                Esc.setEnabled(false);
            }
         });
        
        Lec.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                creasocket(ghost, gport, "L");
                boton.setText("Leer");
                areaT.setEnabled(false);
                
                Lec.setEnabled(false);
                Esc.setEnabled(false);
            }
         });

        t = new Thread(new Runnable(){
        public synchronized void run(){
            while(freno)
            {
                try {
                    
                    byte[] buffer = new byte[1024];
                    DatagramPacket datagrama = new DatagramPacket(buffer,buffer.length);
                    escucha.receive(datagrama);
                    String mensaje = new String(buffer);
                    
                    var = mensaje.trim();

                    if(var.equals(enviaMsg.getText()))
                        var=null;
                    else{
                        areaR.append(obtenerHora()+" TU: "+var+"\n");
                        Toolkit.getDefaultToolkit().beep();
                    }
                    enviaMsg.setText("");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }//while
        }//run
        });
        t.start();
    }
    
    void creasocket(String hostt, String port,String msj){
        try {
            InetAddress mihost = InetAddress.getByName(hostt);
            int mipuerto = Integer.parseInt(port);
            
            byte[] buffer = msj.getBytes();
            DatagramSocket misocket = new DatagramSocket();
            DatagramPacket datagram = new DatagramPacket(buffer, buffer.length,mihost,mipuerto);
            misocket.send(datagram);
            misocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
    String obtenerHora(){
        String var = "";
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
//        var = " "+String.valueOf(hora)+":"+String.valueOf(minutos)+":"+String.valueOf(segundos)+" ";
        var = " "+String.valueOf(hora)+":"+String.valueOf(minutos)+" ";
        return var;
    }
    
    public String ObtineIP(){
        String hostname="";
        String sIPAddress = "";
        try {
            InetAddress address = InetAddress.getLocalHost();
            
            byte[] bIPAddress = address.getAddress();
            
 
            for (int x=0; x<bIPAddress.length; x++)
            {
                if (x > 0) {
    // A todos los numeros les anteponemos
    // un punto menos al primero    
                sIPAddress += ".";
                }
    // Jugamos con los bytes y cambiamos el bit del signo
             sIPAddress += bIPAddress[x] & 255;	
            }
            hostname = address.getHostName();
        } catch (UnknownHostException ex) {
            Logger.getLogger(LectorEscritor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return(sIPAddress);
    }
        
    public void enviaIP(){
        for(int i = 0;i<10;i++){
            creasocket(ghost, gport, ObtineIP());
        
        }
    }
    
    public static void main(String[] args) {
        LectorEscritor em = new LectorEscritor();
        em.setTitle("LectorEscritor");
        em.setVisible(true);
        em.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JOptionPane.showMessageDialog(null, em.ObtineIP());
        
    }
}
