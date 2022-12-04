package Task_11.Task_3;

public class Word {

    public String string;
    public String[] words;
    public String biggestWord = "";
    public String smallestWord;

    public Word(String string) {
        this.string = string;
    }

    public void findBiggestWord(){

        words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(biggestWord.length() <= words[i].length()){
                biggestWord = words[i];
            }
        }
        System.out.println("Слово максимальной длины: " + biggestWord);
    }

    public void findSmallestWord(){

        words = string.split(" ");
        smallestWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (smallestWord.length() >= words[i].length()){
                smallestWord = words[i];
            }
        }
        System.out.println("Слово минимальной длины: " + smallestWord);
    }
}