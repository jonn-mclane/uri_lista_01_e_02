package lista_03;

import java.io.IOException;
import java.util.Scanner;

public class exercicio_1015 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double p1 = a * 3.5;
        double p2 = b * 7.5;

        double soma = p1 + p2;
        double media = soma / 11;

        System.out.println("MEDIA = " + String.format("%.5f", media));

    }
}
