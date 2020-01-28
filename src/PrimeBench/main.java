/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeBench;
import javax.swing.JOptionPane;
/**
 *
 * @author xavi
 */
class main extends Thread{
   
    /**
     * @param args the command line arguments
     */
    
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Bienvenido a PrimeBench \n \nAl aceptar el test correra en background\n");
             
        Prime prime = new Prime();
    }
    
}
