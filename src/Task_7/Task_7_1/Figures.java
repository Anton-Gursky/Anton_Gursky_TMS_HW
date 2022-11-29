package Task_7.Task_7_1;

public abstract class Figures {

    String figureType;

    public Figures(String figureType) {
        this.figureType = figureType;
    }

    public abstract int perimeter();
    public abstract int area();
}
