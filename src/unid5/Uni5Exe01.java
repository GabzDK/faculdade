package unid5;

import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {

        /*
         * Descreva um algoritmo que leia 20 números inteiros e escreva, para cada
         * número lido, se o mesmo é par ou ímpar.
         * 
         */
        Scanner sc = new Scanner(System.in);
        int n = 0;
        for (int i = 0; i < 20; i++) {
            n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

        }
        sc.close();

    }

}
