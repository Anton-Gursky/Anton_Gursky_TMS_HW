package Task_4;

import java.util.Scanner;

public class Task_4_1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int digit;
        int[] nums = new int[]{4, 9, 1, 18, 25, 7, 2, 86};

        System.out.println("Введите число в диапазоне от 1 до 100");
        digit = scanner.nextInt();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == digit){
                System.out.println("Заданное число входит в массив");
                break;
            }
            else if (i == nums.length - 1) {
                System.out.println("Заданное число не входит в массив");
            }
        }
    }
}