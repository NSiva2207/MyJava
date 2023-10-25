package Threads;

public class Thread2 extends Thread{
    private Thread thread1;
    public Thread2(Thread thread1){
        this.thread1 = thread1;
    }
    @Override
    public void run(){
        try{
            thread1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=0;i<5;i++){
            System.out.println("thread2");
        }
    }

}
