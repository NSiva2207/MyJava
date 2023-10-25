package Threads;

public class Thread1 extends Thread{

    @Override
    public void run() {
        display();
    }
    public synchronized void display(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}
