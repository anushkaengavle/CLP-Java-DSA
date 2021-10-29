/*
    1. You've to print first n fibonacci numbers.
    2. Take as input "n", the count of fibonacci numbers to print.
    3. Print first n fibonacci numbers.
*/
import java.util.*;
  
  public class Fibonacci{
  
  public static void main(String[] args) {
      // write your code here
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      int n = sc.nextInt();

      int a = 0;
      int b = 1;
      System.out.println("The series is:");
      System.out.println(a);
      System.out.println(b);

      int count = 2;
      while(count<n){
          int c = a+b;
          System.out.println(c);
          a=b;
          b=c;
          count++;
      }
   }
  }
