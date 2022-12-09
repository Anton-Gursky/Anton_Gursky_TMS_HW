package Task_13;

import java.io.*;

public class Document {

    public String filePath;
    public int i;
    public String documentText;
    public String pathForValidDocumentNumbers = "C:\\Users\\anton\\IdeaProjects\\ValidDocumentNumbers.txt";
    public String pathForInvalidDocumentNumbers = "C:\\Users\\anton\\IdeaProjects\\InvalidDocumentNumbers.txt";
    File file = new File(pathForValidDocumentNumbers);
    File secondFile = new File(pathForInvalidDocumentNumbers);
    public Document(String filePath) {
        this.filePath = filePath;
    }

    public void IsDocumentValid() throws IOException {

        Reader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);
        Writer writerOfValidNumbers = new FileWriter(pathForValidDocumentNumbers);
        BufferedWriter bufferedWriter = new BufferedWriter(writerOfValidNumbers);
        Writer secondWriterOfInvalidNumbers = new FileWriter(pathForInvalidDocumentNumbers);
        BufferedWriter secondBufferedWriter = new BufferedWriter(secondWriterOfInvalidNumbers);

        while ((i = bufferedReader.read()) != -1){

            documentText = (char) i + bufferedReader.readLine();
            if (documentText.length() == 15 && (documentText.startsWith("docnum") || documentText.startsWith("contract"))){
                System.out.println(documentText + ": удовлетворяет требованиям");
                if (!file.exists()){
                    file.createNewFile();
                }
                    bufferedWriter.write(documentText + "\n");
//                Files.write(Paths.get(pathForValidDocumentNumbers),documentText.getBytes(), StandardOpenOption.APPEND);
            }
            else{
                System.out.println(documentText + ": не удовлетворяет требованиям");
                if (!secondFile.exists()){
                    secondFile.createNewFile();
                }
                if (documentText.length() != 15){
                    try {
                        throw new MaxLengthReachedException("Введена неверная длина номера документа");
                    } catch (MaxLengthReachedException e) {
                        secondBufferedWriter.write(documentText + " " + e.getMessage() + "\n");
                    }
                }
                else if(!documentText.startsWith("docnum") || !documentText.startsWith("contract")){
                    try {
                        throw new StartsWithWrongSymbolsException("Номер документа должен начинаться с \"docnum\" или \"contract\"");
                    } catch (StartsWithWrongSymbolsException e) {
                        secondBufferedWriter.write(documentText + " " + e.getMessage() + "\n");
                    }
                }
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
        secondBufferedWriter.close();
    }
}