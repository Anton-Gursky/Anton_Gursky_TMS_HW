package Task_7.Task_7_3;

import java.util.Arrays;
import java.util.Date;

public class Register{

    Documents[] documents = new Documents[10];
    int i = 0;

    public void addDocument(Documents doc){
        documents[i] = doc;
        i++;
        System.out.println("Документ добавлен");
    }

    public void showDocumentInfo(int i){
        if (i == 0){
            System.out.println("Номер документа: " + documents[i].documentNumber + "\n" +
                                "Дата: " + documents[i].date + "\n" +
                                "Дата завершения контракта: ");
        }
    }
}
