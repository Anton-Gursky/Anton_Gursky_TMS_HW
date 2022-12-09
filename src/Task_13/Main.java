package Task_13;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static Scanner scanner= new Scanner(System.in);
    public static String path;
    //"C:\\Users\\anton\\IdeaProjects\\DocumentNumbers.txt"

    public static void main(String[] args) {

//        System.out.println("Введите путь к файлу:");
//        path = scanner.nextLine();
        Document document =new Document("C:\\Users\\anton\\IdeaProjects\\DocumentNumbers.txt");
        try{
            document.IsDocumentValid();
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}