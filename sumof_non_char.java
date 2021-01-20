/*
Create Solution class with main method. 
Read a String value using Scanner. 
The program should print sum of digits in that String. Input String may have non digit characters too, which should be ignored.
Consider below sample input and output:
Input:
DaTa#abC123ww
Output:
6
*/
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int num=0, sum=0;
    char ch[] = str.toCharArray();
    for(int i=0; i<ch.length;i++){
        if(ch[i]>=49 && ch[i]<=57){
            num = Character.getNumericValue(ch[i]);
            sum+=num;
        }
    }
    System.out.println(sum);
  
        
    }
}
