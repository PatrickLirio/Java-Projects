
/**
 *
 * @author Patrick
 */
package exam_actimai;

import java.util.Scanner;
public class question4 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        System.out.println("The list of even perfect squares before " + n + " is/are :");

        // Start with the first perfect square, which is 1^2
        int number = 1;

        // Continue calculating squares until the square is greater than or equal to n
        while (true) {
            int square = number * number;

            // If the square is greater than or equal to n, stop
            if (square >= n) {
                break;
            }

            // Check if the square is even
            if (square % 2 == 0) {
                System.out.print(square + ",");
            }

            // Move to the next number
            number++;
        }

    }
}
