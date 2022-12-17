package Task_15;

import java.util.HashSet;
import java.util.Set;

public class Word {

    public String string;
    public char[] words;
    public int symbolAmountInWord = 0;
    public Set <String> hashSet = new HashSet<>();

    public Word(String string) {
        this.string = string;
    }

    public void symbolsCounter(){

        words = (string.replace(" ", "")).toCharArray();

        for (int k = 0; k < words.length; k++) {

            if (!hashSet.contains(Character.toString(words[k]))){

                hashSet.add(Character.toString(words[k]));

                for (int j = 0; j < words.length; j++) {
                    if (words[k] == words[j]){
                        symbolAmountInWord++;
                    }
                }
                System.out.println(words[k] + " - " + symbolAmountInWord);
                symbolAmountInWord = 0;
            }
        }
    }
}