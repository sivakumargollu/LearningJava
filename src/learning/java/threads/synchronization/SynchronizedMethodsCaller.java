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
public class SynchronizedMethodsCaller implements Runnable{
    
    public int methodCallerFalg;
    public SynchronizedMethods smObects;

    public SynchronizedMethodsCaller(int methodCallerFalg,SynchronizedMethods smObjects) {
        this.methodCallerFalg = methodCallerFalg;
        this.smObects = smObjects;
    }
    
    public void run(){
        if(this.methodCallerFalg == 1 ){
            this.smObects.display();
            
        }
        if(this.methodCallerFalg == 2){
            this.smObects.show();
            
        }
    }
    
}
