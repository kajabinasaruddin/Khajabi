package Assignment7;

public class SavingsAccount extends BankAccount{
    // Write a Java program to create a class known as "BankAccount" with methods called deposit()
    // and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw()
    // method to prevent withdrawals if the account balance falls below one hundred.
    @Override
    public void withdraw() {
        super.withdraw();
    }
}
