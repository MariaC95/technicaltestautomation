package org.example.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.ThreadLocalRandom;

public enum Defaults {

    DEFAULT_URL(),
    GENERATED_NAME(),
    GENERATED_EMAIL(),
    GENERATED_PASSWORD(),
    GENERATED_CARD_NUMBER();

    private final String url;
    private final String generatedName;
    private final String generatedEmail;
    private final String generatedPassword;

    Defaults() {
        this.url = "https://automationexercise.com/";
        this.generatedName = RandomStringUtils.randomAlphabetic(6);
        this.generatedEmail = RandomStringUtils.randomAlphabetic(8) + "@hotmail.com";
        this.generatedPassword = RandomStringUtils.randomAlphanumeric(8);
    }

    public String getUrl() {
        return url;
    }

    public String getGeneratedName(){
        return generatedName;
    }

    public String getGeneratedEmail(){
        return generatedEmail;
    }

    public String getGeneratedPassword(){
        return generatedPassword;
    }


}
