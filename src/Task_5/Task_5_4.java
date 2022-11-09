package Task_5;

/*
Создайте двумерный массив. Выведите на консоль диагонали массива.
*/
public class Task_5_4 {

    public static void main(String[] args){

        int[][] array = new int[][]{{3, 5, 10, 8}, {18, 7, 21, 14}, {25, 6, 1, 11}, {1, 6, 12, 3}};
        int k = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (i == j){
                    System.out.print(array[i][j] + " ");
                }
            }
        }

        System.out.println();

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (j == array[i].length - 1 - k){
                    System.out.print(array[i][j] + " ");
                    k++;
                }
            }
        }
    }
}
