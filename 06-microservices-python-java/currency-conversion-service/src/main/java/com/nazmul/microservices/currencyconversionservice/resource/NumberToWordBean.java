package com.nazmul.microservices.currencyconversionservice.resource;

public class NumberToWordBean {
    private String message;

    public NumberToWordBean(String message) {
        this.message = message;
    }

    protected NumberToWordBean() {}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
