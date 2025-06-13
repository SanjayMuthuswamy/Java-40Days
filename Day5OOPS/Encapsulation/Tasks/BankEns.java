
package Day5OOPS.Encapsulation.Tasks;

class Bank{
    private float balance;

    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public float getBalance() {
        return balance;
    }
}
public class BankEns { //User Class 
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(500.0f);
        System.out.println("Current Balance: " + bank.getBalance());
    }
    
}
