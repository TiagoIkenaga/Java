public class EstruturasControle {
    public static void main(String[] args) {
        int velocidadeAnterior = 0;
        int velocidadeAtual = 1;
        boolean acelerando;

        if (velocidadeAtual > velocidadeAnterior) {
            acelerando = true;
            System.out.println("Acelerando: "+acelerando);
        } else {
            acelerando = false;            
            System.out.println("Acelerando: "+acelerando);
        }// determina se está acelerando

        int[] velocidades = new int[10];
        
        for (int v = 0; v<10; v++) {
            velocidades[v] = 0;
        }// zera as velocidades
        
        while (velocidadeAtual>0) {
            velocidadeAtual--;
        }// desacelerando

        char letra ='a';
        switch (letra) {
            case 'a':
                velocidadeAtual++;
                break;
            case 'b':
                velocidadeAtual--;
                break;        
            default:
                break;
        }// seleciona de acordo com a letra
    }
}
