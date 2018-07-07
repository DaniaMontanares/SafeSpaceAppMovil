package com.example.dania.safespaceapp.Model;

public class Autoayuda {

    private String title;
    private String content;
    private int title_image;
    private int topic_image;

    public Autoayuda(String title, String content, int title_image, int topic_image) {
        this.title = title;
        this.content = content;
        this.title_image = title_image;
        this.topic_image = topic_image;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getTitle_image() {
        return title_image;
    }

    public int getTopic_image() {
        return topic_image;
    }
}
