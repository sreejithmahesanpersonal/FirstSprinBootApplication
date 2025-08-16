package com.example.DemoApp.utils;

import io.restassured.response.Response;
import org.springframework.stereotype.Component;
import io.restassured.RestAssured;


import java.util.Map;
@Component
public class RestUtilities {
    public Response performGetRequest(String endPoint, String payLoad, Map<String, String> headers) {
        return RestAssured.given()
                .baseUri(endPoint)
                .headers(headers)
                .when()
                .get(payLoad)
                .then().log().all().extract().response();
                // Assuming 200 is the expected status code for a successful GET request
    }
    public void performPostRequest(String endPoint, String payLoad, Map<String, String> headers) {

    }
    public void performPutRequest(String endPoint, String payLoad, Map<String, String> headers) {

    }
    public void performDeleteRequest(String endPoint, String payLoad, Map<String, String> headers) {

    }
}
