/**
    1. You've to count the number of digits in a number.
    2. Take as input "n", the number for which the digits has to be counted.
    3. Print the digits in that number.
 */
import java.util.*;
  
  public class CountDigits{
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int num,temp,count=0,rem=0;
    System.out.print("Enter the Number:");
    num = sc.nextInt();
    temp=num;
    while(temp!=0)
    {
      rem=temp%10;
      temp/=10;
      count+=1;
    }
    System.out.println("the number of digit in " +num+" are "+count);
  }
  }
