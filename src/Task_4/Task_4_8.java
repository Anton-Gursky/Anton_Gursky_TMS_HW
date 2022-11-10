package Task_4;

public class Task_4_8 {

    public static void main(String[] args){

        int currentDigit;
        boolean isSorted = false;
        int [] array = {11, 3, 14, 16, 7};

        while(isSorted == false){
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i + 1]){
                    isSorted = false;
                    currentDigit = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = currentDigit;
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
