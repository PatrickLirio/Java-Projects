/*
*/
package atmoop;

/**
 *
 * @author Patrick
 */
public class savingsAccount extends Account {
    private double interestrate;
    
    //constructor
    public savingsAccount(int acctNumber, double initialBalance, double interestRate){
        super(acctNumber, initialBalance);
        this.interestrate = interestRate;
    }
    
    //getter
    public double getInterestrate(){
        return this.interestrate;
    }
}
