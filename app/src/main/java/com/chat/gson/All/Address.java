package com.chat.gson.All;

import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("country")
    private  String mcountry;
    @SerializedName("city")
    private String mcity;

    public Address(String mcountry, String mcity) {
        this.mcountry = mcountry;
        this.mcity = mcity;
    }
}
