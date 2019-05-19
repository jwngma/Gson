package com.chat.gson.All;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {


    @SerializedName("fitrst_name")
    private String MFirst_name;
    @SerializedName("email")
    private String MEmail;
    @SerializedName("age")
    private int Mage;
    @SerializedName("address")
    private Address Maddress;

    private List<familyMember> family;

    public Employee(String MFirst_name, String MEmail, int mage, Address maddress, List<familyMember> family) {
        this.MFirst_name = MFirst_name;
        this.MEmail = MEmail;
        Mage = mage;
        Maddress = maddress;
        this.family = family;
    }
}
