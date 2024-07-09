package sathvik;
import java.util.Scanner;
public class SalaryBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the joining year");
		int joiningyear = sc.nextInt();
		System.out.println("enter the current year");
		int currentyear = sc.nextInt();
		System.out.println("enter the salary");
		int salary = sc.nextInt();
		if(currentyear - joiningyear >= 3)
		{
			salary*=0.8;
			System.out.println(salary);
		}
		else if(currentyear - joiningyear >=10) {
			salary*=0.20;
		}
		else {
			System.out.println("no bonus");
		}
sc.close();
	}

}
