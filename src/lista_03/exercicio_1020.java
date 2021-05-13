package lista_03;

import java.io.IOException;
import java.util.Scanner;

public class exercicio_1020 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double co = sc.nextDouble(), nm = sc.nextDouble(), vu = sc.nextDouble();
        double co2 = sc.nextDouble(), nm2 = sc.nextDouble(), vu2 = sc.nextFloat();

        double valor = nm * vu + nm2 * vu2;

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valor));

    }
}
