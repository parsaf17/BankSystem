public class Client {
    private String name;
    private CheckingAccount cA;
    private SavingsAcc sA;
    //holds all the information from accounts
    public Client(String na, CheckingAccount c, SavingsAcc s){
        name = na;
        cA= c;
        sA = s;
    }

    public void print(){
        System.out.printf("Client name: %s", name);
        System.out.println("");
        cA.print();
        System.out.println("");
        sA.print();
    }

    public void depositCA(double d) {
        cA.deposit(d);
    }

    public void depositSA(double d) {
        sA.deposit(d);
    }
    public CheckingAccount getcheckingAcc(){
        return cA;
    }
}
