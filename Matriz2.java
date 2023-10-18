package Matrizes;
import java.util.Scanner;
public class Matriz2 {
  public static int soma(int a, int b, int c ,int d) {
        return a*d - b*c; 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro valor: "); 
        int a = scan.nextInt();

        System.out.println("Segundo valor : ");
        int b = scan.nextInt();

        System.out.println("Terceiro valor: "); 
        int c = scan.nextInt();

        System.out.println("Quarto valor: "); 
        int d = scan.nextInt();

        int resultado = soma(a, b, c, d);
        System.out.println("Resultado: " + resultado);

        scan.close();
    }
  }