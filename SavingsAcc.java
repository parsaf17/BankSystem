public class SavingsAcc extends Account {
    private double intrest;
    // savings account constructor
    public SavingsAcc(int aC,  double b, double r){
        super(aC, b);
        intrest=r;
    }

    public double getIntrest(){
        return intrest;
    }
    
    public void setIntrest(double newIntrest){
        intrest = newIntrest;
    }
    //prints out intrest rate of savings account
    @Override
        public void print(){
            super.print();
            System.out.printf("Savings Account Intrest Rate: %f%n", intrest);
        }
}
