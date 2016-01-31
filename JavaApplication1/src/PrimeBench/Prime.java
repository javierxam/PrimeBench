/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeBench;

/**
 *
 * @author xavi
 */


public class Prime implements Runnable{

    public Prime() {
        
        
        Bench bench = new Bench().addListener(this).start();// Error, it tells me i cant instantiate an abstrac clss
    }
    
   
  
      
         
             
              void doRun() {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

             
              void notifyOfThreadComplete(Thread thread) {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
         

    
        
    
         

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
          
           
         
         
        
}
