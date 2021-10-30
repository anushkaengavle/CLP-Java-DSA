/*
    1. You've to print first n fibonacci numbers.
    2. Take as input "n", the count of fibonacci numbers to print.
    3. Print first n fibonacci numbers.
*/
import java.util.*;
  
  public class Fibonacci{
  
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
            
    System.out.println("Enter number of digits to be printed");
    int num = sc.nextInt();
    
    int n1=0, n2=1,n3=0;

    System.out.print(n1+" "+n2);

    for(int i=0; i<num-1;i++)
    {
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;

    }


   }
  }
