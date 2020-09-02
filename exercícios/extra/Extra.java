package extra;

import elementosgeo.Circle;
import elementosgeo.Shape;
import elementosgeo.Square;

public class Extra {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        
        shapes[0] = new Circle(2);
        shapes[0].setColor("Blue");

        shapes[1] = new Square(2);
        shapes[1].setColor("Red");

        for (Shape s:shapes){// s:shapes atribui cada elemento do arranjo shapes na variável s
            System.out.println("Cor: "+s.getColor()+", Área: "+s.getArea());
        }// loop forit = loop pra cada elemento
    }
}
