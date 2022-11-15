package Task_7.Task_7_2;

public class Main {

    public static void main(String[] args){

        Headmaster headmaster = new Headmaster();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        headmaster.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}
