package com.example.dania.safespaceapp.Model;


public class Historias {

    private String title;
    private String autor;
    private String contenido;
    private int imagen;
    private int imagen_comentarios;
    private String comentarios;

    public Historias(String title, String autor, String contenido, int imagen, int imagen_comentarios, String comentarios) {
        this.title = title;
        this.autor = autor;
        this.contenido = contenido;
        this.imagen = imagen;
        this.imagen_comentarios = imagen_comentarios;
        this.comentarios = comentarios;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public String getContenido() {
        return contenido;
    }

    public int getImagen() {
        return imagen;
    }

    public int getImagen_comentarios() {
        return imagen_comentarios;
    }

    public String getComentarios() {
        return comentarios;
    }




}
