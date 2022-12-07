package Task_11.Task_4;

public class Word {

    public String string;
    public String[] words;
    public int symbolAmountInWord = 0;
    public int maxSymbolAmountInWord = 0;
    public int[] numberOfMostCommonSymbolsInEachWord = new int[2000];
    public int maxNumberOfMostCommonSymbolsInEachWord = 0;
    public int numberOfWord;

    public Word(String string) {
        this.string = string;
    }

    public void findWordWithMinDifSymbols(){

        words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int k = 0; k < words[i].length(); k++) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (words[i].charAt(k) == words[i].charAt(j)) {
                        symbolAmountInWord++;
                    }
                }
                if (maxSymbolAmountInWord < symbolAmountInWord){
                    maxSymbolAmountInWord = symbolAmountInWord;
                    symbolAmountInWord = 0;
                }
            }
            numberOfMostCommonSymbolsInEachWord[i] = maxSymbolAmountInWord;
            maxSymbolAmountInWord = 0;
        }

        for (int i = 0; i < numberOfMostCommonSymbolsInEachWord.length; i++) {
            if (maxNumberOfMostCommonSymbolsInEachWord < numberOfMostCommonSymbolsInEachWord[i]){
                maxNumberOfMostCommonSymbolsInEachWord = numberOfMostCommonSymbolsInEachWord[i];
                numberOfWord = i;
            }
        }
        System.out.println("Номер слова с максимальным кол-вом одинаковых символов: " + numberOfWord);
        System.out.println(words[numberOfWord]);
    }
}