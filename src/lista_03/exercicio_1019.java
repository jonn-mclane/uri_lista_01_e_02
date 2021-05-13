package lista_03;

import java.io.IOException;
import java.util.Scanner;

public class exercicio_1019 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // nome vendedor
        String nv = sc.next();
        // salário fixo
        double sf = sc.nextFloat();
        // vendas no mês
        double vm = sc.nextDouble();
        // comissão
        double c = 0.15;
        // comissão aplicada sobe as vendas
        double ca = vm * c;

        double total = sf + ca;

        System.out.println("TOTAL = R$ " + String.format("%.2f", total));

    }
}
