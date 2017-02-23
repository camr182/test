package com.example.ameza.contactost;

/**
 * Created by ameza on 21/02/2017.
 */

public class Mascota {

    private int imagen;
    private String titulo;
    private String rating;

    public Mascota(int imagen, String titulo, String rating) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.rating = rating;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
