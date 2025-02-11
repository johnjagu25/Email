package com.kanezi.springdoc_openapi_showcase;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface EmailApi {

    record EmailRequest(String to, String subject,String text) {}

    record EmailResponse(String id, String message) {}

    record EmailError(String errorText) {}


    ResponseEntity<EmailResponse> sendEmail(
            EmailRequest emailRequest);

    ResponseEntity<String> checkStatus(
            String id);

    Page<Object> filterEmails(Pageable pageable);
}
