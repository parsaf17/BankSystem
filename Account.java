
//main account, checkings and savings inherit from this class
public class Account {
    private int accNum;
    private double balance;
  

    
    public Account(int aC,  double b){
        accNum=aC;
        balance=b;

    }

    public Account(){
        accNum=0;
        balance=0.0;  
    }

    public int getaccNum(){
        return accNum;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public void print(){
        System.out.printf("Balance = %f, Account Number %d%n", balance, accNum);
        
    }
    //deposit function
    public void deposit(double amount){
        if(amount>0)
             balance+= amount;
    }
    //withdraw function
    public void withdraw(double amount){
        if(amount>0 && amount<= balance)
            balance-=amount;
    }
    
}
