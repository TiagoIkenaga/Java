import java.util.Scanner;
public class ConceitoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota1 , nota2 , media;
        System.out.println("Conceito da Média do aluno");
        System.out.println("Insira a primeira nota: ");
        nota1=scanner.nextFloat();
        System.out.println("Insira a segunda nota: ");
        nota2=scanner.nextFloat();
        media=(nota1+nota2)/2;
        if (media>=9) {
            System.out.println("Conceito A");
        } else {
            if (media>=7) {
                System.out.println("Conceito B");
            } else {
                if (media>=6) {
                    System.out.println("Conceito C");                    
                } else {
                    System.out.println("Conceito F");
                }
            }
        }
        scanner.close();
    }
}