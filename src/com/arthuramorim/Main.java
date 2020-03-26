package com.arthuramorim;

import com.arthuramorim.events.MenuCarro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String opcSair;
        Scanner sc = new Scanner(System.in);

        do{

            MenuCarro.menuCarro();

            System.out.println("Deseja continuar? <S> ou <N>");
            opcSair = sc.next().toUpperCase();

        }while (opcSair.equals("S")); {
            System.out.println("Obrigado!");
            sc.close();
        }

    }
}
