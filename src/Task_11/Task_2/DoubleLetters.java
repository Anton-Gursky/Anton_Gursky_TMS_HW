package Task_11.Task_2;

public class DoubleLetters {

    public char[] letters;

    public void DoubleLettersFromWord(String string){

        letters = string.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + "" + letters[i]);
        }
    }
}