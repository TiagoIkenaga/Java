import java.util.Scanner;
public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sexo;
        float altura, pesoideal;

        System.out.println("Sistema de Calculo de Peso Ideal!");
        System.out.println("Por favor insira o seu sexo (M ou F):");
        sexo = scanner.nextLine();
        
        System.out.println("Por favor insira sua altura em metros:");
        altura = scanner.nextFloat();

        if (sexo == "M") {
            pesoideal = (float) (72.7 * altura - 58);
            System.out.println("Seu peso ideal é de: "+pesoideal+"kg");
        } else {
            pesoideal = (float) (62.1 * altura - 44.7);
            System.out.println("Seu peso ideal é de: "+pesoideal+"kg");
        }
        scanner.close();
    }
}