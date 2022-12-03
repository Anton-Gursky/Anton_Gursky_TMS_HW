package Task_11.Task_3;

public class Word {

    public static String[] words;
    public static String biggestWord = "";
    public static String smallestWord;

    public static void findBiggestWord(String string){

        words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(biggestWord.length() <= words[i].length()){
                biggestWord = words[i];
            }
        }
        System.out.println("Слово максимальной длины: " + biggestWord);
    }

    public static void findSmallestWord(String string){

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