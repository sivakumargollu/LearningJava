package learning.java.static_demo;

/**
 * Created by sivag on 9/1/17.
 */
public class StaticDemoMain {

    public static void main(String args[]) {
        Staticdemo sd = new Staticdemo();
        StaticSubDemo ssd = new StaticSubDemo();
        sd.display();
        ssd.display();
        StaticSubDemo.show();
    }
}
