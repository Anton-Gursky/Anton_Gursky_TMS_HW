package Task_22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args){

        String line;
        File file = new File("C:\\Users\\anton\\IdeaProjects\\Contracts.txt");
        HashSet<String> hashSet = new HashSet<>();
        int documentNumber;

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            while ((line = br.readLine()) != null){
                hashSet.add(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        Document[] documents = new Document[hashSet.size()];

        //Вывод элементов hashSet (проверка)
        for (String s : hashSet) {
            System.out.println(s);
        }

        //Создание новых документов
        for (int i = 0; i < documents.length; i++){
            documentNumber = ThreadLocalRandom.current().nextInt(10000, 1000000);
            documents[i] = new Document(documentNumber, generateString(6));
        }

        Map<String, Document> map = new LinkedHashMap<>();
        Iterator<String> it = hashSet.iterator();

        int j = 0;
        while (it.hasNext()){
            map.put(it.next(), documents[j]);
            j++;
        }

        //Вывести map
        System.out.println("Map:");
        for (Map.Entry<String, Document> set : map.entrySet()){
            System.out.println(set.getKey() + " = " + set.getValue());
        }
    }

    public static String generateString(int length)
    {
        char[] text = new char[length];
        String characters = "1234567890";
        Random rng = new Random();
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
}