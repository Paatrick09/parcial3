package com.example.parcial3.Entities;

public class Titulos {
    private String Nombre;
    private String link;

    
    public Titulos() {
    }
    public Titulos(String nombre, String link) {
        Nombre = nombre;
        this.link = link;
    }
    public Titulos(String link) {
        this.link = link;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

  

    
}
