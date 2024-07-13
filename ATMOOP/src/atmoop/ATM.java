/*

*/
package atmoop;

import java.util.Scanner;

public class ATM {
    private Account account; // this is an object it is also equal to Account account = new Account();
    private Scanner scanner ;// this is an object it is also equal to Scanner scanner = new Scanner(System.in);
    //Constructor
    public ATM (Account account){
        this.account = account;
        scanner = new Scanner(System.in);
    }
    public void displayMenu(){
        System.out.println("ATM");
        System.out.println("[1] Check Balance");
        System.out.println("[2] Withdraw");
        System.out.println("[3] Deposit");
        System.out.println("[4] Exit");     
    }
    
    public void run(){
        while(true){
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1:{
                    System.out.println("Balance: Php"+ account.getBalance());
                    System.out.print("\033c"); 
                    break;
                }
                case 2: {
                    System.out.print("Enter withdrawal amount: Php");
                    double withdrawAmount = scanner.nextDouble();
                    if(account.withdrawal(withdrawAmount)){
                        System.out.println("Withdrawal Successful");
                    }else{
                        System.out.println("Insufficient Balance");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter deposit amoun: Php");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit Successful");
                    break;
                }
                case 4: {
                    System.out.println("Thank you for using the ATM Goodbye!");
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}
