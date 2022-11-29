package Task_7.Task_7_3;

public class Register implements Registerable{

    Documents[] documents = new Documents[10];
    int i = 0;

    public void addDocument(Documents doc){
        documents[i] = doc;
        i++;
        System.out.println("Документ добавлен");
    }

    public void showDocumentInfo(Documents doc){
        System.out.println(doc);
    }
}
