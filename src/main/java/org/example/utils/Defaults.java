package org.example.utils;

public enum Defaults {

    DEFAULT_URL();

    private final String url;

    Defaults() {
        this.url = "https://automationexercise.com/";
    }

    public String getUrl() {
        return url;
    }

}
