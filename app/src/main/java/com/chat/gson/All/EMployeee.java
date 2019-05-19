package com.chat.gson.All;

import com.google.gson.annotations.Expose;

public class EMployeee {


    @Expose
    private String firstName;
    @Expose(serialize = false)
    private int age;
    @Expose(deserialize = false)
    private transient String password;

    private String email;

    public EMployeee(String firstName, int age, String password, String email) {
        this.firstName = firstName;
        this.age = age;
        this.password = password;
        this.email = email;
    }
}
