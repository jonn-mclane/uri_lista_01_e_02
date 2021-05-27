package lista_03;

import java.io.IOException;
import java.util.Scanner;

public class exercicio_1017 {

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        float tempo = sc.nextInt();
        float vmedia = sc.nextInt();
        float dist = tempo * vmedia;
        float kmh = dist / 12;
        System.out.println(String.format("%.3f", kmh));

    }

}
