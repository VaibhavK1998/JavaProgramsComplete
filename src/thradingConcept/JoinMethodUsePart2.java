package thradingConcept;

class Box extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println("Box class" + i);
    }
}

class Pencil extends Thread {
    @Override
    public void run() {
        for (int b = 0; b < 5; b++)
            System.out.println("pencil class" + b);
    }
}


class Shopner extends Thread {
    @Override
    public void run() {
        for (int c = 0; c < 5; c++) {
            System.out.println("Shopner class");
        }
    }
}

public class JoinMethodUsePart2 {
    public static void main(String[] args) throws InterruptedException {
        Audio audio = new Audio();// here we use diffrent class
        Thread audioThread = new Thread(audio);
        audioThread.start();
        audioThread.join();
        Box box = new Box();
        box.start();
        box.join();
        Pencil pencil = new Pencil();
        pencil.start();
        pencil.join();
        Shopner shopner = new Shopner();
        shopner.start();
    }

}
