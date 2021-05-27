package lista_03;

import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class exercicio_1020 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int m = 0;
        int d = sc.nextInt();

        while (d != 0) {
            if (d >= 365) {
                a = (d / 365);
                d = d % 365;
            }
            else if (d < 365 && d >= 30) {
                m = d / 30;
                d = d % 30;
            }
            else {
                break;
            }

        }
        System.out.println(a + " ano(s)\n" + m + " mes(es)\n" + d + " dia(s)");

    }
}
