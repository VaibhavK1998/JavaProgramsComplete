package threadingConcept;


public class JoinMethodUse extends Thread {
 Thread mainThread;

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("value of i :" + i + " Thread Name: " + Thread.currentThread().getName());

        }
    }

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        JoinMethodUse joinMethodUse = new JoinMethodUse();
        joinMethodUse.setName("joinMethodUse ");
        joinMethodUse.start();
        try {
            joinMethodUse.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int a = 0; a < 10; a++) {
            System.out.println("value of a :" + a + " Thread Name: " + Thread.currentThread().getName());
        }
    }
}
