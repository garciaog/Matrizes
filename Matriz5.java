package Matrizes;

import java.util.Scanner;

public class Matriz5 {
    public static boolean eDivisivelPor4(int numero) {
        return numero % 4 == 0;
    }

    public static boolean eDivisivelPor7(int numero) {
        return numero % 7 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Insira um número: ");
        int numero = scanner.nextInt();

        if (eDivisivelPor4(numero) && eDivisivelPor7(numero)) {
            System.out.println(" É divisível pelos números 4 e 7.");
        } else {
            System.out.println(" Não é divisível pelos números 4 e 7.");
        }
    }
}