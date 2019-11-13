
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;


public class LectorEscritor extends JFrame{

    Thread t, tLector,tEscritor;
    private DatagramSocket misocket;
    
    private MulticastSocket escucha;
    
    String hostIni = "127.0.0.1", portIni = "8080";
    
    private JTextField host;
    private JTextField puerto;
    
    private JButton boton;
    private JLabel label;
    private JLabel labelhost;
    private JLabel labelpuerto;
    private JLabel Lrecive;
    
    private JTextArea areaT, areaR;
    private JScrollPane scrollT, scrollR;

    private JRadioButton Lec;
    private JRadioButton Esc;
    
    private ButtonGroup group;
    
  
    public LectorEscritor(){
        setSize(400,650);
        MiComponentes();
        
        
        
        
           addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    creasocketE(hostIni, portIni, "DE");
                    /*                    try{
                        misocket.close();
                    }catch(Exception ex){ex.printStackTrace();}
                    */
                }
            });
    }
    
    private void MiComponentes(){
        creasocketE(hostIni, portIni,"E");
        
            try {
            escucha = new MulticastSocket(8080);
            // Nos ponemos a la escucha de la misma IP de Multicast que se uso en la parte de enviar.
            escucha.joinGroup(InetAddress.getByName("230.0.0.1"));
//            misocket = new DatagramSocket(8080);
        } catch (Exception e) {e.printStackTrace();
        }

        Lec = new JRadioButton("Lector",true);
        Esc = new JRadioButton("Escritor",false);
        group = new ButtonGroup();
        
        host = new JTextField();
        puerto = new JTextField();
        
        labelhost = new JLabel("Inserte Host");
        labelpuerto = new JLabel("inserte puerto");
    
        label = new JLabel("Insertar  mensaje");
        Lrecive = new JLabel("Mensajes REcividos");
        
        areaT = new JTextArea();
        scrollT = new JScrollPane(areaT);
        
        areaR = new JTextArea();
        scrollR = new JScrollPane(areaR);
        
        boton = new JButton("Enviar");

    //Layout null no recomendable    
        getContentPane().setLayout(null);
    //Radio Button
        getContentPane().add(Lec);
        Lec.setBounds(35, 5, 150, 30);

        getContentPane().add(Esc);
        Esc.setBounds(200,5,150,30);
        group.add(Lec);
        group.add(Esc);

        
    //etiqueta y text de host
        getContentPane().add(labelhost);
        labelhost.setBounds(15, 50, 150, 30);

        getContentPane().add(host);
        host.setText("230.0.0.1");
        host.setBounds(150, 50, 150, 30);
        
    //etiqueta y text de puerto
        getContentPane().add(labelpuerto);
        labelpuerto.setBounds(15, 90, 150, 30);
        
        getContentPane().add(puerto);
        puerto.setText("8080");
        puerto.setBounds(150, 90, 150, 30);
        
    //etiqueta y text de mensaje
        getContentPane().add(label);
        label.setBounds(15, 130, 150, 30);
        
        getContentPane().add(scrollT);
        scrollT.setBounds(150, 130, 150, 60);

    //boton enviar
        getContentPane().add(boton);
        boton.setBounds(150, 200, 100, 25);

    //laber recividos
        getContentPane().add(Lrecive);
        Lrecive.setBounds(15,235,150,30);

        getContentPane().add(scrollR);
        scrollR.setBounds(150, 235, 150, 60);

        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                creasocketE(host.getText(),puerto.getText(),areaT.getText());
            }
         });
        
        t = new Thread(new Runnable(){
        public synchronized void run(){
            while(true)
            {
                try {
                    
                    byte[] buffer = new byte[1024];
                    DatagramPacket datagrama = new DatagramPacket(buffer,buffer.length);
                    escucha.receive(datagrama);
                    String mensaje = new String(buffer);
                    String var = mensaje.trim();
                    if(var.equals(areaT.getText()))
                        var=null;
                    else
//                    clasifica(var);
                    areaR.append(var+"\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }//while
        }//run

        });
        t.start();

    }
    
    void creasocketE(String hostt, String port,String msj){
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
    

    
    public static void main(String[] args) {
        LectorEscritor em = new LectorEscritor();
        em.setTitle("LectorEscritor");
        em.setVisible(true);
        em.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
