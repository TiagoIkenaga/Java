package elementosgeo;

public abstract class Shape {// classe abstrata é aquela que pode ter métodos abstratos
    String color;// atributo de cor
    
    public void setColor (String color){//public significa que o método está acessivel de fora da classe
        this.color = color;// this. significa que estou colocando a informação no atributo color
    }
    public String getColor(){
        return color;
    }
    public abstract double getArea();// metodo abstrato com só assinatura definida, os filhos são responsáveis por implementar
}// forma geométrica
