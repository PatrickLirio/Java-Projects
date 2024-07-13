
package batobatopickgame;

import java.util.Scanner;

public class BatoBatoPickGame {

    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       
       char choice = 0 ;

       int a =0;

        do{

            int userScore = 0;

            int computerScore = 0;

            while (a <= userScore || a <= computerScore){

            System.out.println("============= LETS PLAY BATO BATO PICK =============");

            System.out.print("User’s choice :");

            String userInput = read.nextLine();

            int num = (int) (Math.random() * 3);

            String computerChoice = "";

            if(num == 0){

            computerChoice = "Bato";

            }
            else if(num == 1){
                
                computerChoice ="Papel";
                
            }
            else {

                computerChoice = "Gunting";

            }

            System.out.println("Computer’s choice :" + computerChoice);

            if ((computerChoice.equals("Bato") && userInput.equalsIgnoreCase("Gunting"))||(computerChoice.equals("Gunting")
                && userInput.equalsIgnoreCase("Papel"))||(computerChoice.equals("Papel") && userInput.equalsIgnoreCase("Bato")))
            {

            System.out.println("Computer wins!");

            computerScore++;

            }

            else if ((computerChoice.equals("Gunting") && userInput.equalsIgnoreCase("Bato"))||(computerChoice.equals("Papel")
                    && userInput.equalsIgnoreCase("Gunting"))||(computerChoice.equals("Bato") && userInput.equalsIgnoreCase("Papel")))
            {

            System.out.println("User wins!");

            userScore++;

            }

            else if ((computerChoice.equals("Gunting") && userInput.equalsIgnoreCase("Gunting"))||(computerChoice.equalsIgnoreCase("Papel")
                       && userInput.equalsIgnoreCase("Papel"))||(computerChoice.equals("Bato") && userInput.equalsIgnoreCase("Bato")))
            {
                
            System.out.println("It's a tie!");

            }

            else {

            System.out.print("Papel/Bato/Gunting ONLY!");

                }

            System.out.println("");
            System.out.println("Leaderboard:");
            System.out.println("User :" + userScore);
            System.out.println("Computer :" + computerScore);

            if(userScore == 3){

                System.out.println("================= USER WINS!!!!! ===============");
                System.out.println("============== CONGRATULATIONS =============");

                break;
                }

            else if(computerScore == 3){

                System.out.println("================= COMPUTER WINS!!!!! ===============");

                System.out.println("============== CONGRATULATIONS =============");

                break;      
                }
            }

        System.out.print("Play again? [Y] – YES || [N] – NO :");
        choice = read.nextLine().toLowerCase().charAt(0);
        }while (choice == 'y'|| choice == 'Y');
        
         if(choice == 'n'||choice == 'N'){
             System.out.println("============ THANK YOU FOR PLAYING BATO BATO PICK ==========");

            }

            
    }     

}


