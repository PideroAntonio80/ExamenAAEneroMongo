package com.sanvalero.examen_aa_enero_mongo.domain;

/**
 * Creado por @ author: Pedro Orós
 * el 27/01/2021
 */
public class Equipo {
    private Object id;
    private String nombre;

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(Object id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
