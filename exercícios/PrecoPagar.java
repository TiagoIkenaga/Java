import java.util.Scanner;

public class PrecoPagar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        float precoOriginal, precoApagar;

        System.out.print("Insira o preço do produto: R$");
        precoOriginal=scanner.nextFloat();
        System.out.print("Insira o a forma de pagamento: ");
        codigo=scanner.nextInt();

        if (codigo == 0) {//Pagamento a vista
            precoApagar = (float) (precoOriginal * 0.75);
        } else {
            if (codigo == 1) {//Pagamento Cheque (30 dias)
                precoApagar = (float) (precoOriginal * 0.8);
            } else {
                if (codigo == 2) {//Pagamento Cartão de Crédito (2x)
                    precoApagar = (float) (precoOriginal * 0.9);
                } else {
                    if (codigo == 3) {//Pagamento Cartão de Crédito (3x)
                        precoApagar = (float) (precoOriginal * 0.95);
                    } else {//Outras formas de pagamento negociadas com o vendedor
                        precoApagar = precoOriginal;
                    }
                }
            }
        }
        System.out.println("Preço a pagar: R$"+precoApagar);
        scanner.close();
    }
}