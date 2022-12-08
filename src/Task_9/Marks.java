package Task_9;

import java.util.Arrays;

public class Marks {

    int[] marks;

    public Marks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return Arrays.toString(marks);
    }
}
