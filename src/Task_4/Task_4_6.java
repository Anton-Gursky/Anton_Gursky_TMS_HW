package Task_4;

public class Task_4_6 {

    public static void main(String[] args){

        int[] firstArray = new int[10];

        for (int i = 0; i < firstArray.length; i++){
            // Задаем значение элементов массива от 5 до 10
            firstArray[i] = (int)(Math.random() * ((10 - 5) + 1)) + 5;
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < firstArray.length; i++){
            if (i % 2 != 0){
                firstArray[i] = 0;
            }
            System.out.print(firstArray[i] + " ");
        }
    }
}