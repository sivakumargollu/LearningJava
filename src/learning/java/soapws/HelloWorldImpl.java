package learning.java.soapws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(endpointInterface = "learning.java.soapws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		
		return "Hello world"+name;
	}

}
