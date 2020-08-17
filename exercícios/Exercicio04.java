package Exercícios;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        // && = operador e
        // || = operador ou
        if (idade >= 16 && idade <= 17 || idade > 60) {
            System.out.println("Voto facultativo");
        } else if (idade >= 18 && idade <= 60) {
            System.out.println("Voto obrigatório");
        } else if (idade < 16){
            System.out.println("Não pode votar");
        }
        scanner.close();
    }
}