package Task_19;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(11);
        list.add(72);
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(12);
        list.add(16);

        Editor editor = new Editor(list);
        Editor secondEditor = new Editor(list);
        Editor thirdEditor = new Editor(list);
        Editor fourthEditor = new Editor(list);
        Editor fifthEditor = new Editor(list);

        editor.deleteDuplicates();
        editor.deleteDuplicatesStream();

        secondEditor.elementsInRange();
        secondEditor.elementsInRangeStream();

        thirdEditor.multiplyBy2();
        thirdEditor.multiplyBy2Stream();

        fourthEditor.sortArray();
        fourthEditor.sortArrayStream();

        fifthEditor.elementsQuantity();

        fifthEditor.arithmeticalMean();
    }
}
