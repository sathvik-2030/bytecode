package sathvik;
import java.util.Scanner;
public class Neon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0,sq=0,n;
		System.out.println("enter the number");
		n=sc.nextInt();
		sq=n*n;
		while(sq!=0) {
       int digit = sq%10;
       sum= digit + sum;
       sq=sq/10;
		}
 if(n==sum) {
	 System.out.println("neon number");
 }
 else {
	 System.out.println("not a neon number");
 }
 sc.close();
	}

}
