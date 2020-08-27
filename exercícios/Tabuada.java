import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,c=1;
        
        System.out.print("Digite um número: ");
        n = scanner.nextInt();
        System.out.println();
        System.out.println("Tabuada do "+ n);
        
        do {
            System.out.println(n +" x "+ c +" = "+ (n * c));
            c++;           
        } while (c<11);
        System.out.println();
        scanner.close();
    }
}