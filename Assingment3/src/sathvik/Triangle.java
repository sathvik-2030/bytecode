package sathvik;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the side one");
       int side1 = sc.nextInt();
       System.out.println("enter the side two");
       int side2 = sc.nextInt();
       System.out.println("enter the side one");
       int side3 = sc.nextInt();
       if(side1 == side2 && side2 == side3) {
    	   System.out.println("its a equilatar triangle");
    	  
       }
       else if (side1 == side2  ||side2== side3 ||side1==side3) {   
    	   System.out.println("its a isosceles");
       }
       else {
    	   System.out.println("The triangle is scalene.");
       }
	}

}
