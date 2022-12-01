package Task_11;

public class Main {

    public static void main(String[] args) {

        // xxxx-yyy-xxxx-yyy-xyxy, где x — это цифра, а y — это буква.
        DocumentNumber documentNumber = new DocumentNumber("1234-abc-5678-def-9g10h");

        DocumentNumber.printFirstTwoDigitBlocks(documentNumber.string);
    }
}
