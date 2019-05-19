package com.chat.gson.All;

import com.google.gson.annotations.SerializedName;

public class familyMember {


    @SerializedName("role")
    private String MRole;
    @SerializedName("age")
    private int mAge;

    public familyMember() {
    }

    public familyMember(String MRole, int mAge) {
        this.MRole = MRole;
        this.mAge = mAge;
    }
}
