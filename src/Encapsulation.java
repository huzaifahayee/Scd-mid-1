public class Encapsulation {
}
class BankAccount {
    private double balance;        // hidden — encapsulation

    public BankAccount(double balance) {   // public constructor — anyone can create one
        this.balance = balance;
    }

    public double getBalance() {   // public getter — controlled read access
        return balance;
    }
}
