package Task_13;

import java.io.*;
import java.util.*;

public class Document {

    public String filePath;
    public String filename;
    public int i;
    public static String documentText;
    public String text;

    //2 пути для valid и invalid документов заменены на 1 путь: pathReport
//    public static String pathForValidDocumentNumbers = "C:\\Users\\anton\\IdeaProjects\\ValidDocumentNumbers.txt";
//    public static String pathForInvalidDocumentNumbers = "C:\\Users\\anton\\IdeaProjects\\InvalidDocumentNumbers.txt";
    public static String pathReport = "C:\\Users\\anton\\IdeaProjects\\Report.txt";
    static File file = new File(pathReport);
    static File secondFile = new File(pathReport);
    public List<String> list = new ArrayList<>();
    public static Set <String> hashSet = new HashSet<>();
    public static HashMap<String, String> documentsAndComments = new HashMap<>();

    public Document(String filePath, String filename) {
        this.filePath = filePath;
        this.filename = filename;
        list.add(filename);
    }

    public void putDocumentNumbersFromFileToSet() throws IOException{

        Reader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);

        while ((text = bufferedReader.readLine()) != null){
            hashSet.add(text);
        }

        bufferedReader.close();
    }

    public static void IsDocumentValid() throws IOException {

        Iterator<String> it = hashSet.iterator();
        Writer writerOfValidNumbers = new FileWriter(pathReport);
        BufferedWriter bufferedWriter = new BufferedWriter(writerOfValidNumbers);

        //Использование 2-ого bufferedReader не требуется
//        Writer secondWriterOfInvalidNumbers = new FileWriter(pathReport);
//        BufferedWriter secondBufferedWriter = new BufferedWriter(secondWriterOfInvalidNumbers);

        while (it.hasNext()){

            documentText = it.next();

            if (documentText.length() == 15 && (documentText.startsWith("docnum") || documentText.startsWith("contract"))){
                System.out.println(documentText + ": удовлетворяет требованиям");
                documentsAndComments.put(documentText, ": удовлетворяет требованиям");

                if (!file.exists()){
                    file.createNewFile();
                }
                    bufferedWriter.write(documentText + documentsAndComments.get(documentText) + "\n");
//                Files.write(Paths.get(pathForValidDocumentNumbers),documentText.getBytes(), StandardOpenOption.APPEND);
            }

            else{
                System.out.println(documentText + ": не удовлетворяет требованиям");
                documentsAndComments.put(documentText, ": не удовлетворяет требованиям");
                if (!secondFile.exists()){
                    secondFile.createNewFile();
                }
                if (documentText.length() != 15){
                    try {
                        throw new MaxLengthReachedException("Введена неверная длина номера документа");
                    } catch (MaxLengthReachedException e) {
                        bufferedWriter.write(documentText + documentsAndComments.get(documentText) + " (" + e.getMessage() + ")\n");
                    }
                }
                else if(!documentText.startsWith("docnum") || !documentText.startsWith("contract")){
                    try {
                        throw new StartsWithWrongSymbolsException("Номер документа должен начинаться с \"docnum\" или \"contract\"");
                    } catch (StartsWithWrongSymbolsException e) {
                        bufferedWriter.write(documentText + documentsAndComments.get(documentText) + " (" + e.getMessage() + ")\n");
                    }
                }
            }
        }
        bufferedWriter.close();
    }
}