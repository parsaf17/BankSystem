public class BankSystem {
    public static void main(String args[]){
        Bank citi = new Bank();
        System.out.println("");
        citi.openAccount();
        citi.printAccounts();
        System.out.println("===================\n");
        citi.deposit();
        citi.printAccounts();
        System.out.println("===================\n");
    }
}