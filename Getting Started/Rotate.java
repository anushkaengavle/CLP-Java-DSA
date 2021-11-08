/**
    1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
    2. Take as input n and k.
    3. Print the rotated number.
    4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
    n = 12340056
    k = 3
    r = 05612340

    I/P-> 562984
          2
    O/P-> 845629
*/

import java.util.*;

public class Rotate {
    public static void main(String[] args) {
        // write your code here  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        //count number of digits
        int temp = n;
        int nod = 0;
        while(temp > 0){
            temp = temp/10;
            nod++;
        }

        k = k % nod;
        if(k<0){
            k = k + nod;
        }
        int div = 1;
        int mul = 1;
        for(int i=1; i<=nod; i++){
            if(i<=k){
                div = div * 10;
            }
            else{
                mul = mul * 10;
            }
        }

        int quo = n/div;
        int rem = n%div;

        int r = rem * mul + quo;

        System.out.println(r);
       }
}
