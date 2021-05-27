package lista_03;

import java.util.Scanner;

public class exercicio_1018 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;

        int din = teclado.nextInt();

        while (din != 0) {
            if (din >= 100) {
                n100 = din / 100;
                din = din % 100;
            } else if (din >= 50) {
                n50 = din / 50;
                din = din % 50;
            } else if (din >= 20) {
                n20 = din / 20;
                din = din % 20;
            } else if (din >= 10) {
                n10 = din / 10;
                din = din % 10;
            } else if (din >= 5) {
                n5 = din / 5;
                din = din % 5;
            } else if (din >= 2) {
                n2 = din / 2;
                din = din % 2;
            } else if (din >= 1) {
                n1 = din;
                din = 0;
            }
        }
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }
}
