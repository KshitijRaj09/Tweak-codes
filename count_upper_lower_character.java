/*
The program should print the count of upper case and lower case alphabet characters in that String (print output in separate lines).
Consider below sample input and output:
Input:
DaTa#abC123
Output:
3
4
*/
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
    int countUpper =0, countLower=0;
    char ch[] = str.toCharArray();
    for(int i=0;i<ch.length;i++){
        if(ch[i]>=65 && ch[i]<=90){
            countUpper++;
        }
        if(ch[i]>=97 && ch[i]<=122){
            countLower++;            
        }
    }
    System.out.println(countUpper);
    System.out.println(countLower);
        
    }
}
