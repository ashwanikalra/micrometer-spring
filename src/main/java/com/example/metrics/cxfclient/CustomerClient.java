package com.example.metrics.cxfclient;

import com.abc.customer.CustomerServicePortType;
import com.abc.customer.GetCustomerRequest;
import com.abc.customer.GetCustomerResponse;
import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerClient {

    private final CustomerServicePortType customerSoapClient;

    public CustomerClient(CustomerServicePortType customerSoapClient) {
        this.customerSoapClient = customerSoapClient;
    }


    @Timed("my_sample_timer")
    @Counted("my_sample_count")
    public void callGetCustomer(GetCustomerRequest req) {

        GetCustomerResponse res = customerSoapClient.getCustomer(req);

        log.debug("Response from service - Customer First Name {}", res.getCustomer().getFirstname());
        log.debug(("Response from service - Customer Last Name : " + res.getCustomer().getLastname()));

    }

}
