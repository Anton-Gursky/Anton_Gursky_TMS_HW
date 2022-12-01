package Task_11;

public class DocumentNumber {

    public String string;
    public static String[] words;

    public DocumentNumber(String string) {
        this.string = string;
    }

    //Выводим на экран в одну строку два первых блока по 4 цифры
    public static void printFirstTwoDigitBlocks(String string){

        words = string.split("-");
        for (int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}
