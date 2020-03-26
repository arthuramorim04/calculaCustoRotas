package com.arthuramorim.entity;

public class Cidade {

    private String cidadePartida;
    private String cidadeDestino;
    private float distancia;


    @Override
    public String toString() {
        return "Cidade{" +
                "cidadePartida='" + cidadePartida + '\'' +
                ", cidadeDestino='" + cidadeDestino + '\'' +
                ", distancia=" + distancia +
                '}';
    }

    public Cidade(String Partida, String Destino, float distancia){
        this.cidadePartida = Partida;
        this.cidadeDestino = Destino;
        this.distancia = distancia;
    }

    public String getcidadeDestino(){
        return cidadeDestino;
    }
    public void setCidadeDestino(String cidadeDestino){
       this.cidadeDestino = cidadeDestino;
    }

    public String getcidadePartida(){
        return cidadePartida;
    }
    public void setCidadePartida(String cidadePartida){
        this.cidadePartida = cidadePartida;
    }

    public float getDistancia(){
        return distancia;
    }
    public void setDistancia(float distancia){
        this.distancia = distancia;
    }
}
