package unid5;

import java.util.Scanner;

public class Uni5Exe05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = 0;

        do {
            x = scan.nextInt();
            if (x <= 2) {
                System.out.print("valor incorreto, digite novamente:");
            }
        } while (x <= 2);

        int n = 8;
        System.out.println(n);

        for (int i = 2; i <= x; i += 2) {
            int calc;
            calc = n + 2;
            System.out.println(calc);
            if ((i + 1) <= x) {
                calc = n * 2;
                System.out.println(calc);
                n = calc;
            }
            scan.close();
        }
    }
}