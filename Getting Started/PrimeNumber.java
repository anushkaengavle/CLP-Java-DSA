/*
    1. You've to check whether a given number is prime or not.
    2. Take a number "t" as input representing count of input numbers to be tested.
    3. Take a number "n" as input "t" number of times.
    4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
*/
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         // write ur code here

         System.out.println("How many numbers do you have?");
         int t = scn.nextInt();

        for(int i=1; i<=t; i++){

            System.out.println("Enter your number:");
            int n = scn.nextInt();
            int count = 0;

            for(int j=1; j<=n; j++){
                if(n % j == 0){
                    count = count+1;
                }
            }

            if(count > 2){
                System.out.println("Non-Prime");
            }
            else{
                System.out.println("Prime");
            }

        }
    
     }
}
