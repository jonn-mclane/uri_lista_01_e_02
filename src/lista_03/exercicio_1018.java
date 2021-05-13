package lista_03;

import java.io.IOException;
import java.util.Scanner;

public class exercicio_1018 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // número funcionário
        int nf = sc.nextInt();
        // número de horas trabalhadas
        int nh = sc.nextInt();
        // reais por hora
        double rh = sc.nextFloat();

        double salario = nh * rh;

        System.out.println("NUMBER = " + nf);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));

    }
}
