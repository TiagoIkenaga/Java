package Exercícios;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        while (condition <= 2) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {//o resto da divisão do número por 2 tem que ser igual a 0
                System.out.println("Eh par");
            } else {
                System.out.println("Eh impar");                
            }
        }
        scanner.close();
    }
}