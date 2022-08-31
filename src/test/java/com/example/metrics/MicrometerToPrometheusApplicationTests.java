package com.example.metrics;

import com.abc.customer.GetCustomerRequest;
import com.example.metrics.cxfclient.CustomerClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MicrometerToPrometheusApplicationTests {

	@Autowired
	private CustomerClient customerClient;

	@Test
	void testSendMetricsToPrometheus() {
		GetCustomerRequest req = new GetCustomerRequest();
		//put anything as response is hardcoded from other service.
		req.setFirstname("mac");
		customerClient.callGetCustomer(req);
	}

}
