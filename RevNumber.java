import java.util.Scanner;

public class RevNumber {

    public static int revNumber(int n){          // function to reverse a number

        int reversedNumber = 0;    // it is used to store reverseNumber

        // loop to reverse the number
         while (n!=0) {
            int digit = n%10;     // to get the last digit
            reversedNumber = reversedNumber * 10 + digit;
            n = n/10;       // remove the last digit of the number
         }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Read the number from user input
        
        // Call the reverse function and store the result
        int reversedNumber = revNumber(number); 
        
        System.out.println("Reversed Number: " + reversedNumber); // Output the reversed number
    
        sc.close(); // Close the scanner
    }
}