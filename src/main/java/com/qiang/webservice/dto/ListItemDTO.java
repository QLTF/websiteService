package com.qiang.webservice.dto;

public class ListItemDTO {
    private String src;
    private String title;
    private String context;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "{" +
                "src='" + src + '\'' +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
