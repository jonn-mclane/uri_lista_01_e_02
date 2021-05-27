

package lista_03;


import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class exercicio_1011 {

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = 3.14159;
        double v = (4/3.0) * pi * (r * r * r);

        System.out.println("VOLUME = " + String.format("%.3f", v));


    }

}
