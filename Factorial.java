import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("invalid");
        }else{
            System.out.println("the factorial of number "+ n +" is "+ calFact(n));
        }
        sc.close();
    }
    
    public static long calFact(int n){            //function for calculating factorial
            long fact = 1;
            for(int i = 1; i<=n; i++){
                fact = fact * i;
            }
            return fact;
        }
    }



