package Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz8 {
    public static boolean ehNumeroPerfeito(int numero) {
        int somaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == numero;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("insira um númeor: ");
        int numero = scanner.nextInt();
        scanner.close();
        if (numero <= 0) {
            System.out.println("nao é perfeito.");
        } else if (ehNumeroPerfeito(numero)) {
            System.out.println("é perfeito.");
        } else {
            System.out.println("não é perfeit.");
        }
    }
}
