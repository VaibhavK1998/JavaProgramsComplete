package thradingConcept;

class Calculation extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("value of i :" + i + " thread Name: " + Thread.currentThread().getName());
        }

    }
}

class Age extends Thread {
    /*
    The yield() method in Java is a method in the Thread class that allows a thread to voluntarily give up the processor to other threads of the same priority. When the yield() method is called, the thread scheduler may choose to switch to another thread of the same priority that is ready to run.
The yield() method is a suggestion to the thread scheduler, and it is not guaranteed that the scheduler will switch to another thread. The scheduler may choose to continue running the current thread if there are no other threads of the same priority that are ready to run.
The yield() method can be used to improve the responsiveness of a program by allowing other threads to run. For example, a thread that is performing a long-running operation can call the yield() method periodically to allow other threads to run. This can help to prevent the program from becoming unresponsive.
The yield() method is also used in some concurrency control constructs, such as semaphores and locks. For example, a thread that is waiting for a lock can call the yield() method to allow other threads to run while it is waiting.
     */
    @Override
    public void run() {
        Thread.yield();
        for (int i = 0; i < 10; i++) {
            System.out.println("value of i : " + i + " thread Name: " + Thread.currentThread().getName());
        }

    }
}

public class PreventivMethodWorking {
    public static void main(String[] args) {
        Age age = new Age();
        age.setName("age Thread");
        age.start();
        Calculation ct = new Calculation();
        ct.setName("calculationThread");
        ct.start();

    }

}
