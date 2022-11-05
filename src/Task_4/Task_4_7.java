package Task_4;

import java.util.Arrays;

public class Task_4_7 {

    public static void main(String[] args){

        String[] names = new String[]{"Mike", "Liz", "George", "Antonio", "Grace", "Alex", "Hanna"};

        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }
        System.out.println();
        Arrays.sort(names);

        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }
    }
}
