package sathvik;
import java.util.Scanner;
public class PercentageCalculator {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
     int totalmarks = 500;
     System.out.println("enter  marks");
     int m1 = sc.nextInt();

     int m2 = sc.nextInt();
     int cosm = sc.nextInt();
     int english = sc.nextInt();
     int chemistry = sc.nextInt();
     double reslut;
     reslut = (double) (m1+m2+cosm+english+chemistry)/totalmarks;
     reslut=reslut*100;
     System.out.println(reslut);
     if(reslut>90) {
    	 System.out.println("grade o");
     }
     else if(reslut>=70) {
    	 System.out.println("grade a");
     }
     else if(reslut>=60) {
    	 System.out.println("grade b");
     }
     else if(reslut>=50) {
    	 System.out.println("grade c");
     }
     else if(reslut>=30) {
    	 System.out.println("grade d");
     }
     else {
    	 System.out.println("fail");
     }

	}
}

