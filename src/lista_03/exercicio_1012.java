package lista_03;

import java.io.IOException;
import java.util.Scanner;

public class exercicio_1012 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = 3.14159;

        double a = pi * (r * r);

        System.out.println("A=" + String.format("%.4f", a));

    }
}
