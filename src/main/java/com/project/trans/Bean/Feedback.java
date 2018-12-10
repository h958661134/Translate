package com.project.trans.Bean;

public class Feedback {
    private int id;
    private String feedbackContent;
    private String userName;
    private String feedbackTime;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(String feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Feedback() {
    }

    public Feedback(int id, String feedbackContent, String userName, String feedbackTime, String email) {
        this.id = id;
        this.feedbackContent = feedbackContent;
        this.userName = userName;
        this.feedbackTime = feedbackTime;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", feedbackContent='" + feedbackContent + '\'' +
                ", userName='" + userName + '\'' +
                ", feedbackTime='" + feedbackTime + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
