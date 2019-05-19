package com.chat.gson.FutureStudio.Model;

public class UserSample {

    private String name;
    private String email;
    private int age;
    private boolean isdeveloper;

    public UserSample() {
    }

    public UserSample(String name, String email, int age, boolean isdeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isdeveloper = isdeveloper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsdeveloper() {
        return isdeveloper;
    }

    public void setIsdeveloper(boolean isdeveloper) {
        this.isdeveloper = isdeveloper;
    }
}
