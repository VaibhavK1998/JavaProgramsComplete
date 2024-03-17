package threadingConcept;

public class ThreadClassMethodUse extends Thread {
    /*
    public void run():  is used to perform action for a thread.
public void start():  starts the execution of the thread.JVM calls the run() method on the thread.
public void sleep(long miliseconds):  Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
public void join():    waits for a thread to die.
public void join(long miliseconds):   waits for a thread to die for the specified miliseconds.
public int getPriority():   returns the priority of the thread.
public int setPriority(int priority):   changes the priority of the thread.
public String getName():   returns the name of the thread.
public void setName(String name):  changes the name of the thread.
public Thread currentThread():  returns the reference of currently executing thread.
public int getId():  returns the id of the thread.
public Thread.State getState():  returns the state of the thread.
public boolean isAlive():  tests if the thread is alive.
public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.
public void suspend(): is used to suspend the thread(depricated).
public void resume(): is used to resume the suspended thread(depricated).
public void stop(): is used to stop the thread(depricated).
public boolean isDaemon(): tests if the thread is a daemon thread.
public void setDaemon(boolean b): marks the thread as daemon or user thread.
public void interrupt(): interrupts the thread.
public boolean isInterrupted(): tests if the thread has been interrupted.
public static boolean interrupted(): tests if the current thread has been interrupted.
     */
    @Override
    public void run() { // run(); 1st method of run class
       // Thread.currentThread().setName("runMethodThread"); we can provide name to thread from here also.
        System.out.println("run method call");
        System.out.println("thread Name : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread.currentThread().setName("practiseThread");// here we give the name to the thread
        System.out.println("thread Name before run method: " + Thread.currentThread().getName());
        ThreadClassMethodUse t1 = new ThreadClassMethodUse();
        t1.setName("Thread 1");// this method we use to give name to the thread
        t1.setPriority(1);
        System.out.println("thread name: " + t1.getName());
        System.out.println("priority: " + t1.getPriority());
        System.out.println("id: " + t1.getId());
        t1.start();
        System.out.println("thread is live :" + t1.isAlive());
    }


}
