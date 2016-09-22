package com.flutterwave.examples;

import com.flutterwave.GetPaidCards;
import com.flutterwave.exceptions.EmptyKeyException;
import com.flutterwave.exceptions.InvalidRequestObjectException;
import com.flutterwave.requests.MVVARequest;
import com.flutterwave.response.MVVAResponse;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GetPaidCardsExample {
    private static final Logger LOG = Logger.getLogger(GetPaidCardsExample.class.getName());

    public GetPaidCardsExample() {
        MVVARequest request = new MVVARequest();
        request.setAmount("1000.00");
        request.setCurrency("NGN");
        request.setAuthmodel("NOAUTH");
        request.setCardno("5060990580000217499");
        request.setCountry("NG");
        request.setExpirymonth("01");
        request.setExpiryyear("18");
        request.setCvv("354");
        request.setMerchantid("lZBBPwc3kM");
        request.setCustid("examplesspc");
        request.setNarration("A test payment");

        try {
            GetPaidCards getPaidCards = new GetPaidCards("OqjBHslUGvv6wSViNCCB", "lZBBPwc3kM", "http://staging1flutterwave.co:8080");
            MVVAResponse payWithCardDetails = getPaidCards.payWithCardDetails(request);
            LOG.log(Level.INFO, payWithCardDetails.getStatus());
            LOG.log(Level.INFO, payWithCardDetails.getResponseCode());
        } catch (EmptyKeyException | InvalidRequestObjectException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new GetPaidCardsExample();
    }
}
