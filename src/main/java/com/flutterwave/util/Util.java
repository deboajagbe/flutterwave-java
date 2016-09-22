package com.flutterwave.util;

import com.flutterwave.response.AccountResponse;
import com.flutterwave.response.MVVAResponse;
import org.json.JSONObject;

/**
 *
 * @author josepholaoye
 */
public class Util {

    static MVVAResponse makeMVVAResponse(JSONObject details) {
        MVVAResponse response = new MVVAResponse();
        JSONObject data = details.getJSONObject("data");
        response.setResponseCode(data.optString("responsecode"));
        response.setStatus(details.optString("status"));
        response.setOtpTransactionIdentifier(data.optString("otptransactionidentifier"));
        response.setResponseMessage(data.optString("responsemessage"));
        response.setResponseToken(data.optString("responsetoken"));
        response.setTransactionReference(data.optString("transactionreference"));
        return response;
    }

    static AccountResponse makeAccountResponse(JSONObject details) {
        AccountResponse response = new AccountResponse();
        JSONObject data = details.getJSONObject("data");
        response.setResponseCode(data.optString("responsecode"));
        response.setStatus(details.optString("status"));
        response.setResponseMessage(data.optString("responsemessage"));
        response.setAccountToken(data.optString("accountToken"));
        response.setTransactionReference(data.optString("transactionreference"));
        response.setTransactionReference(data.optString("transactionReference"));
        response.setResponseDescription(data.optString("responseDescription"));
        return response;
    }

}
