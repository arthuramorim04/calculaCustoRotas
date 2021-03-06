package com.arthuramorim.utilit;

import com.arthuramorim.entity.Carro;
import com.arthuramorim.entity.Cidade;
import com.arthuramorim.events.CalculaCusto;

import java.util.Scanner;

public class Menu{
    public static void menuRota(Carro carro){

        Cidade rota1 = new Cidade("Lages", "Florianopolis", 220);
        Cidade rota2 = new Cidade("Florianópolis", "Joinville", 160);
        Cidade rota3 = new Cidade("Joinville", "Lages", 220);


        Scanner sc = new Scanner(System.in);

        int opcRota = 0;
        System.out.println("Escolha uma rota:\n" +
                "1. Lages -> Florianópolis\n" +
                "2. Florianópolis -> Joinville\n" +
                "3. Joinville -> Lages");

        opcRota = sc.nextInt();
        sc.close();
        switch (opcRota){
            case 1 :
                CalculaCusto.custo(carro, rota1);
                break;
            case 2 :
                CalculaCusto.custo(carro ,rota2);
                break;
            case 3 :
                CalculaCusto.custo(carro ,rota3);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opcRota);
        }
    }
}