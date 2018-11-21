package com.project.trans.Bean;

public class Function {
    private int id;
    private String fName;
    private String fContent;
    private String fView;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfContent() {
        return fContent;
    }

    public void setfContent(String fContent) {
        this.fContent = fContent;
    }

    public String getfView() {
        return fView;
    }

    public void setfView(String fView) {
        this.fView = fView;
    }

    public Function(int id, String fName, String fContent, String fView) {
        this.id = id;
        this.fName = fName;
        this.fContent = fContent;
        this.fView = fView;
    }

    public Function() {
    }

    @Override
    public String toString() {
        return "Function{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", fContent='" + fContent + '\'' +
                ", fView='" + fView + '\'' +
                '}';
    }
}
