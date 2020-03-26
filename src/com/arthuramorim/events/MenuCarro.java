package com.arthuramorim.events;

import com.arthuramorim.entity.Carro;
import com.arthuramorim.utilit.Menu;

import java.util.Scanner;

public class MenuCarro {

    public static void menuCarro(){
        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro("HB20", 18);
        Carro carro2 = new Carro("Creta", 11);
        Carro carro3 = new Carro("Santa Fé", 9);


        int opcCarro;
        System.out.println("Escolha o modelo do carro \n 1. HB20\n 2.Creta\n 3.Santa Fé");
        opcCarro = sc.nextInt();
        sc.close();
        switch (opcCarro) {
            case 1: Menu.menuRota(carro1);
                break;

            case 2:
                Menu.menuRota(carro2);
                break;
            case 3:
                Menu.menuRota(carro3);
                break;
            }
    }
}
