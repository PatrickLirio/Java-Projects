package exam_actimai;

/*
 *
 * @author Patrick
 * Write a function that takes a string and returns a list of its digits. So for 2b3a42d it should return [2,3,4,2].
 */


import java.util.Scanner;

public class question2 {
       public static int[] extractDigits(String s) {
        // Determine how many digits are in the string
        int digitCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digitCount++;
            }
        }

        // Create an array to store the digits
        int[] digits = new int[digitCount];
        int index = 0;

        // Populate the digits array
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                digits[index++] = Character.getNumericValue(c);
            }
        }

        return digits;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String inputString = "2b3a42d";
        System.out.print("Enter a combination of number and letters:");
        String inputString = scanner.nextLine();
        int[] digits = extractDigits(inputString);

        // Print the array of digits
        System.out.print("Output: ");
        for (int digit : digits) {
            System.out.print( digit +" "); // Output: 2 3 4 2
        }
    }
}

