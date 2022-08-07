package org.example;

public class Metodos {
    public static void trianguloAsteriscos (int num, char simbolo) {
        int j=0;
        for (int i=0; i<num; i++) {
            while (j<num) {
                System.out.print(simbolo);
                j++;
            }
            System.out.println("\n");
            System.out.println("prueba");
        }
    }
}