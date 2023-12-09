package com.ziwatest.bankstatement;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Validated
public class ApiController {

    @PostMapping("/bankstatementreq")
    public ResponseEntity<String> processTimePeriod(@RequestBody @Validated Request request) {
        // Validate the time period and email address
        // Perform any additional business logic

        // Call another API to send the data (replace the following line with your logic)
        String responseFromOtherApi = callOtherApi(request);

        return ResponseEntity.ok(responseFromOtherApi);
    }

    private String callOtherApi(Request request) {
        // Implement logic to send data to another API
        // You may use RestTemplate, WebClient, or any other HTTP client library
        // For simplicity, I'll return a sample response here
        return "Data sent to another API successfully";
    }
}
