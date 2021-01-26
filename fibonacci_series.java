/*Fibonacci series all types*/

package test;

import java.util.*;
public class Solution {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		int first = 0;
		int second = 1;
		int third =0;
		System.out.print(first+" "+second+" ");
//		for(int i=3; i<=input;i++) {
//			third = first + second;
//			first = second;
//			second = third;
//			System.out.print(third+ " ");
//		}
//		System.out.print("\n"+ third);
		
		for(int i=3; third<input;i++) {
			third = first + second;
			first = second;
			second = third;
			System.out.print(third+ " ");
			if((first+second) > input) {
				break;
			}
		}
		//System.out.print("\n"+ third);
	}

}
