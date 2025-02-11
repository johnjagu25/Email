package com.kanezi.springdoc_openapi_showcase;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

// @Tag(name = "email", description = "email API")
public interface EmailApi {

    // tag::validation-openapi[]
    record EmailRequest(String to, String subject,String text) {}
    // end::validation-openapi[]

    record EmailResponse(String id, String message) {}

    record EmailError(String errorText) {}


    ResponseEntity<EmailResponse> sendEmail(
            EmailRequest emailRequest);

    ResponseEntity<String> checkStatus(
            String id);

    // tag::spring-data-jpa-openapi-supported[]
    Page<Object> filterEmails(Pageable pageable);
    // end::spring-data-jpa-openapi-supported[]
}
