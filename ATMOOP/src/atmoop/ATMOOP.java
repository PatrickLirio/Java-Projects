/*
 */
package atmoop;

/**
 *
 * @author Patrick
 */
public class ATMOOP {


    public static void main(String[] args) {
        savingsAccount SA = new savingsAccount (123456, 1000, 0.5); //(acctNumber,initialBalance,interestRate)
        ATM atm1 = new ATM (SA);
        System.out.println("");
        atm1.run();
    }
    
}
