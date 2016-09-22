package com.flutterwave.requests;

/**
 *
 * @author josepholaoye
 */
public class AccountRequest {

    private String accountNumber;
    private String merchantid;
    private String otp;
    private String reference;
    private String debitNarration;
    private String accountToken;
    private String billingAmount;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantId) {
        this.merchantid = merchantId;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDebitNarration() {
        return debitNarration;
    }

    public void setDebitNarration(String debitNarration) {
        this.debitNarration = debitNarration;
    }

    public String getAccountToken() {
        return accountToken;
    }

    public void setAccountToken(String accountToken) {
        this.accountToken = accountToken;
    }

    public String getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(String billingAmount) {
        this.billingAmount = billingAmount;
    }
}
