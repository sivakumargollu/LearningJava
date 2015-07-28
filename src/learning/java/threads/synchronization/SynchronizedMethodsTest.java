/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learning.java.threads.synchronization;

/**
 *
 * @author Siva
 */
public class SynchronizedMethodsTest {
    
    public static void main(String[] args) {
        SynchronizedMethods sMethods = new SynchronizedMethods();
        SynchronizedMethodsCaller smc = new SynchronizedMethodsCaller(1, sMethods);
        SynchronizedMethodsCaller smc1 = new SynchronizedMethodsCaller(2, sMethods);
        
       Thread t1 = new Thread(smc1);
       Thread t2 = new Thread(smc);
       Thread t3 = new Thread(smc);
       System.out.println("Starting first thread");
       t1.start();
       System.out.println("Starting second thread");
       t2.start();
      
    }
    
}
