public class ElementosGeo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        
        shapes[0] = new Circle(2);
        shapes[0].setColor("Blue");

        shapes[1] = new Square(2);
        shapes[1].setColor("Red");

        for (Shape s:shapes){// s:shapes atribui cada elemento do arranjo shapes na variável s (loop forit = loop pra cada elemento)
            System.out.println("Cor: "+s.getColor()+", Área: "+s.getArea());
        }
    }
}
abstract class Shape {// classe abstrata é aquela que pode ter métodos abstratos
    String color;// atributo de cor
    
    public void setColor (String color){//public significa que o método está acessivel de fora da classe
        this.color = color;// this. significa que estou colocando a informação no atributo color
    }
    public String getColor(){
        return color;
    }
    public abstract double getArea();// metodo abstrato com só assinatura definida, os filhos são responsáveis por implementar
}// forma geométrica
class Circle extends Shape{
    double r;// atributo de raio
    Circle(double radius){
        r = radius;
    }// construtor salva o valor de raio
    @Override
    public double getArea(){
        return Math.PI * Math.pow(r, 2);
    }// metodo da área de um circulo 
}// circulo
class Square extends Shape{
    double l;// atributo de lado do quadrado
    Square(double sideLength){
        l = sideLength;
    }// construtor salva o valor do lado
    @Override
    public double getArea(){
        return Math.pow(l, 2);
    }// metodo da área de um quadrado 
}// quadrado