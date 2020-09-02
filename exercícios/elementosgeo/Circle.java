package elementosgeo;

public class Circle extends Shape{
    double r;// atributo de raio
    public Circle(double radius){
        r = radius;
    }// construtor salva o valor de raio
    @Override
    public double getArea(){
        return Math.PI * Math.pow(r, 2);
    }// metodo da área de um circulo 
}// circulo
