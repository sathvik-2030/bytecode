package sathvik;
import java.util.Scanner;
public class AnglesAreEqual {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the anagle1");
	int angle1 = sc.nextInt();
	System.out.println("enter the anagle2");
	int angle2 = sc.nextInt();
	System.out.println("enter the angale 3");
	int angle3 = sc.nextInt();
	int sum_of_angles=180;
    int sum = (angle1+angle2+angle3);
    System.out.println("sum:"+sum);
    if(sum == sum_of_angles) {
    	System.out.println("the anagles are equal");
    }
    else {
    	System.out.println("not equal");
    }
	}

}
