/*

*/
package atmoop;

/**
 *
 * @author Patrick
 */
public class Account {
    private int accountNumber;
    private double balance;
    // constructor
    public Account (int acctNumber, double initialBalance){
        this.accountNumber = acctNumber;
        this.balance = initialBalance;
    }
    
    //getter
    public double getBalance(){
        return this.balance;
    }
    
    //setter
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    //method for deposit
    public void deposit(double amount){
        balance += amount;
    }
    
    //method for withdrawal
    public boolean withdrawal(double amount){
        if(balance >= amount){
            balance -= amount;
            return true;
        }else
        {
            return false;
        }
    }
}
