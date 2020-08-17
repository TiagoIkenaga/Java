package Exercícios;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular uma divisão.");
        System.out.println("Digite o numerador:");
        int numerador = scanner.nextInt();

        System.out.println("Digite o denominador:");
        int denominador = scanner.nextInt();

        if (denominador != 0) {
            int resultado = numerador/denominador;
            System.out.println("O resultado da divisão é: " + resultado);
        } else {
            System.out.println("Não é possível realizar divisão pelo número 0");
        }
        scanner.close();
    }
    
}