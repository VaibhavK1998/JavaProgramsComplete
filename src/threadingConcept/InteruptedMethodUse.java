package threadingConcept;

class Hollywood extends Thread {
    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                Thread.currentThread().interrupt();
                System.out.println("value of i :" + i);
                System.out.println("isInteruppted method use :" + Thread.currentThread().isInterrupted());
                System.out.println("interrupted method used :" + Thread.interrupted());
                // this method chanes the status of thread fron true to false and viceversa The interrupted() method is a useful tool for controlling threads. It can be used to interrupt a thread that is taking too long to complete a task or that is performing a task that is no longer necessary.
                Thread.sleep(1000);


            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


public class InteruptedMethodUse {
    public static void main(String[] args) {
        Hollywood hwd = new Hollywood();
        hwd.start();
        // hwd.interrupt();// this method use to interrupt the thread.

    }
}
