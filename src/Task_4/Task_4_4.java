package Task_4;

public class Task_4_4 {

    public static void main(String[] args){

        int sumFirstArray = 0;
        int sumSecondArray = 0;
        int[] firstArray = new int[]{2, 18, 6, 4, 20};
        int[] secondArray = new int[]{23, 6, 15, 8, 65};

        for (int i = 0; i < firstArray.length; i++){
            System.out.print(firstArray[i] + " ");
            sumFirstArray += firstArray[i];
        }

        System.out.println();

        for (int i = 0; i < secondArray.length; i++){
            System.out.print(secondArray[i] + " ");
            sumSecondArray += secondArray[i];
        }

        System.out.println();

        if(sumFirstArray / firstArray.length > sumSecondArray / secondArray.length){
            System.out.println("Среднее арифметическое значение 1-ого массива больше чем 2-ого");
        }
        else if(sumFirstArray / firstArray.length < sumSecondArray / secondArray.length){
            System.out.println("Среднее арифметическое значение 2-ого массива больше чем 1-ого");
        }
        else {
            System.out.println("Средние арифметические значения массивов равны");
        }
    }
}
