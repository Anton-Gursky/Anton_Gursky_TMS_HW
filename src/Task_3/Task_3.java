package Task_3;

import java.util.Scanner;

public class Task_3 {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main (String [] args){

        int quoteNum = 0;

        System.out.println("Введите число:");
        int num = scanner.nextInt();

        if (num > 0 && num < 15){
            System.out.println("Группа 1");
            quoteNum = 1;
        }
        else if (num >= 15 && num < 30){
            System.out.println("Группа 2");
            quoteNum = 2;
        }
        else if (num >= 30){
            System.out.println("Группа 3");
            quoteNum = 3;
        }
        else {
            System.out.println("Вне диапазона, проверьте введенное число");
        }

        for (int i = 0; i < quoteNum; i++){
            System.out.println("Цитата");
        }
    }
}
