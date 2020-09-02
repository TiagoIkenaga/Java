package elementosgeo;

public class Square extends Shape{
    double l;// atributo de lado do quadrado
    public Square(double sideLength){
        l = sideLength;
    }// construtor salva o valor do lado
    @Override
    public double getArea(){
        return Math.pow(l, 2);
    }// metodo da área de um quadrado 
}// quadrado