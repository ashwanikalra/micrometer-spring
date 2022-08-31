package com.example.metrics.controller;

import com.abc.customer.GetCustomerRequest;
import com.example.metrics.cxfclient.CustomerClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MyController {

    @Autowired
    private CustomerClient customerClient;

    @GetMapping("/call-service")
    String callService() {
        GetCustomerRequest req = new GetCustomerRequest();
        //put anything as response is hardcoded from other service.
        req.setFirstname("mac");
        customerClient.callGetCustomer(req);
        return "Called service...";
    }
}
