package com.hrm.simple_hrm.model;

import java.util.Objects;

/**
 * JwtResponse
 */
public class JwtResponse {

    private String username;
    private String token;

    public JwtResponse() {
    }

    public JwtResponse(String username, String token) {
        this.username = username;
        this.token = token;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public JwtResponse username(String username) {
        this.username = username;
        return this;
    }

    public JwtResponse token(String token) {
        this.token = token;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof JwtResponse)) {
            return false;
        }
        JwtResponse jwtResponse = (JwtResponse) o;
        return Objects.equals(username, jwtResponse.username) && Objects.equals(token, jwtResponse.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, token);
    }

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", token='" + getToken() + "'" +
            "}";
    }

    
}