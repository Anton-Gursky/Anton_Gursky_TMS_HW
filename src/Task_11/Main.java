package Task_11;

public class Main {

    public static void main(String[] args) {

        // xxxx-yyy-xxxx-yyy-xyxy, где x — это цифра, а y — это буква.
        DocumentNumber firstDocumentNumber = new DocumentNumber("1234-Abc-5678-dEf-9g10h");
        DocumentNumber secondDocumentNumber = new DocumentNumber("5555-aaa-5555-aaa-5a5a");

        DocumentNumber.printFirstTwoDigitBlocks(firstDocumentNumber.string);
        DocumentNumber.changeDigitBlocksToStars(firstDocumentNumber.string);
        DocumentNumber.printLettersToLowerCase(firstDocumentNumber.string);
        DocumentNumber.printLettersToUpperCase(firstDocumentNumber.string);
    }
}