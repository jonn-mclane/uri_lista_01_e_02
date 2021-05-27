package lista_03;

import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class exercicio_1014 {

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        double l = sc.nextDouble();
        double kml = km / l;

        System.out.println(String.format("%.3f", kml) + " km/l");

    }

}
