package com.flutterwave.examples;

import com.flutterwave.GetPaidAccounts;
import com.flutterwave.exceptions.EmptyKeyException;
import com.flutterwave.exceptions.InvalidRequestObjectException;
import com.flutterwave.requests.AccountRequest;
import com.flutterwave.response.AccountResponse;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GetPaidAccountsExample {
    private static final Logger logger = Logger.getLogger(GetPaidAccountsExample.class.getName());

    public GetPaidAccountsExample() {
        AccountRequest accountRequest = new AccountRequest();
        accountRequest.setAccountNumber("0690000000");
        accountRequest.setBillingAmount("1000.00");
        accountRequest.setDebitNarration("A test payment");
        accountRequest.setMerchantid("lZBBPwc3kM");

        try {
            GetPaidAccounts getPaidAccounts = new GetPaidAccounts("OqjBHslUGvv6wSViNCCB", "lZBBPwc3kM", "http://staging1flutterwave.co:8080");
            AccountResponse initiate = getPaidAccounts.initiate(accountRequest);
            accountRequest.setReference(initiate.getTransactionReference());
            logger.log(Level.INFO, initiate.getStatus());
            logger.log(Level.INFO, initiate.getResponseCode());
        } catch (EmptyKeyException | InvalidRequestObjectException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new GetPaidAccountsExample();
    }
}
