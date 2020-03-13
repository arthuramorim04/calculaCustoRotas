package com.arthuramorim.models;

public class Carro {
    private  String modelo;
    private  float gasto;

    public Carro(String modelo, float gasto) {
        this.modelo = modelo;
        this.gasto = gasto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getGasto() {
        return gasto;
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", gasto=" + gasto +
                '}';
    }
}


