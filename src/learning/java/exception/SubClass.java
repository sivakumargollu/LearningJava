package learning.java.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by sivag on 9/1/17.
 */
public class SubClass extends SuperThrowsException {

    //If super class throws unchecked exception,Subclass can not throw an parent exceptions.
    //i.e it can throw any unchecked or child exceptions of super class
    // exception and choose to not throw any exception.

    /*
    // 1. Can not thrown parent exception
    @Override
    public void dispaly() throws IOException {
        System.out.println("@ In subclass");
    }*/

    // 2. Can  throw child exception
    @Override
    public void dispaly() throws FileNotFoundException {
        System.out.println("@ In subclass");
    }

    /* // 3. Can  throw any unchecked exception
     @Override
     public void dispaly() throws RuntimeException {
         System.out.println("@ In subclass");
     }*/

    /* // 4. Can opt not to throw any exception
     @Override
     public void dispaly() {
         System.out.println("@ In subclass");
     }*/


    public static void main(String args[]) throws Exception{
        SubClass sc  = new SubClass();
        SuperThrowsException ste = new SuperThrowsException();
        sc.dispaly();
        ste.dispaly();
    }
}
