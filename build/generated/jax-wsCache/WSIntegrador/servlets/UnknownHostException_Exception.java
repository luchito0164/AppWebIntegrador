
package servlets;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UnknownHostException", targetNamespace = "http://servicios/")
public class UnknownHostException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UnknownHostException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public UnknownHostException_Exception(String message, UnknownHostException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public UnknownHostException_Exception(String message, UnknownHostException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: servlets.UnknownHostException
     */
    public UnknownHostException getFaultInfo() {
        return faultInfo;
    }

}
