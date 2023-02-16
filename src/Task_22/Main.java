package Task_22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String line;
        File file = new File("C:\\Users\\anton\\IdeaProjects\\Contracts.txt");
        Set<String> hashSet = new LinkedHashSet<>();
        String[] words;
        List<Document> documents = new LinkedList<>();
        Map<String, Document> map = new LinkedHashMap<>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));

            while ((line = br.readLine()) != null) {
                words = line.split(",");
                hashSet.add(words[0]);
                Document doc = new Document();
                doc.setDocumentNumber(Integer.parseInt(words[1]));
                doc.setCreationDate(words[2]);
                documents.add(doc);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Вывод элементов hashSet (проверка)
        for (String s : hashSet) {
            System.out.println(s);
        }

        int j = 0;
        for (String i : hashSet){
            map.put(i, documents.get(j));
            j++;
        }

        //Вывести map
        System.out.println("Map:");
        for (Map.Entry<String, Document> set : map.entrySet()) {
            System.out.println(set.getKey() + "," + set.getValue());
        }
    }
}