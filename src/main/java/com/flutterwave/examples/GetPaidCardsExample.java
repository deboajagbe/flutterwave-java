/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flutterwave.examples;

import com.flutterwave.GetPaidCards;
import com.flutterwave.exceptions.EmptyKeyException;
import com.flutterwave.exceptions.InvalidRequestObjectException;
import com.flutterwave.requests.MVVARequest;
import com.flutterwave.response.MVVAResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author josepholaoye
 */
public class GetPaidCardsExample {
    private static final Logger logger = Logger.getLogger(GetPaidCardsExample.class.getName());

    public GetPaidCardsExample() {
        MVVARequest request = new MVVARequest();
        request.setAmount("1000.00");
        request.setAuthmodel("NOAUTH");
        request.setCardno("5060990580000217499");
        request.setCountry("NG");
        request.setCurrency("NGN");
        request.setCustid("examplesspc");
        request.setExpirymonth("01");
        request.setExpiryyear("18");
        request.setMerchantid("lZBBPwc3kM");
        request.setNarration("A test payment");
        request.setCvv("354");

        try {
            GetPaidCards getPaidCards = new GetPaidCards("OqjBHslUGvv6wSViNCCB", "lZBBPwc3kM", "http://staging1flutterwave.co:8080");
            MVVAResponse payWithCardDetails = getPaidCards.payWithCardDetails(request);
            logger.log(Level.INFO, payWithCardDetails.getStatus());
            logger.log(Level.INFO, payWithCardDetails.getResponseCode());
        } catch (EmptyKeyException | InvalidRequestObjectException | BadPaddingException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | IOException | URISyntaxException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new GetPaidCardsExample();
    }
}
