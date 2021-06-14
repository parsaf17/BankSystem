public class CheckingAccount extends Account {
    private double minBalance;

    public CheckingAccount(int aC,  double b,double mB){
        super(aC, b);
        minBalance=mB;
    }

    public double getminBalance(){
        return minBalance;
    }
    
    public void setminBalance(double minBal){
        minBalance = minBal;
    }
    //prints the min balance in account
    @Override
    public void print(){
        super.print();
        System.out.printf("Minimum Balance: %f%n", minBalance);
    }
}
