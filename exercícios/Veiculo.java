public class Veiculo {
    static int atributoEstatico = 1;

    float velocidadeAtual = 0f;
    long numeroDeSerie = 0;

    static String metodoEstatico(){
        return "Atributo estático vale: "+ atributoEstatico;
    }// atributo estático

    Veiculo(){
        numeroDeSerie = -1;
    }// construtor defaul re-definido

    Veiculo(float vel, long num){
        velocidadeAtual = vel;
        numeroDeSerie = num;
    }// construtor
    
    void acelerar(float deltaV) {
        velocidadeAtual += deltaV;
    }// acelerar

    void brecar() {
        velocidadeAtual -= 1.0f;
    }// brecar

    void parar() {
        while (velocidadeAtual>0) {
            brecar();
        }// enquanto estiver andando
        velocidadeAtual = 0;
    }// parar
}// Veiculo
