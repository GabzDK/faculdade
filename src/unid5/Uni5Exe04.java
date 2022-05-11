package unid5;

public class Uni5Exe04 {

    public static void main(String[] args) {

        float calc, soma = 0, c = 3;

        for (int i = 4; i <= 24; i++) {
            c += 2;
            float contador = i + 2;
            calc = c / contador;
            soma = (calc + soma);

        }

        System.out.println("o resultado da soma é: " + soma);
    }
}
