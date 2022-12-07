package Task_11.Task_1;

public class Main {

    public static void main(String[] args) {

        // xxxx-yyy-xxxx-yyy-xyxy, где x — это цифра, а y — это буква.
        DocumentNumber firstDocumentNumber = new DocumentNumber("1234-Abc-5678-dEf-9g10h");
        DocumentNumber secondDocumentNumber = new DocumentNumber("5555-aaa-5555-aaa-1a2b");

        DocumentNumber.printFirstTwoDigitBlocks(firstDocumentNumber.string);
        DocumentNumber.changeDigitBlocksToStars(firstDocumentNumber.string);
        DocumentNumber.printLettersToLowerCase(firstDocumentNumber.string);
        DocumentNumber.printLettersToUpperCase(firstDocumentNumber.string);
        DocumentNumber.HasABC(firstDocumentNumber.string);
        DocumentNumber.startsWith555(secondDocumentNumber.string);
        DocumentNumber.endsWith1a2b(secondDocumentNumber.string);
    }
}