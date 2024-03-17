package threadingConcept;


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
        System.out.println("timer is running");
    }
}

public class PerformMutipleTaskByMutipleThread {
    public static void main(String[] args) {
        PerformMutipleTaskByMutipleThread pt = new PerformMutipleTaskByMutipleThread();
        Audio audio = new Audio();
        Video video = new Video();
        Timer timer = new Timer();

        Thread audioThread = new Thread(audio, "thread 1");
        Thread videoThread = new Thread(video, "Thread 2");
        Thread timerThread = new Thread(timer, "Thread 3");
        audioThread.start();
        System.out.println(" audio thread id: " + audioThread.getId());
        videoThread.start();
        System.out.println(" video thread id: " + videoThread.getId());
        timerThread.start();
        System.out.println("timer thread id: " + timerThread.getId());
    }
}
