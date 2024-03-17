package threadingConcept;


class Student extends Thread {
    @Override
    public void run() {
        System.out.println("student priority:" + Thread.currentThread().getPriority());
        System.out.println("i am student");
    }
}

class Teacher extends Thread {
    @Override
    public void run() {
        System.out.println("teacher priority:" + Thread.currentThread().getPriority());
        System.out.println("i am teacher");
    }
}

class Voulnteer extends Thread {
    @Override
    public void run() {
        System.out.println("Voulnteer prioroty:" + Thread.currentThread().getPriority());
        System.out.println("i am voulnteer");
    }
}

public class ThreadPriority extends Thread {
    public static void main(String[] args) { // note maximum priority thread will execute first. JVM will privide proceeser to the thread whose priority is high
        // note if we not set priority of thread then the default priority of each thread will be 5.
        Thread.currentThread().setPriority(5);
        System.out.println("main thread priority:" + Thread.currentThread().getPriority());
        Student student = new Student();
        student.setPriority(10);// we have
        student.start();
        Teacher teacher = new Teacher();
        teacher.setPriority(3);
        teacher.start();
        Voulnteer voulnteer = new Voulnteer();
        voulnteer.setPriority(1);
        voulnteer.start();
    }
}
/*
we can use constants whose dafult value is MIN_PRIORITY=1; NORM_PRIORITY=5; MAX_PRIORITY=10;
        student.setPriority(MAX_PRIORITY);// we have
        student.setPriority(MIN_PRIORITY);// we have
        student.setPriority(NORM_PRIORITY);
      MIN_PRIORITY=1; NORM_PRIORITY=5; MAX_PRIORITY=10;

      VVIMP: windows not support the threading concept.
      Thread is a platform dependent.
         */
