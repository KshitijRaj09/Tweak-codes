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
