package thradingConcept;


class Audio implements Runnable {

    @Override
    public void run() {
        System.out.println("music is running");
    }
}

class Video implements Runnable {

    @Override
    public void run() {
        System.out.println("video is running");
    }
}

class Timer implements Runnable {

    @Override
    public void run() {
        System.out.println("video is running");
    }
}

public class PerformMutipleTaskByMutipleThread {
    public static void main(String[] args) {
        PerformMutipleTaskByMutipleThread pt = new PerformMutipleTaskByMutipleThread();
        Audio audio = new Audio();
        Video video = new Video();
        Timer timer = new Timer();

        Thread audioThread = new Thread(audio,"thread 1");
        Thread videoThread = new Thread(video,"Thread 2");
        Thread timerThread = new Thread(timer,"Thread 3");
        audioThread.start();
        System.out.print(audioThread.getName()); System.out.println(": "+audioThread.getId());
        videoThread.start();
        System.out.print(videoThread.getName()); System.out.println(": "+videoThread.getId());
        timerThread.start();


    }
}
