package Task_22;

public class Document {

    private int documentNumber;
    private String creationDate;

    public Document() {

    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return  documentNumber + "," + creationDate;
    }
}