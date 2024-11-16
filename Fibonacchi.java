import java.util.*;
public class Fibonacchi {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;        // first term 
        int b = 1;        // second term
        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            int c = a + b;                      // Calculate the next term
            a = b;               // assigning a as b
            b = c;              //  assigning b as c
        }
        sc.close();
    }
}
