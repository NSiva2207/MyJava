package Threads;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("main");
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2(thread1);
        Thread thread3 = new Thread(new Thread3(thread2));
        thread1.start();
        thread3.start();
        thread2.start();
        System.out.println("end");*/

        BankAccount account = new BankAccount(10000);

        Thread depositThread = new Thread(() -> {
            for(int i=0;i<5;i++){
                account.deposit(10.0);
            }
        });
        Thread withdrawThread = new Thread(() -> {
            for(int i=0;i<2;i++){
                account.withdraw(25.0);
            }
        });

        depositThread.start();
        withdrawThread.start();
        try{
            depositThread.join();
            withdrawThread.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(account.getBalance());
    }
}
