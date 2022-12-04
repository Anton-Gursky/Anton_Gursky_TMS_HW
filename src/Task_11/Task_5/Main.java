package Task_11.Task_5;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Palindrom palindrom = new Palindrom("We are going to mountain Moom");
        System.out.println("Текущая строка: \"" + palindrom.string + "\"\n" +
                "Введите номер слова в строке по порядку (начиная с 0; 1 и т.д.) до " + palindrom.words.length +
                ", чтобы проверить, является ли оно палиндромом.");
        palindrom.isPalindrome(palindrom.words[scanner.nextInt()]);
    }
}