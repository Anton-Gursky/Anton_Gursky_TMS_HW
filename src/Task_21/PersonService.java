package Task_21;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.TreeSet;

public class PersonService {

    public static TreeSet<Person> readFromFile(String filePath) {

        TreeSet<Person> people = new TreeSet<>(new FirstComparator());
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader reader = null;
        try {
            fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            reader = new BufferedReader(isr);
            String strInfo;

            while ((strInfo = reader.readLine()) != null) {
                String[] arrayInfo = strInfo.split(",");

                Person person = new Person();
                person.setName(arrayInfo[0]);
                person.setSurname(arrayInfo[1]);
                person.setSex(arrayInfo[2]);
                person.setAge(arrayInfo[3]);
                people.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (isr != null) {
                    isr.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return (people);

//        //Вывод Tree Set (Проверка)
//        Iterator<Person> iterator = people.iterator();
//        System.out.println("Tree set:");
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }

    public static String calculateAmountsOfPeople(TreeSet<Person> setOfPeople) {

        int quantityOfWomen = 0;
        int quantityOfMen = 0;
        int quantityWithAgeMoreThan30 = 0;

        for(Person i : setOfPeople){
            if(i.getSex().equals("M")){
                quantityOfMen++;
            }else {
                quantityOfWomen++;
            }

            if(Integer.parseInt(i.getAge()) > 30){
                quantityWithAgeMoreThan30++;
            }
        }
        return ("Количество людей с возрастом более 30: " + quantityWithAgeMoreThan30 + "\n" +
                "Количество мужчин: " + quantityOfMen + "\n" +
                "Количество женщин: " + quantityOfWomen);

//        //Вывод количества людей с возрастом более 30
//        System.out.println("Количество людей с возрастом более 30: " + quantityWithAgeMoreThan30);
//
//        //Вывод количества мужчин и женщин
//        System.out.println("Количество мужчин: " + quantityOfMen);
//        System.out.println("Количество женщин: " + quantityOfWomen);
    }

    public static void writeToFile(String fileName, TreeSet<Person> people) {

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            BufferedWriter writer = new BufferedWriter(osw);

            try {
                for (Object p : people) {
                    writer.write(p.toString() + "\n");
                }
            } finally {
                fos.close();
                osw.close();
                writer.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}