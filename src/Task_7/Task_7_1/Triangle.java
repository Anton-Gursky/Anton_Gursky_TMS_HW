package Task_7.Task_7_1;

public class Triangle extends Figures{

    int firstLineLength;
    int secondLineLength;
    int thirdLineLength;

    public Triangle(String figureType, int firstLineLength, int secondLineLength, int thirdLineLength) {
        super(figureType);
        this.firstLineLength = firstLineLength;
        this.secondLineLength = secondLineLength;
        this.thirdLineLength = thirdLineLength;
    }

    @Override
    public int perimeter() {
        return (firstLineLength + secondLineLength + thirdLineLength);
    }

    @Override
    public int area() {
        int p = perimeter() / 2;
        return (int) Math.sqrt(p * (p - firstLineLength) * (p - secondLineLength) * (p - thirdLineLength));
    }
}