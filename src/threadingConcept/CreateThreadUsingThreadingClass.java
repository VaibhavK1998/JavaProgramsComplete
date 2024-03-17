package threadingConcept;

public class CreateThreadUsingThreadingClass extends Thread { // step 1 extend Thread class
    @Override
    public void run() {  // step 2 ovverride run method
        System.out.println("method 1");
    }
    public static void main(String[] args) {
        CreateThreadUsingThreadingClass c1 = new CreateThreadUsingThreadingClass();// step 3 create object of class
        c1.start();// step 4 call start method


    }

}
