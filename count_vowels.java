/*Define main method in Solution class.
The program will read a String value. It will calculate total number of vowels in that string and print the answer.
Sample input:
internal
Output:
3*/
import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str = (sc.nextLine()).toLowerCase();
        char ch[] = str.toCharArray();
        int count=0;
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
