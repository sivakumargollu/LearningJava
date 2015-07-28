    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learning.java.soapws.helloworldws.client;

/**
 *
 * @author Siva
 */
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
 

@WebService(name = "HelloWorld", targetNamespace = "http://soapws.java.learning/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld {
 
    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getHelloWorldAsString(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);
 
}
