public class SavingsAccount extends Account{

   public SavingsAccount(int rate) {
      super(rate);
      
   }

public void addInterest()
{
   double interest = getBalance() * interestRate / 100;
   deposit(interest);
}

private double interestRate;
}
