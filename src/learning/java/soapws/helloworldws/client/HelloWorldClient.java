    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.java.soapws.helloworldws.client;

import learning.java.soapws.helloworldws.client.HelloWorld;
import learning.java.soapws.helloworldws.client.HelloWorldImplService;

/**
 *
 * @author Siva
 */
public class HelloWorldClient {

    public static void main(String[] args) {

        HelloWorldImplService helloService = new HelloWorldImplService();
        HelloWorld hello = helloService.getHelloWorldImplPort();
        System.out.println(hello.getHelloWorldAsString("TestTestTest"));

    }

}
