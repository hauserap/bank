public class SavingsAccount extends Account{
   private double interestRate;

   public SavingsAccount(int a) {
      super(a);  
   }

public void addInterest()
{
   double interest = getBalance() * interestRate / 100;
   deposit(interest);
}


}
