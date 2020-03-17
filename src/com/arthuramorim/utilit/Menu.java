package com.arthuramorim.utilit;

import com.arthuramorim.events.CalculaCusto;
import com.arthuramorim.models.Carro;
import com.arthuramorim.models.Cidade;

public class Menu{
    public static void menuRota(Carro carro){

        Cidade rota1 = new Cidade("Lages", "Florianopolis", 220);
        Cidade rota2 = new Cidade("Florianópolis", "Joinville", 160);
        Cidade rota3 = new Cidade("Joinville", "Lages", 220);


        int opcRota = 0;
        System.out.println("Escolha uma rota");

        switch (opcRota){
            case 1 :
                CalculaCusto(this.carro ,this.rota1);
                break;
            case 2 :
                CalculaCusto(carro ,rota2);
                break;
            case 3 :
                CalculaCusto(carro ,rota3);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcRota);
        }
    }
}