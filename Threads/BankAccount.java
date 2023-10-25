package Threads;

public class BankAccount {
    private double amount;
    public BankAccount(double amount){
        this.amount = amount;
    }

    public synchronized void withdraw(double cash){
        if(cash <= amount){
            amount-=cash;
        }else{
            System.out.println("Insuffecient funds");
        }
    }

    public synchronized void deposit(double cash){
        amount+=cash;
    }

    public synchronized double getBalance(){
        return amount;
    }

}
