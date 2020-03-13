package com.arthuramorim.events;

import com.arthuramorim.models.Carro;
import com.arthuramorim.models.Cidade;
import com.arthuramorim.models.Gasto;

public class CalculaCusto {

    public static void custo(Carro carro,Cidade cidade){

        float gastoCarro = carro.getGasto();
        float distanciaCidade = cidade.getDistancia();
        float consumo = 0;

        consumo = gastoCarro/distanciaCidade;

        Gasto gastoRota = new Gasto(consumo,carro.getModelo(),cidade.getDistancia(),cidade.getcidadePartida(),cidade.getcidadeDestino());

        System.out.println(gastoRota.toString());
    }

}
