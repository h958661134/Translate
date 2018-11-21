package com.project.trans.Bean;

public class User {
    private int user_id;
    private String userName;
    private String userEmail;
    private String passWord;
    private int userPower;
    private String userPhoto;
    private String userTime;

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getUserPower() {
        return userPower;
    }

    public void setUserPower(int userPower) {
        this.userPower = userPower;
    }

    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }

    public User(int user_id, String userName, String userEmail, String passWord, int userPower, String userPhoto, String userTime) {
        this.user_id = user_id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.passWord = passWord;
        this.userPower = userPower;
        this.userPhoto = userPhoto;
        this.userTime = userTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userPower=" + userPower +
                ", userPhoto='" + userPhoto + '\'' +
                ", userTime='" + userTime + '\'' +
                '}';
    }

    public User() {
    }
}
