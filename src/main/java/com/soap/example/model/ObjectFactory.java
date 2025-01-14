package com.soap.example.model;

import jakarta.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {}

    public GetUserRequest createGetUserRequest() {
        return new GetUserRequest();
    }

    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }
}