package Task_11.Task_1;

public class DocumentNumber {

    public String string;
    public static String[] words;
    public static char[] letters;
    public static int counter;

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

    //Выводим на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
    public static void printLettersToUpperCase(String string){

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))){
                System.out.print(string.toUpperCase().charAt(i));
                if(counter == 2 || counter == 5 || counter == 6){
                    System.out.print("/");
                }
                counter++;
            }
        }
        System.out.println();
    }

    //Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью)
    public static void HasABC(String string){

        if(string.contains("abc") || string.contains("ABC")){
            System.out.println("Строка содержит abc");
        }
        else {
            System.out.println("Строка не содержит abc");
        }
    }

    //Проверить начинается ли номер документа с последовательности 555
    public static void startsWith555(String string){

        if (string.indexOf("555") == 0){
            System.out.println("Строка начинается с 555");
        }
        else {
            System.out.println("Строка не начинается с 555");
        }
    }

    //Проверить заканчивается ли номер документа на последовательность 1a2b
    public static void endsWith1a2b(String string){

        if(string.substring(string.length() - 4, string.length()).equals("1a2b")){
            System.out.print("Строка заканчивается на 1a2b");
        }
        else {
            System.out.print("Строка не заканчивается на 1a2b");
        }
    }
}