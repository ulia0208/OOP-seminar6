package task1;

public class Program {
    public static void main(String[] args) {
        Square square=new Square(new Point(1,1),5);
        System.out.printf("Площадь фигуры: %d\n", square.getArea());
        square.draw();

        SquareV2 squareV2=new SquareV2(new Point(1,1),10);

        System.out.printf("Площадь фигуры: %d\n", squareV2.getArea());
        SquareDrawer squareDrawer=new SquareDrawer(squareV2,3);
        squareDrawer.draw();

    }
}