package lista_03;


import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class exercicio_1012 {

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double atri = (a * c) / 2;
        double pi = 3.14159;
        double ac = pi * (c * c);
        double atra = ((a + b) * c) / 2;
        double aq = b * b;
        double ar = a * b;

        System.out.println("TRIANGULO: " + String.format("%.3f", atri));
        System.out.println("CIRCULO: " + String.format("%.3f", ac));
        System.out.println("TRAPEZIO: " + String.format("%.3f", atra));
        System.out.println("QUADRADO: " + String.format("%.3f", aq));
        System.out.println("RETANGULO: " + String.format("%.3f", ar));

    }

}
