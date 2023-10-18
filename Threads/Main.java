package Threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("main");
        Thread1 thread1 = new Thread1();
        thread1.setDaemon(false);
        thread1.start();
        System.out.println("end");
    }
}
