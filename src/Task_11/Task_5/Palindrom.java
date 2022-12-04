package Task_11.Task_5;

public class Palindrom {

    public String string;
    public String[] words;
    public String clean;
    public int length;
    public int forward;
    public int backward;
    public char forwardChar;
    public char backwardChar;
    public boolean bool = true;

    public Palindrom(String string) {
        this.string = string;
        words = string.split(" ");
    }

    public void isPalindrome(String string) {
        clean = string.replaceAll("\\s+", "").toLowerCase();
        length = clean.length();
        forward = 0;
        backward = length - 1;
        while (backward > forward) {
            forwardChar = clean.charAt(forward++);
            backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar) {
                System.out.println("Не палиндром");
                bool = false;
                break;
            }
        }
        if (bool){
            System.out.println("Является палиндромом");
        }
    }
}