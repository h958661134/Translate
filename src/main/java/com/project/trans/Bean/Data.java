package com.project.trans.Bean;

public class Data {
    private int id;
    private int tId;
    private String tContent;
    private String tBack;
    private String tTime;

    public Data() {
    }

    public Data(int id, int tId, String tContent, String tBack, String tTime) {
        this.id = id;
        this.tId = tId;
        this.tContent = tContent;
        this.tBack = tBack;
        this.tTime = tTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettContent() {
        return tContent;
    }

    public void settContent(String tContent) {
        this.tContent = tContent;
    }

    public String gettBack() {
        return tBack;
    }

    public void settBack(String tBack) {
        this.tBack = tBack;
    }

    public String gettTime() {
        return tTime;
    }

    public void settTime(String tTime) {
        this.tTime = tTime;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", tId=" + tId +
                ", tContent='" + tContent + '\'' +
                ", tBack='" + tBack + '\'' +
                ", tTime='" + tTime + '\'' +
                '}';
    }
}
