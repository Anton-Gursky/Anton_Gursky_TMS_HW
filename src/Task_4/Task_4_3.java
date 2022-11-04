package Task_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4_3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int arrayLength;
        int sum = 0;

        System.out.println("Введите размер массива:");
        arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++){
            // Задаем случайные числа в диапазоне 10...100
             array[i] = (int)(Math.random() * ((100 - 10) + 1)) + 10;
             sum += array[i];
             System.out.print(array[i] + " ");
        }

        Arrays.sort(array);
        System.out.println("Минимальное число " + array[0]);
        System.out.println("Максимальное число " + array[arrayLength - 1]);
        System.out.println("Среднее значение массива: " + sum / arrayLength);
    }
}