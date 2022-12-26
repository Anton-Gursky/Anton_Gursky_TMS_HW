package Task_17;
import  java.lang.Thread;
public class Main {

    public static void main(String[] args) {

        Thread firstThread = new Task_17.Thread("A");
        Thread secondThread = new Task_17.Thread("B");
        Thread thirdThread = new Task_17.Thread("C");

        thirdThread.start();

        try {
            thirdThread.join();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        secondThread.start();

        try {
            secondThread.join();
        }
        catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }

        firstThread.start();

        try {
            firstThread.join();
        }
        catch (InterruptedException exc){
            System.out.println(exc.getMessage());
        }
    }
}