package com.Actividad3.lenguajes;

class Direccion {
    String calle;
    Integer numero;

    public Direccion() {
    }

    public Direccion(String calle, Integer numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
