/*Define main method in Solution class. 
The program will read a number (without decimal) and print the same in reverse order. 
Sample input:
3454
Output
4543*/

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     int num1=0,rem=0, max=Integer.MIN_VALUE, sum=0;
     while(num!=0){
        rem = num%10;
        num/=10;
        if(max<rem){
            max=rem;
        }
        sum+=rem;
        num1 = (num1*10)+rem; 
     }
     System.out.println(num1);
     System.out.println(sum);
     System.out.println(max);
     
    }
}
