package Task_13;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;

public class Document {

    public String filePath;
    public int i;
    public String documentText;

    public Document(String filePath) {
        this.filePath = filePath;
    }

    public void IsDocumentValid() throws IOException {

        Reader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);

        while ((i = bufferedReader.read()) != -1){

            documentText = (char) i + bufferedReader.readLine();
            if (documentText.length() == 15 && (documentText.startsWith("docnum") || documentText.startsWith("contract"))){
                System.out.println(documentText + ": удовлетворяет требованиям");
            }
            else{
                System.out.println(documentText + ": не удовлетворяет требованиям");
            }
        }
    }
}
