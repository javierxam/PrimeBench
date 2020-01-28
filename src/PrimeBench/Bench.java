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



 

public abstract class Bench implements Runnable, ThreadComplete{
    public void start(){
          
        Thread bench = new Thread (this);
        bench.start();
   }

    
    @Override
    public void run(){
     long i=0;
        
        long startTime = System.currentTimeMillis();
        for (int t = 0; t < 1000000000; t++) {
            for (int u = 0; u < 350; u++) {
                       i++;        
            }
        }
        long runTime= System.currentTimeMillis() - startTime;
        System.out.println(" Bench time: " + runTime);
        



}
               
      public abstract void doRun();

    void addListener(Prime aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
          
 

    
}
