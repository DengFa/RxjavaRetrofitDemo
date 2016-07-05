package com.queen.rxjavaretrofitdemo.entity;

/**
 * Created by tangqifa on 16/3/11.
 */
public class LoginRequest {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LoginRequest(String username) {
        this.username = username;
    }
}
