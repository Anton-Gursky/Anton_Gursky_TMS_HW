package Task_21;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PersonService {

    public static Set<Person> people = new TreeSet<>();
    public static String strInfo;
    public static int quantityOfWomen = 0;
    public static int quantityOfMen = 0;
    public static int quantityWithAgeMoreThan30 = 0;

    public static void getAll(String filePath){

        try(FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader reader= new BufferedReader(isr)){

            while ((strInfo = reader.readLine()) != null){
                String[] arrayInfo = strInfo.split(",");
                people.add(new Person(arrayInfo[0],arrayInfo[1],arrayInfo[2],arrayInfo[3]));

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
        Iterator<Person> iterator = people.iterator();
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

    public static void writeToFile(String filePath){
        try{
            File file = new File(filePath);
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            for(Person p : people){
                fileWriter.write(p + "\n");
            }
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}