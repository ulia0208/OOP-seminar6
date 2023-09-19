package ocp;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        // region Вариант 1

        List<Shape>shapes = new ArrayList<>();

        shapes.add(new RightTriangle(2,3));
        shapes.add(new Square(4));
        shapes.add(new Circle(3));

        double sumArea=0;

        for(Shape shape:shapes) {
            if (shape instanceof RightTriangle) {
                RightTriangle triangle = (RightTriangle) shape;
                sumArea += triangle.getKatet1() * triangle.getKatet2()/2.0;
            }
            if (shape instanceof Square) {
                Square square = (Square) shape;
                sumArea += Math.pow(square.getSide(), 2);
            }

            if (shape instanceof Circle) {
                Circle circle = (Circle) shapes;
                sumArea += Math.PI * circle.getRadius() * circle.getRadius();
            }

            System.out.printf("Сумма площадей равна %.2f\n", sumArea);


        //




            //endregion

            // region Вариант 2



            List<ShapeV2> shapesV2=new ArrayList<>();
            shapesV2.add(new RightTriangleV2(2, 3));
            shapesV2.add(new SquareV2(4));
            shapesV2.add(new RightTriangleV2(2, 3));
            shapesV2.add(new CircleV2(3));
            double sumAreaV2=0;
            for(ShapeV2 shapeV2 : shapesV2){
                sumAreaV2+=shapeV2.getArea();

            }
            System.out.printf("Сумма площадей равна %.2f\n", sumAreaV2);

            // endregion



        }
    }
}
