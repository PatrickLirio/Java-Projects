/*
*/
package atmoop;

/**
 *
 * @author Patrick
 */
public class checkingAccount extends Account{
    private double interestrate;
    
    // constructor
    public checkingAccount(int acctNumber, double initialBalance, double interestRate){
        super(acctNumber, initialBalance);
        this.interestrate = interestRate;
    }
     public double getInterestrate(){
        return this.interestrate;
    }
}
