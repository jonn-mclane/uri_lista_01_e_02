package lista_03;

import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class exercicio_1019 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int h = 0;
        int m = 0;
        int s = sc.nextInt();

        while (s != 0) {
            if (s > 3600) {
                h = (s / (60 * 60));
                s = s % (60 * 60);
            }
            else if (s <= 3600 && s > 60) {
                m = s / 60;
                s = s % 60;
            }
            else {
                break;
            }

        }
        System.out.println(h + ":" + m + ":" + s);

    }
}
