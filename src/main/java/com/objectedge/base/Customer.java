package com.objectedge.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

    private String code;

    private String occBaseUrl;

    private String login;

    private String password;

    private String siteId;

    private String siteBaseUrl;

    private String notificationEmail;

    private int tolerance;

    @JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("occ_base_url")
    public String getOccBaseUrl() {
        return occBaseUrl;
    }

    @JsonProperty("occ_base_url")
    public void setOccBaseUrl(String occBaseUrl) {
        this.occBaseUrl = occBaseUrl;
    }

    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("site_id")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("site_id")
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @JsonProperty("site_base_url")
    public String getSiteBaseUrl() {
        return siteBaseUrl;
    }

    @JsonProperty("site_base_url")
    public void setSiteBaseUrl(String siteBaseUrl) {
        this.siteBaseUrl = siteBaseUrl;
    }

    @JsonProperty("notification_email")
    public String getNotificationEmail() {
        return notificationEmail;
    }

    @JsonProperty("notification_email")
    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    @JsonProperty("tolerance")
    public int getTolerance() {
        return tolerance;
    }

    @JsonProperty("tolerance")
    public void setTolerance(int tolerance) {
        this.tolerance = tolerance;
    }
}
