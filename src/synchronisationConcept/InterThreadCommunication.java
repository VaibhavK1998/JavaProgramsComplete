package synchronisationConcept;

class TotalEarnings extends Thread{

    /*
    Synchronized block can be used to perform synchronization on any specific resource of the method.

Suppose we have 50 lines of code in our method, but we want to synchronize only 5 lines, in such cases, we can use synchronized block.

If we put all the codes of the method in the synchronized block, it will work same as the synchronized method.

Points to Remember
Synchronized block is used to lock an object for any shared resource.
Scope of synchronized block is smaller than the method.
A Java synchronized block doesn't allow more than one JVM, to provide access control to a shared resource.
The system performance may degrade because of the slower working of synchronized keyword.
Java synchronized block is more efficient than Java synchronized method.
Syntax
synchronized (object reference expression) {
  //code block
}
     */
    int total=0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                total = total + 100;
            }
            System.out.println("total earning is :" + total);
            notify();
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        TotalEarnings earnings = new TotalEarnings();
        earnings.start();
        synchronized (earnings) {
            earnings.wait();
            System.out.println("total earnings main: " + earnings.total);
        }
    }
}