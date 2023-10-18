package Matrizes;


import java.util.Scanner;

public class Matriz3 {
    public static int multi(int lado) { 
        return lado * 4;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("valor dos lados: ");
        int lado = scan.nextInt();

        int resultado = multi(lado);
        System.out.println("o perimetro é: " + resultado);
        
    }
}
