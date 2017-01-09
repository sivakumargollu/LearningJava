package learning.java.exception;

import java.io.IOException;

/**
 * Created by sivag on 9/1/17.
 */
public class SubClass2 extends SuperClassNotThrowingException {

    /*//If super class not throw any exception, Subclass can throw any RunTimeException
    @Override
    public void display()  throws RuntimeException {
        System.out.println("@in sub class 2");
    }*/

   /*  //If super class not throw any exception, Subclass can not  throw any Unchecked exception
    @Override
    public void display()  throws IOException {
        System.out.println("@in sub class 2");
    }*/

    /*//If super class not throw any exception, Subclass can not  throw any unchecked or it's parent.
    @Override
    public void display()  throws Exception {
        System.out.println("@in sub class 2");
    }*/

    public static void main(String args[]) throws Exception{
        SubClass2 sc  = new SubClass2();
        SuperClassNotThrowingException scnte = new SuperClassNotThrowingException();
        sc.display();
        scnte.display();
    }
}
