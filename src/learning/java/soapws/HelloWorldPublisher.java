package learning.java.soapws;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("Before publishing");
		Endpoint.publish("http://localhost:1010/ws/hello", new HelloWorldImpl());
                System.out.println("After publishing");
	}

}
