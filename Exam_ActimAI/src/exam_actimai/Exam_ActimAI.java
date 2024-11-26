/**
 *  
 * Question 1. Write a program that converts roman numerals to its numerical value.

Sample#1
Input: XVII
Output: 17

 *
 * @author Patrick
 */
import java.util.Scanner;

public class Exam_ActimAI {
    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // In case of an invalid Roman numeral
        }
    }

    public static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0; // Value of the previous numeral

        // Process each character from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currValue = romanCharToInt(c);

            if (currValue < prevValue) {
                // If current value is less than previous, subtract it
                total -= currValue;
            } else {
                // Else, add it
                total += currValue;
            }

            prevValue = currValue; // Update previous value for next iteration
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the Roman numeral input
        System.out.print("Input: " );
        String romanNumeral = scanner.nextLine().trim().toUpperCase();

        // Convert and print the integer value
        
        int integerValue = romanToInt(romanNumeral);
        System.out.println("Output: " + integerValue);

    }
}
