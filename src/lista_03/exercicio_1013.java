package lista_03;


import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class exercicio_1013 {

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && b < c){
            System.out.println(c + " eh o maior");
        }
        else if (c < b && b < a){
            System.out.println(a + " eh o maior");
        }
        else {
            System.out.println(b + " eh o maior");
        }

    }

}
