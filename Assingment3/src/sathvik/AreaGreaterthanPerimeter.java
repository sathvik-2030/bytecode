package sathvik;
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;
public class AreaGreaterthanPerimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lenght");
		int lenght = sc.nextInt();
		System.out.println("enter the breadth");
		int breadth = sc.nextInt();
		int area,perimeter;
		area = lenght*breadth;
		perimeter = 2*(lenght+breadth);
		System.out.println("area:"+area);
		System.out.println("perimeter:"+perimeter);

        if(area<perimeter) {
        	System.out.println("perimtere is bigger");
        }
        else {
         System.out.println("area is bigger");
        }
	}

}
