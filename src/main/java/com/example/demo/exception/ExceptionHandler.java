package com.example.demo.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ExceptionHandler {

    public ResponseEntity<Object> handleApiRequestException(
            ApiRequestException e) {
        ApiException apiException = new ApiException(e.getMessage(), e, HttpStatus.BAD_REQUEST, ZonedDateTime.now());
        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
    }

}
