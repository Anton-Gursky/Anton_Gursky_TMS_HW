package Task_11.Task_4;

public class Word {

    public static String[] words;
    public static int symbolAmountInWord = 0;
    public static int maxSymbolAmountInWord = 0;
    public static int[] numberOfMostCommonSymbolsInEachWord = new int[2000];
    public static int maxNumberOfMostCommonSymbolsInEachWord = 0;
    public static int numberOfWord;

    public static void findWordWithMinDifSymbols(String string){

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
