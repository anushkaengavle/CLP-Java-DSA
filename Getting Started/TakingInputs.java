/*
    Take a integer, decimal, string & character as inputs and print them out. 
*/
import java.util.*;

public class TakingInputs {
    public static void main(String[] args) {
       

            Scanner sc = new Scanner(System.in);
            
            System.out.println("Type a number");
            int number = sc.nextInt();
            
            System.out.println("Type a number with decimal");
            float decimal = sc.nextFloat();

            sc.nextLine();
            System.out.println("Type a character");
            char ch = sc.nextLine().charAt(0);

            System.out.println("Type a String");
            String st = sc.nextLine();
        
            System.out.println("\n-----------------------\n");
            System.out.println(number+"\n");    
            System.out.println(decimal+"\n");   
            System.out.println(ch+"\n");         
            System.out.println(st+"\n");         
            System.out.println("\n-----------------------\n");
    }
}
