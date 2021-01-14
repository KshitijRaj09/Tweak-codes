import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine().toLowerCase();
        int count = 0;
        for(int i=0;i<input.length();i++)
        {
            char s=(input.charAt(i));
            
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
                count++;
            }
        }
        System.out.println("Number of Vowels: " +count);
     }
}
