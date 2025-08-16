package com.example.DemoApp.RestApiTestSample;


import com.example.DemoApp.utils.RestUtilities;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class EmployeeRestAssuredTests {
    // This class is intended for testing the Airline REST API functionality.
    // It will contain methods to test various aspects of the airline service,
    // such as retrieving flight information, booking flights, and managing reservations.

    @Autowired
    private RestUtilities employeeService;

    private String endpoint = "https://dummy.restapiexample.com/api/v1/employees";
    private String payload = "";

    @Test// Method to test the airline service
    public void getEmployeeDetails() {
        Response response = employeeService.performGetRequest(endpoint, payload, new HashMap<>());
        Assertions.assertEquals(200, response.statusCode(), "Expected status code 200 but got " + response.statusCode());
        Assertions.assertTrue(response.getBody().asString().contains("employee_name"), "Response does not contain expected employee name field");
        System.out.println(response);
    }


}
