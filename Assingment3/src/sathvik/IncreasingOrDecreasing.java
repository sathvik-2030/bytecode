package sathvik;
import java.util.Scanner;
public class IncreasingOrDecreasing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num1");
		int num1 = sc.nextInt();
		System.out.println("enter the num2");
		int num2 = sc.nextInt();
		System.out.println("enter the num3");
		int num3 = sc.nextInt();
		if(num1 < num2 && num1 < num3) {
			System.out.println("increasing order");
		}
		else if(num1>num2 && num1>num3) {
			System.out.println("decreasing order");
			
		}
		else {
			System.out.println("invalid");
		}
		

	}

}
