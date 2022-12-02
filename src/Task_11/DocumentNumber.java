package Task_11;

public class DocumentNumber {

    public String string;
    public static String[] words;
    public static char[] letters;
    public static StringBuilder stringBuilder;

    public DocumentNumber(String string) {
        this.string = string;
    }

    // xxxx-yyy-xxxx-yyy-xyxy, где x — это цифра, а y — это буква.
    //Выводим на экран в одну строку два первых блока по 4 цифры
    public static void printFirstTwoDigitBlocks(String string){
        words = string.split("-");
        System.out.println(words[0] + words[2]);
    }

    //Выводим на экран номер документа, но блоки из трех букв заменяем на *** (каждая буква заменятся на *)
    public static void changeDigitBlocksToStars(String string){

        words = string.split("-");
        for (int i = 0; i < words.length; i++){
            if (i % 2 == 0){
                System.out.print(words[i]);
            }
            else {
                System.out.print("***");
            }
        }
        System.out.println();
    }

    //Выводим на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    public static void printLettersToLowerCase(String string){

        letters = string.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        for (int i = 0; i < letters.length; i++){
            System.out.print(letters[i]);

            if(i == 2 || i == 5 || i == 6){
                System.out.print("/");
            }
        }
        System.out.println();
    }

    public static String customReplaceAll(String str, String oldStr, String newStr) {

        if ("".equals(str) || "".equals(oldStr) || oldStr.equals(newStr)) {
            return str;
        }
        if (newStr == null) {
            newStr = "";
        }
        final int strLength = str.length();
        final int oldStrLength = oldStr.length();
        stringBuilder = new StringBuilder(str);

        for (int i = 0; i < strLength; i++) {
            int index = stringBuilder.indexOf(oldStr, i);

            if (index == -1) {
                if (i == 0) {
                    return str;
                }
                return stringBuilder.toString();
            }
            stringBuilder.replace(index, index + oldStrLength, newStr);

        }
        return stringBuilder.toString();
    }

    //Выводим на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре (реализовать с помощью класса StringBuilder)
    public static void printLettersToUpperCase(String string){

        System.out.println(DocumentNumber.customReplaceAll(string, "A", ""));

    }


}