package ocp;

public class Circle implements Shape{

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }



    private final int radius;

}
