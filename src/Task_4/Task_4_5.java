package Task_4;

import java.util.Scanner;

public class Task_4_5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int arrayLength;
        int j = 0;
        int count = 0;

        System.out.println("Введите размер массива (от 5 до 10):");
        arrayLength = scanner.nextInt();

        while (arrayLength <= 5 || arrayLength > 10){
            System.out.println("Введен неверный размер массива. Введите размер от 5 до 10:");
            arrayLength = scanner.nextInt();
        }

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * ((100 - 10) + 1)) + 10;
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0){
                count++;
            }
        }

        System.out.println();
        int[] secondArray = new int[count];

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                secondArray[j] = array[i];
                System.out.print(secondArray[j] + " ");
                j++;
            }
        }
    }
}