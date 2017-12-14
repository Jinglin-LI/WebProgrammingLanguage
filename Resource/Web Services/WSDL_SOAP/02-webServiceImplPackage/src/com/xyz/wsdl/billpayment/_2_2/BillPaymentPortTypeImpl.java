
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.xyz.wsdl.billpayment._2_2;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2014-02-27T17:01:36.319-06:00
 * Generated source version: 2.7.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "BillPaymentService",
                      portName = "BillPaymentPort",
                      targetNamespace = "http://www.xyz.com/wsdl/BillPayment/2.2",
                      wsdlLocation = "wsdl/billpayment.wsdl",
                      endpointInterface = "com.xyz.wsdl.billpayment._2_2.BillPaymentPortType")
                      
public class BillPaymentPortTypeImpl implements BillPaymentPortType {

    private static final Logger log = Logger.getLogger(BillPaymentPortTypeImpl.class.getName());
  
    protected final com.xyz.xsd.services.billpayment._2.ObjectFactory bpObjFact = new com.xyz.xsd.services.billpayment._2.ObjectFactory(); 
    protected final com.xyz.xsd.types.message._1.ObjectFactory msgObjFact = new com.xyz.xsd.types.message._1.ObjectFactory();

    /* (non-Javadoc)
     * @see com.xyz.wsdl.billpayment._2_2.BillPaymentPortType#billPayment(com.xyz.xsd.services.billpayment._2.BillPaymentRequest  request )*
     */
    public com.xyz.xsd.services.billpayment._2.BillPaymentResponse billPayment(com.xyz.xsd.services.billpayment._2.BillPaymentRequest request) throws FailureMessage    { 
        log.info("Executing operation billPayment");
            //Process bill payment request msg
          System.out.println(request);
          if(request.getHeader() == null)
            throw new FailureMessage("BillPayment Failed", createFailure("For bill payment, header information not set"));
          if(request.getBody().getAccountID() == null)
            throw new FailureMessage("BillPayment Failed", createFailure("For bill payment, account id not set"));
          if(request.getBody().getAccountID() == null)
            throw new FailureMessage("BillPayment Failed", createFailure("For bill payment, account id not set"));

          try {
            com.xyz.xsd.types.message._1.RequestHeader requestHeader = request.getHeader();
            if(requestHeader != null)
            {
              //do something here with the information in the input request header
              System.out.println(requestHeader);
            }
            String accountID = request.getBody().getAccountID();
            javax.xml.datatype.XMLGregorianCalendar paymentDate = request.getBody().getPaymentDate();
            
            /*
              Add your payment processing code here
            */
            
            //Create bill payment response msg
            com.xyz.xsd.services.billpayment._2.BillPaymentResponse response = bpObjFact.createBillPaymentResponse();
            response.setHeader(createResponseHeader(request.getHeader())); //create response header
            response.setBody(bpObjFact.createBillPaymentResponseBody()); //create response body
            response.getBody().setPaymentConfirmationID("123456");
            response.getBody().setRecurrentPayment(false);
            response.getBody().setPaymentDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(new java.util.GregorianCalendar()));            
            
            return response;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            //throw new RuntimeException(ex);
            //throw new FailureMessage("FailureMessage...");
            throw new FailureMessage("BillPayment Failed", createFailure("For bill payment, wrong blah blah was sent: "+ex.getMessage()),ex);
        }
    }
    
    private com.xyz.xsd.types.message._1.ResponseHeader createResponseHeader(com.xyz.xsd.types.message._1.RequestHeader request) {
      com.xyz.xsd.types.message._1.ResponseHeader response = msgObjFact.createResponseHeader();
      response.setService(msgObjFact.createService());
      response.getService().setId("XYZ Bill Payment Service No #####");
      try {
        response.setTimestamp(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar(new java.util.GregorianCalendar()));
      }
      catch(javax.xml.datatype.DatatypeConfigurationException e) {
        log.info("making timestamp:"+e.getMessage());
      }
      response.setRequest(msgObjFact.createResponseHeaderRequest());
      response.getRequest().setService(request.getService());
      response.getRequest().setTimestamp(request.getTimestamp());
      return response;
    }
    
    private com.xyz.xsd.services.failure._1.Failure createFailure(String reason) {
      com.xyz.xsd.services.failure._1.Failure failure = new com.xyz.xsd.services.failure._1.Failure();
      failure.setReason(reason);
      log.info("Error: "+reason);
      return failure;
    }

}