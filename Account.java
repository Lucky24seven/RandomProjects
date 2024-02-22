/*William Lawecki 2/21/2024
  Just some random code I started writing.
  Trying to not get rusty.  Goal of this program
  is to create an Account class that will manage a user's
  bank account.  Basic functions such as withdrawl, deposit,
  and print balance.  Checks a withdrawl condition.*/

public class Account {
    private int acctNumber;
    private String firstName;
    private String lastName;
    private double balance;

    public Account(int acct){
        acctNumber = acct;
        firstName = "";
        lastName = "";
        balance = 0.0;
    }

    public Account(int acctNumber, String firstName, String lastName){
        this.acctNumber = acctNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = 0.0;
    }

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    void printBalance(){
        System.out.println("Available Balance: $" + balance);
    }
    public static void main(String[] args) {
        Account acc = new Account(1001, "John", "Smith");
        acc.deposit(1000);
        acc.withdraw(55);
        acc.deposit(2000);
        acc.printBalance();

    }
}
//Available Balance: $2945.0
