package Task_7.Task_7_1;

public class Circle extends Figures{

    int radius;

    public Circle(String figureType, int radius) {
        super(figureType);
        this.radius = radius;
    }

    @Override
    public int perimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public int area() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
}
