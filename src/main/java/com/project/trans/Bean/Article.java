package com.project.trans.Bean;

public class Article {
    /**
     * 文章id
     */
    private int id;
    /**
     * 文章标题
     */
    private String tittle;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 作者
     */
    private String author;
    /**
     * 创建时间
     */
    private String creatTime;
    /**
     * 修改时间
     */
    private String updateTime;
    /**
     * 浏览次数
     */
    private int viewNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getViewNumber() {
        return viewNumber;
    }

    public void setViewNumber(int viewNumber) {
        this.viewNumber = viewNumber;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", creatTime='" + creatTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", viewNumber=" + viewNumber +
                '}';
    }

    public Article() {
    }

    public Article(int id, String tittle, String content, String author, String creatTime, String updateTime, int viewNumber) {
        this.id = id;
        this.tittle = tittle;
        this.content = content;
        this.author = author;
        this.creatTime = creatTime;
        this.updateTime = updateTime;
        this.viewNumber = viewNumber;
    }
}
