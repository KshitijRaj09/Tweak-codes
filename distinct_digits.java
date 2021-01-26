/*Check number contains distinct digits*/

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc  = new Scanner(System.in);
      int num = sc.nextInt();
      Boolean check[] = new Boolean[10];
      int rem=0, flag=1;
      for(int i=0 ; i<check.length; i++){
          check[i] = false;
      }
      
      while(num!=0){
          rem = num%10;
          if(check[rem]){
              flag=0;
              break;
          }
         else
            check[rem]=true;
        num/=10;
      }
      if(flag==1){
          System.out.println("Okay ");
      }
      else
        System.out.println("Not Okay");
    }
}
