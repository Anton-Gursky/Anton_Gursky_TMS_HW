package Task_21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String filePath;

//        System.out.println("Введите путь к файлу:");
//        filePath = scanner.nextLine();
        filePath = "C:\\Users\\anton\\IdeaProjects\\Person.txt";
        PersonService.getAll(filePath);
        PersonService.writeToFile("C:\\Users\\anton\\IdeaProjects\\Person2.txt");
    }
}