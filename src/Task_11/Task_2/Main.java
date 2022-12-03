package Task_11.Task_2;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Введите строку, буквы которой хотите продублировать:");
        DoubleLetters doubleLetters = new DoubleLetters();
        doubleLetters.DoubleLettersFromWord(scanner.nextLine());
    }
}