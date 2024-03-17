package threadingConcept;

public class CreateThreadUsingRunnableInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("thread start");
    }

    public static void main(String[] args) {
        CreateThreadUsingRunnableInterface crf = new CreateThreadUsingRunnableInterface();
        Thread th = new Thread(crf);
        th.start();
    }
}
