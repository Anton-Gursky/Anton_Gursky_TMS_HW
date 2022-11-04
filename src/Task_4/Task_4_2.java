package Task_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4_2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int digit;
        int j = 0;
        int count = 0;
        int[] firstArray = new int[] {4, 2, 8, 3, 17, 11, 4, 20, 22};

        System.out.println("Введите число, которое будет удалено из массива:");
        digit = scanner.nextInt();

        for (int i : firstArray) {
            if (digit == i) {
                count++;
            }
        }

        if (count == 0){
            System.out.println("Введенного числа нет в массиве");
        }
        else {
            int[] secondArray = new int[firstArray.length - count];

            for (int i = 0; i < firstArray.length; i++) {
                if (digit != firstArray[i]) {
                    secondArray[j] = firstArray[i];
                    j = j + 1;
                }
            }
            System.out.println(Arrays.toString(secondArray));
        }
    }
}
