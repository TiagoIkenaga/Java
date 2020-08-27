import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.print("Digite um número: ");
        n = scanner.nextInt();
        System.out.println();
        System.out.println("Tabuada do "+ n);
        
        for (int c = 1; c < 11; c++) {
            System.out.println(n +" x "+ c +" = "+ (n * c));
        }
        System.out.println();
        scanner.close();
    }
}