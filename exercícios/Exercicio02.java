package Exercícios;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("Digite um valor: ");
        float preco = scanner.nextFloat();

        System.out.println("True or False? ");
        Boolean ehZero = scanner.nextBoolean();

        System.out.println("Você digitou: " + palavra);
        System.out.println("R$" + preco);
        System.out.println("Resposta: " + ehZero);

        scanner.close();
    }
}