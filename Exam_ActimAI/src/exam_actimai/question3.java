/**
 *
 * @author Patrick
 * Question 3. Find a and b satisfying bi + aj = n. 
Each values of a and b should be greater than 0.

Sample#1
Input : n=7 i=2 j=3
Output : b=2, a=1 
Explanation: here b and a satisfies the equation

Sample#2
Input : n=4 i=2 j=7 
Output : No solution

 */
package exam_actimai;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for n, i, and j
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of i: ");
        int i = scanner.nextInt();

        System.out.print("Enter the value of j: ");
        int j = scanner.nextInt();

        // Flag to check if a solution is found
        boolean found = false;

        // Loop through possible values of b starting from 1
        for (int b = 1; b <= n / i; b++) {
            // Calculate a based on the current value of b
            int a = (n - (b * i)) / j;

            // Check if the solution is valid
            if (a > 0 && (b * i) + (a * j) == n) {
                System.out.println("b = " + b + ", a = " + a);
                found = true;
                break;
            }
        }

        // If no solution was found
        if (!found) {
            System.out.println("No solution");
        }

       
    }
}
    

