package com.flutterwave.response;

/**
 *
 * @author josepholaoye
 */
public class MVVAResponse {

    private String status;
    private String responseCode;
    private String responseMessage;
    private String otpTransactionIdentifier;
    private String transactionReference;
    private String responseToken;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getOtpTransactionIdentifier() {
        return otpTransactionIdentifier;
    }

    public void setOtpTransactionIdentifier(String otpTransactionIdentifier) {
        this.otpTransactionIdentifier = otpTransactionIdentifier;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getResponseToken() {
        return responseToken;
    }

    public void setResponseToken(String responseToken) {
        this.responseToken = responseToken;
    }
}
