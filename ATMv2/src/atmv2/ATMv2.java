
package atmv2;

import java.util.Scanner;



public class ATMv2 {


    
    public static void main(String[] args) {
       int accountBalance = 1000;
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to ATM machine");
        
        System.out.println("[1] Check Balance");
        System.out.println("[2] Withdraw");
        System.out.println("[3] Deposit");
        System.out.println("[4] Exit");
        System.out.println("Enter choice: ");
        int choice = inp.nextInt();
        
        switch(choice){
            case 1:{
               
                System.out.println("Your Balance is: "+accountBalance);
                break;
            }

            case 2:{
                System.out.print("Enter your pin: " );
                String pin = inp.next();
                if (pin.equals("1234")) {
                    System.out.print("Enter amount to withdraw: Php");
                    int withdrawalAmount = inp.nextInt();
                    if(withdrawalAmount <= accountBalance){
//                       if(withdrawalAmount%100 ==0 )// create a condition accepting 100 withdrawals only if not it will be decline
                        accountBalance -= withdrawalAmount;
                        System.out.println("Your withrawal amount is: Php"+ withdrawalAmount);
                        System.out.println("Your current balance is: Php"+ accountBalance);
                    }else{
                        System.out.println("Insufficient amount");
                    }
                }
                System.out.println("Successful Withdraw");
                break;
            }
            case 3:{
                break;
            }
            case 4:{
                break;
            }
            default: {
                break;
            }
            
            
        }
        
    }
    
}
