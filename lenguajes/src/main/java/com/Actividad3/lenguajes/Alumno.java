package com.Actividad3.lenguajes;

public class Alumno {
    String nombre;
    Integer edad;
    Boolean esEstudiante;
    String[] hobbies;
    Direccion direccion;

    public Alumno() {
    }

    public Alumno(String nombre, Integer edad, Boolean esEstudiante, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.esEstudiante = esEstudiante;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getEsEstudiante() {
        return esEstudiante;
    }

    public void setEsEstudiante(Boolean esEstudiante) {
        this.esEstudiante = esEstudiante;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}