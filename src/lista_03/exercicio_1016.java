package lista_03;

import java.io.IOException;
import java.util.Scanner;

public class exercicio_1016 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double p1 = a * 2;
        double p2 = b * 3;
        double p3 = c * 5;

        double soma = p1 + p2 + p3;
        double media = soma / 10;

        System.out.println("MEDIA = " + String.format("%.1f", media));

    }
}
