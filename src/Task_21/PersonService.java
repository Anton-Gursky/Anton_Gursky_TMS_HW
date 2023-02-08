package Task_21;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PersonService {

    public static void getAll(String filePath){

        Set<Person> res = new TreeSet<>();
        String strInfo;
        int quantityOfWomen = 0;
        int quantityOfMen = 0;
        int quantityWithAgeMoreThan30 = 0;

        try(FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader reader= new BufferedReader(isr)){

            while ((strInfo = reader.readLine()) != null){
                String[] arrayInfo = strInfo.split(",");
                res.add(new Person(arrayInfo[0],arrayInfo[1],arrayInfo[2],arrayInfo[3]));

                if(arrayInfo[2].equals("M")){
                    quantityOfMen++;
                }
                else {
                    quantityOfWomen++;
                }

                if (Integer.parseInt(arrayInfo[3]) > 30){
                    quantityWithAgeMoreThan30++;
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        //Вывод Tree Set (Проверка)
        Iterator<Person> iterator = res.iterator();
        System.out.println("Tree set:");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Вывод количества людей с возрастом более 30
        System.out.println("Количество людей с возрастом более 30: " + quantityWithAgeMoreThan30);

        //Вывод количества мужчин и женщин
        System.out.println("Количество мужчин: " + quantityOfMen);
        System.out.println("Количество женщин: " + quantityOfWomen);
    }
}