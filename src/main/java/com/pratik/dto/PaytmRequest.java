package com.pratik.dto;

public class PaytmRequest<T> {

    private T payload;

    public PaytmRequest(T payload) {
        this.payload = payload;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }
}
