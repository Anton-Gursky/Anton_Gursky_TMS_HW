package Task_21;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String filePath;
        TreeSet<Person> setOfPeople;

//        System.out.println("Введите путь к файлу:");
//        filePath = scanner.nextLine();
        filePath = "C:\\Users\\anton\\IdeaProjects\\Person.txt";
        System.out.println(setOfPeople = PersonService.readFromFile(filePath));
        System.out.println(PersonService.calculateAmountsOfPeople(setOfPeople));
        PersonService.writeToFile("Person2.txt", setOfPeople);
    }
}