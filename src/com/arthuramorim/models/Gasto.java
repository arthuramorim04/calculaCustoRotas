package com.arthuramorim.models;

public class Gasto {

    private float gasto;
    private String modeloCarro;
    private float distancia;
    private String cidadePartida;
    private String cidadeDestino;

    public Gasto(float gasto, String modeloCarro, float distancia, String cidadePartida, String cidadeDestino) {
        this.gasto = gasto;
        this.modeloCarro = modeloCarro;
        this.distancia = distancia;
        this.cidadePartida = cidadePartida;
        this.cidadeDestino = cidadeDestino;
    }

    @Override
    public String toString() {
        return "Gasto{" +
                "gasto=" + gasto +
                ", modeloCarro='" + modeloCarro + '\'' +
                ", distancia=" + distancia +
                ", cidadePartida='" + cidadePartida + '\'' +
                ", cidadeDestino='" + cidadeDestino + '\'' +
                '}';
    }

    public float getGasto() {
        return gasto;
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String getCidadePartida() {
        return cidadePartida;
    }

    public void setCidadePartida(String cidadePartida) {
        this.cidadePartida = cidadePartida;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }
}
