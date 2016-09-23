package com.flutterwave.requests;

/**
 * Tokenize & Charge
 * <p>
 * <a href="http://docs.flutterwave.com/card-payments/">Card Payments</a>
 * All parameters except for merchantid should be encrypted with the API key using the TripleDES algorithm.
 * The JSON Object should look like the sample below.
 * {
 * "amount": "Encrypted Amount",
 * "authmodel": "Encrypted Authmodel (PIN | BVN | RANDOM_DEBIT | VBVSECURECODE | NOAUTH)",
 * "cardno": "Encrypted Card Number",
 * "currency": "Encrypted Currency",
 * "custid": "Encrypted CustID",
 * "country": "(Optional: Default is NG, see below for other options) Encrypted Country",
 * "cvv": "Encrypted CVV",
 * "pin": "(Optional:Only needed where authmodel is PIN) Encrypted PIN",
 * "bvn": "(Optional:Only needed where authmodel is BVN) Encrypted BVN",
 * "cardtype":" (Optional: Only needed where card is a Diamond Bank card) Encrypted CardType (Diamond) ",
 * "expirymonth": "Encrypted Expiry Month",
 * "expiryyear": "Encrypted Expiry Year",
 * "merchantid": "Merchant Key",
 * "narration": "Encrypted Narration",
 * "responseurl": "(Optional:Only needed where authmodel is VBVSECURECODE) Encrypted Response URL"
 * }
 */
public class MVVARequest {
    private String amount;
    private String currency;
    private String chargetoken;
    /** Encrypted Transaction identifier (any alpha-numeric string of not more than 20 characters would do) */
    private String custid;
    /** Encrypted Card Number */
    private String cardno;
    /** Encrypted Narration */
    private String narration;
    private String expirymonth;
    private String expiryyear;
    /** Optional:Only needed where authmodel is PIN) Encrypted PIN */
    private String pin;
    private String cvv;
    /** Optional:Only needed where authmodel is BVN) Encrypted BVN */
    private String bvn;
    private String validateoption;
    private String otp;
    private String otptransactionidentifier;
    private String merchantid;
    /** Encrypted Authmodel (PIN | BVN | RANDOM_DEBIT | VBVSECURECODE | NOAUTH) */
    private String authmodel;
    /** Optional:Only needed where authmodel is VBVSECURECODE) Encrypted Response URL */
    private String responseurl;
    private String trxreference;
    /** Optional: Only needed where card is a Diamond Bank card) Encrypted CardType (Diamond) */
    private String cardtype;
    /** Optional: Default is NG, see below for other options) Encrypted Country */
    private String country;
    private String trxauthorizeid;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getChargetoken() {
        return chargetoken;
    }

    public void setChargetoken(String chargetoken) {
        this.chargetoken = chargetoken;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public String getExpirymonth() {
        return expirymonth;
    }

    public void setExpirymonth(String expirymonth) {
        this.expirymonth = expirymonth;
    }

    public String getExpiryyear() {
        return expiryyear;
    }

    public void setExpiryyear(String expiryyear) {
        this.expiryyear = expiryyear;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public String getValidateoption() {
        return validateoption;
    }

    public void setValidateoption(String validateoption) {
        this.validateoption = validateoption;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getOtptransactionidentifier() {
        return otptransactionidentifier;
    }

    public void setOtptransactionidentifier(String otptransactionidentifier) {
        this.otptransactionidentifier = otptransactionidentifier;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    public String getAuthmodel() {
        return authmodel;
    }

    public void setAuthmodel(String authmodel) {
        this.authmodel = authmodel;
    }

    public String getResponseurl() {
        return responseurl;
    }

    public void setResponseurl(String responseurl) {
        this.responseurl = responseurl;
    }

    public String getTrxreference() {
        return trxreference;
    }

    public void setTrxreference(String trxreference) {
        this.trxreference = trxreference;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTrxauthorizeid() {
        return trxauthorizeid;
    }

    public void setTrxauthorizeid(String trxauthorizeid) {
        this.trxauthorizeid = trxauthorizeid;
    }
}
