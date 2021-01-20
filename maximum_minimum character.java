/*Create Solution class with main method.
Read a String value using Scanner.
The program should print largest and smallest character (as per ASCII sqeuence) together. 
Consider below sample input and output (Output refers 'o' as largest and 'P' as smallest as we are following ASCII sequence):
Input:
Phone
Output:
oP*/

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      char max = 'A';
      char min = 'z';
      char ch[] = str.toCharArray();
      for(int i=0; i<ch.length;i++){
          if(max<ch[i]){
              max=ch[i];
          }
          if(min>ch[i]){
              min=ch[i];
          }
      }
      System.out.println(max+""+min);
    }
}
