package com.Databases;

public class UserHelperclass {
    String fullName,username,email,phoneNo,gender,data,password;
    public UserHelperclass(){}

    public UserHelperclass(String fullName, String username, String email, String phoneNo, String gender, String data, String password) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.data = data;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
