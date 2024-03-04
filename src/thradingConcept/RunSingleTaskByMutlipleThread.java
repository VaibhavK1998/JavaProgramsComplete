package thradingConcept;

public class RunSingleTaskByMutlipleThread implements Runnable {

    @Override
    public void run() {
        System.out.println("task 1");
    }

    public static void main(String[] args) {
        RunSingleTaskByMutlipleThread rsmt = new RunSingleTaskByMutlipleThread();
        Thread thread1 = new Thread(rsmt);
        Thread thread2 = new Thread(rsmt);
        thread1.start();
        thread2.start();

    }

}
