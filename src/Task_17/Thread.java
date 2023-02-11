package Task_17;

public class Thread extends java.lang.Thread {

    public Thread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(java.lang.Thread.currentThread().getName() + " : " + i);
        }
    }

}
