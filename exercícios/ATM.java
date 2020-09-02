// programa para separação do valor de saque pela quantidade de notas respectivamente
public class ATM {
    public static void main(String[] args) {
        int amount = 1245;        
        int[] billValues = {100,50,20,10,5,2,1};        
        int[] numberOfBills = getBillDistribution(amount, billValues);
        
        printOutput(amount, billValues, numberOfBills);
    }
    public static void printOutput(int amount, int[] billValues, int[] numberOfBills){
        System.out.println("Dividir R$"+ amount +" em notas de R$100, R$50, R$20, R$10, R$5, R$2, R$1");
        for (int i = 0; i < billValues.length; i++) {
            System.out.println("Notas de R$"+billValues[i]+": "+numberOfBills[i]);
        }
    }
    public static int[] getBillDistribution(int amount, int[] billValues){
        int[] numberOfBills = new int[billValues.length];

        for (int i = 0; i < billValues.length; i++) {
            numberOfBills[i] = amount / billValues[i];
            amount %= billValues[i];
        }
        return numberOfBills;
    }
}
