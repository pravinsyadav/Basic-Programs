import java.util.Scanner;

public class GCD {

    public static int findGCD(int a, int b) {          // function to calculate gcd
        while (b != 0) {
            int temp = b;
            b = a % b; // Compute remainder
            a = temp; // Update a
        }
        return a; // GCD is stored in a
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("enter number 2: ");
        int num2 = sc.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        sc.close();
    }
}

