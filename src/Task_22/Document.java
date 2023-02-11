package Task_22;

public class Document {

    public int documentNumber;
    public String creationDate;

    public Document(int documentNumber, String creationDate) {
        this.documentNumber = documentNumber;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Document: " +
                "documentNumber=" + documentNumber +
                ", creationDate='" + creationDate + '\'';
    }
}
