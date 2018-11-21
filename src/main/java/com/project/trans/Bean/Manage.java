package com.project.trans.Bean;

public class Manage {
    private int id;
    private String manageName;
    private String manageEmail;
    private String managePassword;
    private String manageBlog;
    private String manageIntroduce;
    private String managePhoto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManageName() {
        return manageName;
    }

    public void setManageName(String manageName) {
        this.manageName = manageName;
    }

    public String getManageEmail() {
        return manageEmail;
    }

    public void setManageEmail(String manageEmail) {
        this.manageEmail = manageEmail;
    }

    public String getManagePassword() {
        return managePassword;
    }

    public void setManagePassword(String managePassword) {
        this.managePassword = managePassword;
    }

    public String getManageBlog() {
        return manageBlog;
    }

    public void setManageBlog(String manageBlog) {
        this.manageBlog = manageBlog;
    }

    public String getManageIntroduce() {
        return manageIntroduce;
    }

    public void setManageIntroduce(String manageIntroduce) {
        this.manageIntroduce = manageIntroduce;
    }

    public String getManagePhoto() {
        return managePhoto;
    }

    public void setManagePhoto(String managePhoto) {
        this.managePhoto = managePhoto;
    }

    public Manage(int id, String manageName, String manageEmail, String managePassword, String manageBlog, String manageIntroduce, String managePhoto) {
        this.id = id;
        this.manageName = manageName;
        this.manageEmail = manageEmail;
        this.managePassword = managePassword;
        this.manageBlog = manageBlog;
        this.manageIntroduce = manageIntroduce;
        this.managePhoto = managePhoto;
    }

    public Manage() {
    }

    @Override
    public String toString() {
        return "Manage{" +
                "id=" + id +
                ", manageName='" + manageName + '\'' +
                ", manageEmail='" + manageEmail + '\'' +
                ", managePassword='" + managePassword + '\'' +
                ", manageBlog='" + manageBlog + '\'' +
                ", manageIntroduce='" + manageIntroduce + '\'' +
                ", managePhoto='" + managePhoto + '\'' +
                '}';
    }
}
