/*
 I/P-> 5
 O/P-> 
 *****
 ****
 ***
 **
 *
 
*/
import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.print("Number of Rows = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<= n; i++) {
                for(int j=n; j>=i ;j--){
                    System.out.print("*");
                }
            System.out.println();
        }
    }   
}