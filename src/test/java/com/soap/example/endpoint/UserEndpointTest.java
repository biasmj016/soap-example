package com.soap.example.endpoint;

import com.soap.example.config.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.xml.transform.StringSource;

import javax.xml.transform.Source;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.ResponseMatchers.payload;

@SpringBootTest
@Import(TestConfig.class)
public class UserEndpointTest {

    @Autowired
    private MockWebServiceClient client;

    @Test
    void getUser() throws IOException {
        String requestXml = new String(Files.readAllBytes(Paths.get("src/test/resources/userRequest.xml")));
        String responseXml = new String(Files.readAllBytes(Paths.get("src/test/resources/userResponse.xml")));
        Source requestPayload = new StringSource(requestXml);
        Source responsePayload = new StringSource(responseXml);

        client.sendRequest(withPayload(requestPayload))
                .andExpect(payload(responsePayload));
    }
}
