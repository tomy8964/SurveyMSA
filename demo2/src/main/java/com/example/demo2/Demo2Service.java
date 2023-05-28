package com.example.demo2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class Demo2Service {
    @Value("${serviceDemo1.host}")
    private String serviceDemo1Host;

    private RestTemplate restTemplate = new RestTemplate();;

    public String getDemo1() {
        String url = "http://" + serviceDemo1Host + "/api/resource"; // Replace "/api/resource" with the actual endpoint of Service B

//        String url = "http://localhost:8080/api/resource"; // Replace "/api/resource" with the actual endpoint of Service B

        // Make the request to Service B
        String response = restTemplate.getForObject(url, String.class);

        return response;
    }
}
