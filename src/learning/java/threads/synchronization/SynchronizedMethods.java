/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learning.java.threads.synchronization;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Siva
 */
public class SynchronizedMethods {
    
    public  void show(){
        synchronized(this){
        try {
            System.out.println("In to show method "+Thread.currentThread().getName()+" "+new Date());
            Thread.sleep(3000);
            System.out.println("Out of show method "+Thread.currentThread().getName()+" "+new Date());
        } catch (InterruptedException ex) {
            Logger.getLogger(SynchronizedMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    public  void display(){
        synchronized(this){
        try {
            System.out.println("In to display method"+Thread.currentThread().getName()+" "+new Date());
            Thread.sleep(3000);
            System.out.println("Out of display method"+Thread.currentThread().getName()+" "+new Date());
        } catch (InterruptedException ex) {
            Logger.getLogger(SynchronizedMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    public synchronized void testvew(){
           try {
            System.out.println("In to testvew method"+new Date());
            Thread.sleep(3000);
            System.out.println("Out of testvew method"+new Date());
        } catch (InterruptedException ex) {
            Logger.getLogger(SynchronizedMethods.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
    
    
    
}
