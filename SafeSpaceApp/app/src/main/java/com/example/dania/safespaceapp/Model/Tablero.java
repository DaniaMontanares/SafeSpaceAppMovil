package com.example.dania.safespaceapp.Model;

public class Tablero {

    private String user;
    private String date;
    private String content;
    private String comentary;
    private int image_comentary;

    public Tablero(String user, String date, String content, String comentary, int image_comentary) {
        this.user = user;
        this.date = date;
        this.content = content;
        this.comentary = comentary;
        this.image_comentary = image_comentary;
    }

    public String getUser() {
        return user;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public String getComentary() {
        return comentary;
    }

    public int getImage_comentary() {
        return image_comentary;
    }
}
