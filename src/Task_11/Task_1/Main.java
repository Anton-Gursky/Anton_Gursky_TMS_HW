package Task_11.Task_1;

public class Main {

    public static void main(String[] args) {

        // xxxx-yyy-xxxx-yyy-xyxy, где x — это цифра, а y — это буква.
        DocumentNumber firstDocumentNumber = new DocumentNumber("1234-ABC-5678-dEf-9g10h");
        DocumentNumber secondDocumentNumber = new DocumentNumber("5555-aaa-5555-aaa-1a2b");

        DocumentNumber.printFirstTwoDigitBlocks(firstDocumentNumber.string);
        DocumentNumber.changeDigitBlocksToStars(firstDocumentNumber.string);
        DocumentNumber.printLettersToLowerCase(firstDocumentNumber.string);
        DocumentNumber.printLettersToUpperCase(firstDocumentNumber.string);
        try {
            DocumentNumber.HasABC(firstDocumentNumber.string);
        } catch (HasAbcException ex1) {
            System.err.println(ex1);
        }
        try{
            DocumentNumber.startsWith555(secondDocumentNumber.string);
        }
        catch (StartsFrom555Exception ex2){
            System.err.println(ex2);
        }
        try{
            DocumentNumber.endsWith1a2b(secondDocumentNumber.string);
        }
        catch (FinishedWith1a2bException ex3){
            System.err.println(ex3);
        }
    }
}