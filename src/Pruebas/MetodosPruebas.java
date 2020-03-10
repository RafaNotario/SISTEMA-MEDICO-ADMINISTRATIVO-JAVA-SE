/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import sun.applet.Main;

/**
 *
 * @author PC-Desarrollo
 */
public class MetodosPruebas {
    
    protected int ancho = 0;
    protected int alto = 0;
        

    int getWidth(){
        ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        return ancho;
    }
    
    int getHeigth(){
        alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        return alto;
    }
    
    void Resolucion(){
        
        ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        
        System.out.println("el ancho es: "+ancho);
        System.out.println("el alto es: "+alto);
        
    }

   
public static void main(String[] argv){
        MetodosPruebas MP =  new MetodosPruebas();
        MP.Resolucion();
    }

}

