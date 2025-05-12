package com.pratik.dto;

import java.util.Date;


public class PaymentRequestDTO {

    private String transactionId;
    private String srcAcc;
    private String destAcc;
    private double amount;
    private Date transactionDate;

    public PaymentRequestDTO(String transactionId, String srcAcc, String destAcc, double amount, Date transactionDate) {
        this.transactionId = transactionId;
        this.srcAcc = srcAcc;
        this.destAcc = destAcc;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSrcAcc() {
        return srcAcc;
    }

    public void setSrcAcc(String srcAcc) {
        this.srcAcc = srcAcc;
    }

    public String getDestAcc() {
        return destAcc;
    }

    public void setDestAcc(String destAcc) {
        this.destAcc = destAcc;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
