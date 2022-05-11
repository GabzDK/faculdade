package unid5;

public class Uni5Exe03 {

    public static void main(String[] args) {

        float calc, soma = 0;

        for (int i = 1; i <= 100; i++) {

            float contador = i;
            calc = 1 / contador;
            soma = (calc + soma);

        }

        System.out.println("o resultado da soma é: " + soma);
    }

}
