package com.example.DemoApp.RestApiTestSample;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.DemoApp.utils.RestUtilities;

import java.util.HashMap;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AirlineRestAssured {
    // This class is intended for testing the Airline REST API functionality.
    // It will contain methods to test various aspects of the airline service,
    // such as retrieving flight information, booking flights, and managing reservations.

    @Autowired
    private RestUtilities airlineService;

   private String endpoint = "http://localhost:8080/api/airline";
   private String payload = "http://localhost:8080/api/airline/modify";

    @Test// Method to test the airline service
    public void testAirlineService() {
      airlineService.performGetRequest(endpoint, payload, new HashMap<>()) ;


    }


}
