package com.xyz.wsdl.billpayment._2_2;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2014-02-27T17:01:36.341-06:00
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "BillPaymentService", 
                  wsdlLocation = "wsdl/billpayment.wsdl",
                  targetNamespace = "http://www.xyz.com/wsdl/BillPayment/2.2") 
public class BillPaymentService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.xyz.com/wsdl/BillPayment/2.2", "BillPaymentService");
    public final static QName BillPaymentPort = new QName("http://www.xyz.com/wsdl/BillPayment/2.2", "BillPaymentPort");
    static {
        URL url = BillPaymentService.class.getResource("wsdl/billpayment.wsdl");
        if (url == null) {
            url = BillPaymentService.class.getClassLoader().getResource("wsdl/billpayment.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(BillPaymentService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "wsdl/billpayment.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public BillPaymentService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BillPaymentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BillPaymentService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BillPaymentService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BillPaymentService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BillPaymentService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BillPaymentPortType
     */
    @WebEndpoint(name = "BillPaymentPort")
    public BillPaymentPortType getBillPaymentPort() {
        return super.getPort(BillPaymentPort, BillPaymentPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BillPaymentPortType
     */
    @WebEndpoint(name = "BillPaymentPort")
    public BillPaymentPortType getBillPaymentPort(WebServiceFeature... features) {
        return super.getPort(BillPaymentPort, BillPaymentPortType.class, features);
    }

}