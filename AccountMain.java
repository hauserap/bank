public class AccountMain{
    public static void main(String[]args){

        Account bobAccount = new Account(20752);
        bobAccount.deposit(9000);
        bobAccount.withdraw(10000);

        System.out.println(bobAccount.toString());

        SavingsAccount tayler = new SavingsAccount(5485647);
        tayler.deposit(10);
        tayler.withdraw(100000);

        System.out.println(tayler.toString());
    }
}