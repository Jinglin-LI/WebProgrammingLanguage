
package com.xyz.wsdl.billpayment._2_2;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2014-03-06T17:10:47.004-06:00
 * Generated source version: 2.7.8
 * 
 */
 
public class BillPaymentPortType_BillPaymentPort_Server{

    protected BillPaymentPortType_BillPaymentPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new BillPaymentPortTypeImpl();
        String address = "/billpayment-2.2/BillPaymentService";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new BillPaymentPortType_BillPaymentPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
