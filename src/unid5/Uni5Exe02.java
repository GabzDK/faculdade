package unid5;

public class Uni5Exe02 {
    public static void main(String[] args) {
        /*
         * Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma
         * dos números ímpares entre 1 e 100.
         * 
         */
        int nOdd = 0, nEven = 0;
        for (int i = 0; i < 100; i++) {
            if (!(i % 2 == 0)) {
                nOdd = nOdd + i;
            } else {
                nEven = nEven + i;
            }

        }
        System.out.println("Par: " + nOdd);
        System.out.println("Impar: " + nEven);
    }

}
