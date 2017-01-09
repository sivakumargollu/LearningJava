package learning.java.static_demo;

/**
 * Created by sivag on 9/1/17.
 */
class Staticdemo {

    public static void display() {
        System.out.println("In super class static method");
    }
    public static void show() {
        System.out.println("In show method");
    }
}
class StaticSubDemo extends Staticdemo {
    public static void display() {
        System.out.println("in subclass static method");
    }
}
