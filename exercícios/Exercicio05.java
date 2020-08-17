package Exercícios;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma senha: ");
        String senha = scanner.nextLine();
        // operador de atribuição: =
        // maior: >
        // diferente: !=
        // maior ou igual que: >=
        // menor ou igual que: <=
        // igualdade: ==
        if (senha.length() < 8) {
            System.out.println("Senha precisa ter no mínimo 8 caracteres");
        } else {
            System.out.println("Tudo certo");
        }
        scanner.close();
    }
}