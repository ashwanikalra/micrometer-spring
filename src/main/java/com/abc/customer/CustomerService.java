package com.abc.customer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.3
 * 2022-09-01T01:10:29.229+05:30
 * Generated source version: 3.5.3
 *
 */
@WebServiceClient(name = "CustomerService",
                  wsdlLocation = "file:/C:/ash/code/metrics/src/main/resources/wsdl/reservation.wsdl",
                  targetNamespace = "http://www.abc.com/customer")
public class CustomerService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.abc.com/customer", "CustomerService");
    public final static QName CustomerServiceSoap = new QName("http://www.abc.com/customer", "CustomerServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/ash/code/metrics/src/main/resources/wsdl/reservation.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CustomerService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/ash/code/metrics/src/main/resources/wsdl/reservation.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CustomerService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CustomerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CustomerService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CustomerService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CustomerService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CustomerServicePortType
     */
    @WebEndpoint(name = "CustomerServiceSoap")
    public CustomerServicePortType getCustomerServiceSoap() {
        return super.getPort(CustomerServiceSoap, CustomerServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerServicePortType
     */
    @WebEndpoint(name = "CustomerServiceSoap")
    public CustomerServicePortType getCustomerServiceSoap(WebServiceFeature... features) {
        return super.getPort(CustomerServiceSoap, CustomerServicePortType.class, features);
    }

}