/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionsExamples;
/**
 *
 * @author Siva
 */
public class OverridingFinalize {
    
    protected void finalize() throws Throwable {
         System.out.println("Execution started..........");
        try{
            System.out.println("In the try block.....");
        }
        catch(Exception e){
            System.out.println("In the catch block.....");
            e.printStackTrace();
        }
        finally{
            super.finalize();
            System.out.println("In the finally block.....");
        }
        
    }
    
    
}
