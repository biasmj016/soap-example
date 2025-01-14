package com.soap.example.endpoint;

import com.soap.example.model.GetUserRequest;
import com.soap.example.model.GetUserResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    @PayloadRoot(namespace = "http://localhost:8080/soap", localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUser(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setMessage("Hello, " + request.getName() + "!");
        return response;
    }
}