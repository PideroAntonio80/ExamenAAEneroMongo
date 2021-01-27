package com.sanvalero.examen_aa_enero_mongo.domain;

/**
 * Creado por @ author: Pedro Orós
 * el 27/01/2021
 */
public class Partido {
    private Object id;
    private String nombre;

    public Partido(Object id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Partido(String nombre) {
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
