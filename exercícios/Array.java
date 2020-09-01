// Array = Arranjo linear (coleção de variáveis de mesmo tipo)

public class Array {
    public static void main(String[] args) {
        
    int[] velocidades = new int[10]; // declaração de um array com 10 espaços 
    int velocidadeInicial = 10, velocidadeAtual;

    velocidades[3] = velocidadeInicial;
    velocidadeAtual = velocidades[3];
    
    System.out.println("Velocidade = "+velocidadeAtual+"km/h");
    }
}