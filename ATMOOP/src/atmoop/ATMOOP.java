/*
 */
package atmoop;


public class ATMOOP {


    public static void main(String[] args) {
        savingsAccount SA = new savingsAccount (123456, 1000, 0.5); //(acctNumber,initialBalance,interestRate)
        ATM atm1 = new ATM (SA);
        System.out.println("Welcome to PBL");
        atm1.run();
        
        checkingAccount CA = new checkingAccount(654321, 500,0.6);
        ATM atm2 = new ATM(SA);
        System.out.println("Welcome to Checking Account");
        atm2.run();
    }
    
}
