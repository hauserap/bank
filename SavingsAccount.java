public class SavingsAccount extends Account{

public SavingsAccount(double rate){
   interestRate = rate;
   
}

public void addInterest()
{
   double interest = getBalance() * interestRate / 100;
   deposit(interest);
}

private double interestRate;
}
