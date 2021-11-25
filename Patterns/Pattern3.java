/*
I/P-> 5 
O/P->
    *
   **
  ***
 ****
*****         
*/
import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        
        System.out.print("Number of Rows = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space= n-1;
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
            space--;
            num++;
        }
        

    }
}