package Task_11.Task_3;

public class Main {

    public static void main(String[] args){

        Word word = new Word("There were a lot of people in the house");
        Word secondWord = new Word("There were a lot of people in the house f");

        word.findBiggestWord();
        secondWord.findSmallestWord();
    }
}
