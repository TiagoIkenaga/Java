public class ATM {
    public static void main(String[] args) {
        int originalAmount = 12345;
        int amount = originalAmount;

        int n100 = amount/100;
        amount %= 100;// amount = amount % 100
        int n50 = amount/50;
        amount %= 50;// amount = amount % 50
        int n20 = amount/20;
        amount %= 20;// amount = amount % 20
        int n10 = amount/10;
        amount %= 10;// amount = amount % 10
        int n5 = amount/5;
        amount %= 5;// amount = amount % 5
        int n2 = amount/2;
        amount %= 2;// amount = amount % 2
        int n1 = amount;

        System.out.println("Notas de R$100,00: "+n100);
        System.out.println("Notas de R$50,00: "+n50);
        System.out.println("Notas de R$20,00: "+n20);
        System.out.println("Notas de R$10,00: "+n10);
        System.out.println("Notas de R$5,00: "+n5);
        System.out.println("Notas de R$2,00: "+n2);
        System.out.println("Notas de R$1,00: "+n1);
        System.out.println("Resto: "+amount);
    }
}
