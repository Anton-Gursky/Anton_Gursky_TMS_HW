package Task_7.Task_7_1;

public class Rectangle extends Figures{

    int fistLineLength;
    int secondLineLength;

    public Rectangle(String figureType, int fistLineLength, int secondLineLength) {
        super(figureType);
        this.fistLineLength = fistLineLength;
        this.secondLineLength = secondLineLength;
    }

    @Override
    public int perimeter() {
        return (2 * fistLineLength + 2 * secondLineLength);
    }

    @Override
    public int area() {
        return (fistLineLength * secondLineLength);
    }
}
