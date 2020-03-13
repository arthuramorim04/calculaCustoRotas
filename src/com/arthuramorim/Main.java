package com.arthuramorim;

import com.arthuramorim.events.CalculaCusto;
import com.arthuramorim.models.Carro;
import com.arthuramorim.models.Cidade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String opcSair;
        do{
            Scanner sc = new Scanner(System.in);

            Carro carro1 = new Carro("HB20", 18);
            Carro carro2 = new Carro("Creta", 11);
            Carro carro3 = new Carro("Santa Fé", 9);

            Cidade rota1 = new Cidade("Lages", "Florianopolis", 220);
            Cidade rota2 = new Cidade("Florianópolis", "Joinville", 160);
            Cidade rota3 = new Cidade("Joinville", "Lages", 220);


            int opcCarro;
            System.out.println("Escolha o modelo do carro \n 1. HB20\n 2.Creta\n 3.Santa Fé");
            opcCarro = sc.nextInt();
            switch (opcCarro) {
                case 1: {
                    int opcCidade = 0;
                    System.out.println("Escolha a rota: \n 1. Lages -> Florianopolis\n 2. Florianopolis -> Joinville\n 3. Joinville -> Lages");
                    opcCidade = sc.nextInt();
                    switch (opcCidade) {
                        case 1: {
                            CalculaCusto.custo(carro1, rota1);
                            break;
                        }
                        case 2: {
                            CalculaCusto.custo(carro1, rota2);
                            break;
                        }
                        case 3: {
                            CalculaCusto.custo(carro1, rota3);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    int opcCidade = 0;
                    System.out.println("Escolha a rota: \n 1. Lages -> Florianopolis\n 2. Florianopolis -> Joinville\n 3. Joinville -> Lages");
                    opcCidade = sc.nextInt();
                    switch (opcCidade) {
                        case 1: {
                            CalculaCusto.custo(carro2, rota1);
                            break;
                        }
                        case 2: {
                            CalculaCusto.custo(carro2, rota2);
                            break;
                        }
                        case 3: {
                            CalculaCusto.custo(carro2, rota3);
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    int opcCidade = 0;
                    System.out.println("Escolha a rota: \n 1. Lages -> Florianopolis\n 2. Florianopolis -> Joinville\n 3. Joinville -> Lages");
                    opcCidade = sc.nextInt();
                    switch (opcCidade) {
                        case 1: {
                            CalculaCusto.custo(carro3, rota1);
                            break;
                        }
                        case 2: {
                            CalculaCusto.custo(carro3, rota2);
                            break;
                        }
                        case 3: {
                            CalculaCusto.custo(carro3, rota3);
                            break;
                        }
                    }
                    break;
                }

            }

            System.out.println("Deseja continuar? <S> ou <N>");
            opcSair = sc.next().toUpperCase();

        }while (opcSair.equals("S")); {
            System.out.println("Obrigado!");
        }

    }
}
