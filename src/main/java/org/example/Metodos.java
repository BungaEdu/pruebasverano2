package org.example;

public class Metodos {
    public static void trianguloEscaleno (int num, char simbolo) {
        int k=0;
        for (int i=0; i<num; i++) {
            k++;
            for (int j=0; j<k; j++) {
                System.out.print(simbolo);
            }
            System.out.print("\n");
        }
    }

    public static void trianguloIsosceles (int num, char simbolo) {
        int k=0;
        for (int i=0; i<num; i++) {
            k++;
            for (int j=0; j<k; j++) {
                System.out.print(simbolo);
            }
            System.out.print("\n");
        }
        k=num;
        for (int i=num-1; i>0; i--) {
            k--;
            for (int j=0; j<k; j++) {
                System.out.print(simbolo);
            }
            System.out.print("\n");
        }
    }
}
