/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flutterwave;

import com.flutterwave.exceptions.EmptyKeyException;
import com.flutterwave.exceptions.InvalidRequestObjectException;
import com.flutterwave.requests.MVVARequest;
import com.flutterwave.response.MVVAResponse;
import com.flutterwave.util.Gateway;
import com.flutterwave.util.RequestHardner;
import com.flutterwave.util.validators.MVVAValidator;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author josepholaoye
 */
public class GetPaidCards {

    private String apiKey;
    private String merchantId;
    private String baseUrl;
    private RequestHardner hardner;

    public GetPaidCards(String apiKey, String merchantId, String baseUrl) throws EmptyKeyException {
        if (apiKey == null || apiKey.isEmpty() || merchantId == null || merchantId.isEmpty() || baseUrl == null || baseUrl.isEmpty()) {
            throw new EmptyKeyException();
        }
        this.apiKey = apiKey;
        this.merchantId = merchantId;
        this.baseUrl = baseUrl;
        hardner = new RequestHardner(apiKey);
    }

    public MVVAResponse payWithCardDetails(MVVARequest request) throws InvalidRequestObjectException, BadPaddingException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, IOException, URISyntaxException {
        MVVAResponse response;
        boolean valid = MVVAValidator.validate(request);
        if (!valid) {
            throw new InvalidRequestObjectException();
        } else {
            request = hardner.MVVACardAPIHardner(request);
            response = Gateway.sendMCD(request, merchantId, baseUrl);
            return response;
        }
    }

    public MVVAResponse payWithToken(MVVARequest request) throws InvalidRequestObjectException, BadPaddingException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, URISyntaxException, IOException {
        MVVAResponse response;
        boolean valid = MVVAValidator.validate(request);
        if (!valid) {
            throw new InvalidRequestObjectException();
        } else {
            request = hardner.MVVACardAPIHardner(request);
            response = Gateway.sendMT(request, merchantId, baseUrl);
            return response;
        }
    }

    public MVVAResponse validate(MVVARequest request) throws InvalidRequestObjectException, BadPaddingException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, URISyntaxException, IOException {
        MVVAResponse response;
        boolean valid = MVVAValidator.validate(request);
        if (!valid) {
            throw new InvalidRequestObjectException();
        } else {
            request = hardner.MVVACardAPIHardner(request);
            response = Gateway.sendVT(request, merchantId, baseUrl);
            return response;
        }
    }

}
