package com.example.DemoApp.RestApiTestSample;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class RestApiLoginTests {

// This class is intended for testing REST API login functionality.
    // It will contain methods to test various aspects of the login process,
    // such as successful login, failed login, and validation of user credentials.

    // Example method for testing successful login
    @Test
    public void testSuccessfulLogin() {
        // Implement logic to test successful login
         RestAssured
                .given()
                .when()
                .get("http://localhost:8080/api/greet")
                .then()
                .statusCode(200)
                .body(equalTo("Hello from DemoApp!"));

    }

    // Example method for testing failed login
    @Test
    public void testFailedLogin() {
        // Implement logic to test failed login
        RestAssured
                .given()
                .when()
                .put("http://localhost:8080/api/modify")
                .then()
                .statusCode(200)
                .body(equalTo("Welcome to the Demo Application Modify method!"));

    }

    // Additional methods can be added as needed for comprehensive testing
}
