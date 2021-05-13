package lista_02;

import java.io.IOException;
import java.util.Scanner;

public class exercicio_1007 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int prod1 = a * b;
        int prod2 = c * d;

        System.out.println("DIFERENCA = " + (prod1 - prod2));

    }
}
