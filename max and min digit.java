/*Create Solution class with main method. 
Read a number (without digits and non negative) using Scanner.
Program should print largest and smallest digit in that number (print output in separate lines).
Consider below sample input and output:
Input:
38729
Output:
9
2
*/

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i=0;
      int max = Integer.MIN_VALUE;
      int min= Integer.MAX_VALUE; 
      int n=0;
      while(num!=0){
          n= num%10;
          if(max<n){
              max=n;
          }
          if(min>n){
              min=n;
          }
          num= num/10;
          i++;
      }
    System.out.println("Max : " +max + " Min : " +min);
}
}
