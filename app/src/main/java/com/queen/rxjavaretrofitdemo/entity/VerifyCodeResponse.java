package com.queen.rxjavaretrofitdemo.entity;

/**
 * User: dengfa
 * Date: 16/6/5
 * Tel:  18500234565
 * Des:  ${TODO}
 */
public class VerifyCodeResponse {
    String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "VerifyCodeResponse{" +
                "code='" + code + '\'' +
                '}';
    }
}
