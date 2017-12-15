package com.xyz.client;

import com.xyz.wsdl.billpayment._2_2.BillPaymentPortType;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class BillPaymentClient {
    private static com.xyz.xsd.types.message._1.RequestHeader createRequestHeader() {
      com.xyz.xsd.types.message._1.ObjectFactory msgObjFact = new com.xyz.xsd.types.message._1.ObjectFactory();
      com.xyz.xsd.types.message._1.RequestHeader request = msgObjFact.createRequestHeader();
      request.setService(msgObjFact.createService());
      request.getService().setId("XYZ Bill Payment Service No #####");
      try {
        request.setTimestamp(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(new java.util.GregorianCalendar()));
      }
      catch(javax.xml.datatype.DatatypeConfigurationException e) {
        e.printStackTrace();
        System.err.println("making timestamp:"+e.getMessage());
      }
      return request;
    }

    public static void main(String[] args){
        String serviceUrl = "http://localhost:8080/billpayment-2.2/BillPaymentService";
	      JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(BillPaymentPortType.class);
        factory.setAddress(serviceUrl);
        BillPaymentPortType billPaymentService = (BillPaymentPortType) factory.create();
	 
      try {
          //Create bill payment request msg
          com.xyz.xsd.services.billpayment._2.ObjectFactory bpObjFact = new com.xyz.xsd.services.billpayment._2.ObjectFactory();  
          com.xyz.xsd.services.billpayment._2.BillPaymentRequest request = bpObjFact.createBillPaymentRequest();
          request.setHeader(createRequestHeader()); //create request header
          request.setBody(bpObjFact.createBillPaymentRequestBody()); //create request body
          request.getBody().setAccountID("abc54321xyz");
          request.getBody().setPaymentDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(new java.util.GregorianCalendar()));            

          //Submit bill payment request
          com.xyz.xsd.services.billpayment._2.BillPaymentResponse response = billPaymentService.billPayment(request);
     
          //access bill payment response
          if(response.getHeader() == null)
              System.err.println("In bill payment response, header information not set");
          if(response.getBody().getPaymentConfirmationID() == null)
            System.err.println("In bill payment response, payment confirmation ID not set");
          else
            System.out.println("Payment Confirmation ID:" + response.getBody().getPaymentConfirmationID());
          if(response.getBody().getPaymentDate() == null)
            System.err.println("In bill payment response, payment date not set");
          else
            System.out.println("Payment Date:" + response.getBody().getPaymentDate());
          
          System.out.println("Recurrent Payment:" + response.getBody().isRecurrentPayment());          
          
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }
}