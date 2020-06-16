package io.swagger.client.model;

import io.swagger.client.model.CustomEmailTemplate;

import java.io.IOException;

public interface EmailMessenger {
    void send(CustomEmailTemplate emailTemplate) throws IOException;
}