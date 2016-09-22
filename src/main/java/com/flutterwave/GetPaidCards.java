package com.flutterwave;

import com.flutterwave.exceptions.EmptyKeyException;
import com.flutterwave.exceptions.InvalidRequestObjectException;
import com.flutterwave.requests.MVVARequest;
import com.flutterwave.response.MVVAResponse;
import com.flutterwave.util.Gateway;
import com.flutterwave.util.RequestHardner;
import com.flutterwave.util.validators.MVVAValidator;

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

    public MVVAResponse payWithCardDetails(MVVARequest request) throws InvalidRequestObjectException {
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

    public MVVAResponse payWithToken(MVVARequest request) throws InvalidRequestObjectException {
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

    public MVVAResponse validate(MVVARequest request) throws InvalidRequestObjectException {
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
