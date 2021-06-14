import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Bank {
    ArrayList<Client> bK;

    Scanner s = new Scanner(System.in);
    Random r = new Random();
    public Bank(){
        bK = new ArrayList<>();
    }

    public void add(Client x) {
        bK.add(x);
    }
    public void printAccounts(){
        for( int i =0; i<bK.size(); i++)
           bK.get(i).print();       
    }
    //user creates an account with all the values of each account
    public void openAccount(){
        System.out.println("Enter your name: ");
        String cName =s.nextLine();
        System.out.println("Enter the Starting amount you would like in your Checkings Account: ");
        double startCA = s.nextDouble();
        System.out.println("Enter the Starting amount you would like in your Savings Account, with an intrest rate of 2%: ");
        double startSA = s.nextDouble();
        SavingsAcc sA = new SavingsAcc(r.nextInt(), startSA, 2.0 );
        CheckingAccount cA = new CheckingAccount(r.nextInt(), startCA, 100.0 );
        Client c = new Client(cName, cA, sA);
        add(c);
    }
    //user inputs for deposit and how much 
    public void deposit(){
        System.out.println("What is your account number?");
        int aN = s.nextInt();
        int index = searchAccount(aN);
        if( index != -1){
        System.out.print("How much would you like to deposit:");
        double d = s.nextDouble();
        s.nextLine();
        System.out.println("Which account would you like to deposit to: Checking or Savings?");
        String depAcc = s.nextLine();
        if(depAcc.equals("checking") || depAcc.equals("Checking")  )
        bK.get(index).depositCA(d);
        else
        bK.get(index).depositSA(d);
        }
        else
        System.out.println("Invalid Account Number");
    }
    //this allows the function to search for the account to deposit in
    public int searchAccount(int accNum){
        for(int i = 0; i<bK.size(); i ++)
            if(bK.get(i).getcheckingAcc().getaccNum() == accNum)
                return i;
        return -1;
    }
}
