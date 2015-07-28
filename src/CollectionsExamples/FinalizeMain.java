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
public class FinalizeMain {
    
    public static void main(String[] args) {
        OverridingFinalize of = new OverridingFinalize();
        of= null;
       System.gc();
         System.out.println("In main method.......");
    }
    
}
