package com.unir.calculadora.web.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoudException extends RuntimeException {

    private static final int code = 404;

    public NotFoudException(String message) {
        super(message);
    }

    public int getCode() {
        return this.code;
    }
}
