package Task_5;
/*
* Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.
 */
public class Task_5_3 {

    public static void main(String[] args){

        int[][] firstArray = new int[][]{{1, 4, 8, 5}, {11, 7, 18, 21}, {6, 2, 1, 9}};
        int sum = 0;

        for (int i = 0; i < firstArray.length; i++){
            for (int j = 0; j < firstArray[i].length; j++){
                sum += firstArray[i][j];
            }
        }
        System.out.println(sum);
    }
}
