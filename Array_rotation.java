/*
Array Rotation*/

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[]=new int[size];
      int temp=0;
      for(int i=0; i<size;i++){
          arr[i] = sc.nextInt();
      }
      
      int n = sc.nextInt();
      for(int j=0;j<n;j++){
          
          temp = arr[size-1];
          for(int i=size-1;i>0;i--){
              arr[i] = arr[i-1]; 
          }
          arr[0] = temp;
      }
    for(int i=0; i<size; i++){
        System.out.print(arr[i]+ " ");
    }
}
} 
