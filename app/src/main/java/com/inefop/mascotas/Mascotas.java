package com.inefop.mascotas;


public class Mascotas {
    private String nombre;
    private int fotomas;


    public Mascotas(int fotomas,String nombre) {
        this.nombre=nombre;
        this.fotomas=fotomas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFotomas() {
        return fotomas;
    }

    public void setFotomas(int fotomas) {
        this.fotomas = fotomas;
    }
}
