package Task_5;

/*
Умножение двух матриц
Создайте два массива целых чисел размером 3х3 (две матрицы).
Напишите программу для умножения двух матриц.
Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
Ожидаемый результат:
1 2 3
1 1 1
0 0 0
*/
public class Task_5_2 {

    public static void main(String[] args){

        int[][] firstArray = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] secondArray = new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] finalArray = new int[3][3];
        int cell = 0;

        for(int row = 0; row < finalArray.length; row++){
            for (int col = 0; col < finalArray[row].length ; col++){

                for (int i = 0; i < secondArray.length; i++){
                    cell += firstArray[row][i] * secondArray[i][col];
                }
                finalArray[row][col] = cell;
                System.out.print(finalArray[row][col] + " ");
                cell = 0;
            }
            System.out.println();
        }
    }
}
