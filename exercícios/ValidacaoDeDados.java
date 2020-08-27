import java.util.Scanner;
public class ValidacaoDeDados {//Validação de dados é feita utilizando condição, podendo ser "Se (condição) então" ou "Enquanto (condição) faça"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contS=0, contN=0;
        char resposta;
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Gosta de futebol [s/n]?: ");
            resposta = scanner.next().charAt(0);

            while (resposta!='s' && resposta!='n' && resposta!='S' && resposta!='N') {
                System.out.println("Erro! Digite s ou n");
                System.out.print("Gosta de futebol [s/n]?: ");
                resposta = scanner.next().charAt(0);
            }
            if (resposta == 's' || resposta == 'S') {
                contS++;
            } else {
                contN++;
            }
        }
        System.out.println("Total de pessoas que Gostam de Futebol: "+contS);
        System.out.println("Total de pessoas que Não gostam de Futebol: "+contN);
        scanner.close();
    }
}