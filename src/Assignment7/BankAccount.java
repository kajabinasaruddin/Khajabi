package Assignment7;

public class BankAccount {
    // Write a Java program to create a class known as "BankAccount" with methods called deposit()
    // and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw()
    // method to prevent withdrawals if the account balance falls below one hundred.
    public void deposit(){
        System.out.println("deposit");
    }
    public void withdraw(){
        System.out.println("withdraw");
    }
}
