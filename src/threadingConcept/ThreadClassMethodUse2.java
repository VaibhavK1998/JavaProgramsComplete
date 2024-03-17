package threadingConcept;

public class ThreadClassMethodUse2 extends Thread {
    @Override
    public void run() {
        System.out.println("user created thread run method");
        System.out.println("thread is alive: "+Thread.currentThread().isAlive());
        System.out.println("is this thread is daemon :"+ Thread.currentThread().isDaemon());


    }

    public static void main(String[] args) {
        System.out.println("main thread");
        ThreadClassMethodUse2 t1 = new ThreadClassMethodUse2();
        t1.setDaemon(true);// we need to set the thread ad Daemon before to call start(); method
        t1.setPriority(0);
        t1.start();

    }
}
