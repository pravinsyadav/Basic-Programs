import java.util.Scanner;
public class Palidrome {
    
    public static boolean isPalidromeChecker(int number){         // this declares a method 'isPalidromeChecker' with argument as 'number'
        String str = Integer.toString(number);              // this convert number to string
        String revstr = new StringBuilder(str).reverse().toString();          // this reverse the number
        return str.equals(revstr);                            // this checks reversed number and original number and return 'T' of 'F'
    }

            // 'string' clsss does not have functions like reverse, append, insert but 
            //  'stringbuilder' is a object and it has functions like reverse, append, insert that's why we used 'StringBuilder' instead of 'String'.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = sc.nextInt();

        if(isPalidromeChecker(number)){            // this calls the 'isPalindrome' method with 'number' as an argument.
            System.out.println(number + " is palidrome");
        }else{
            System.out.println(number + " is not palidrome");
        }
        sc.close();
    }
}
