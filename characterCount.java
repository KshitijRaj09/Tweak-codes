import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int alphabetCount=0,numberCount=0,punctuationCount=0;
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if(c>=65&&c<=90)
              alphabetCount++;
            else if(c>=97&&c<=122)
              alphabetCount++;
            else if(c>=48&&c<=57)
              numberCount++;
            else
              punctuationCount++;
        }
        int asc='a';
        System.out.println("ascii value = "+asc);
        System.out.println("Alphabets = "+alphabetCount);
        System.out.println("Numbers = "+numberCount);
        System.out.println("Punctuation = "+punctuationCount);
     }
}
