/* 
    1. You've to print all prime numbers between a range. 
    2. Take as input "low", the lower limit of range.
    3. Take as input "high", the higher limit of range.
    4. For the range print all the primes numbers between low and high (both included).
*/
import java.util.*;

public class PrimeTillN{
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit");
        int low = sc.nextInt();
        System.out.println("Enter higher limit");
        int high = sc.nextInt();
        System.out.println("Your output is");
        int n = low;
        while(n<=high){
            int count = 0;
            for(int j=2; j*j<=n; j++){
                if(n % j == 0){
                    count++;
                }
            }

            if(count == 0){
                System.out.println(n);
            }
            n++;
        }

    }
}