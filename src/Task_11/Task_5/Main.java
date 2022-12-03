package Task_11.Task_5;

import java.util.Scanner;

public class Main {

    public static String text = "We are going to mountain Moom";
    public static String[] words = text.split(" ");
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Текущая строка: \"" + text + "\"\n" +
                "Введите номер слова в строке по порядку (начиная с 0; 1 и т.д.) до " + words.length +
                ", чтобы проверить, является ли оно палиндромом.");
        Palindrom palindrom = new Palindrom();
        palindrom.isPalindrome(words[scanner.nextInt()]);
    }
}