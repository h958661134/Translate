package com.project.trans.Bean;

public class Feedback {
    private int id;
    private String feedbackContent;
    private int userId;
    private String isView;
    private String feedbackTime;

    public Feedback(int id, String feedbackContent, int userId, String isView, String feedbackTime) {
        this.id = id;
        this.feedbackContent = feedbackContent;
        this.userId = userId;
        this.isView = isView;
        this.feedbackTime = feedbackTime;
    }

    public Feedback() {
    }

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIsView() {
        return isView;
    }

    public void setIsView(String isView) {
        this.isView = isView;
    }

    public String getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(String feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", feedbackContent='" + feedbackContent + '\'' +
                ", userId=" + userId +
                ", isView='" + isView + '\'' +
                ", feedbackTime='" + feedbackTime + '\'' +
                '}';
    }
}
