package sathvik;
import java.util.Scanner;
public class AnglesOfTrinagle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the 3 values");
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a+b>c &&a+c>b && b+c>a)
		{
			System.out.println("its a triangle");
		}
		else {
			System.out.println("invalid");
		}
		sc.close();

	}

}
