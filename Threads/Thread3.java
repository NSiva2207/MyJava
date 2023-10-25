package Threads;

public class Thread3 implements Runnable{
    private Thread thread2;
    public Thread3(Thread thread2){
        this.thread2 = thread2;
    }
    @Override
    public void run() {
        try{
            thread2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("i'm in thread3");
    }
}
