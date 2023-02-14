package Task_21;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PersonService {

    public static Set<Person> people = new TreeSet<>(new FirstComparator());
    public static String strInfo;
    public static int quantityOfWomen = 0;
    public static int quantityOfMen = 0;
    public static int quantityWithAgeMoreThan30 = 0;

    public static void readFromFile(String filePath) {

        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(isr);

            try {
                while ((strInfo = reader.readLine()) != null) {
                    String[] arrayInfo = strInfo.split(",");

                    Person person = new Person();
                    person.setName(arrayInfo[0]);
                    person.setSurname(arrayInfo[1]);
                    person.setSex(arrayInfo[2]);
                    person.setAge(arrayInfo[3]);
                    people.add(person);
                }
            } finally {
                fis.close();
                isr.close();
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Вывод Tree Set (Проверка)
        Iterator<Person> iterator = people.iterator();
        System.out.println("Tree set:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void calculateAmountsOfPeople() {

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person p;
            if ((p = iterator.next()).getSex().equals("M")) {
                quantityOfMen++;
            } else {
                quantityOfWomen++;
            }

            if (Integer.parseInt(p.getAge()) > 30) {
                quantityWithAgeMoreThan30++;
            }
        }

        //Вывод количества людей с возрастом более 30
        System.out.println("Количество людей с возрастом более 30: " + quantityWithAgeMoreThan30);

        //Вывод количества мужчин и женщин
        System.out.println("Количество мужчин: " + quantityOfMen);
        System.out.println("Количество женщин: " + quantityOfWomen);
    }

    public static void writeToFile() {

        try {
            FileOutputStream fos = new FileOutputStream("Person2.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            BufferedWriter writer = new BufferedWriter(osw);

            try {
                for (Person p : people) {
                    writer.write(p.toString() + "\n");
                }
            } finally {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}