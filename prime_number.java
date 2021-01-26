/*Prime number in range */
import java.util.*;
public class Primenumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int lower = sc.nextInt();
		int upper = sc.nextInt();
		int num=0, count=0;
		int flag=1;
		for(int j=lower; j<=upper; j++) {
			num=j;
			flag =1 ;
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num % i==0) {
					flag=0;
					break;
					
				}
			}
			if(flag==1) {
				System.out.println(num+" is prime");
				count++;
			}
			else
				System.out.println(num+" is not prime");
		}
		System.out.println("Total prime : " + count);
		
	}
	

}
