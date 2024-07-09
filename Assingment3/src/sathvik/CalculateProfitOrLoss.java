package sathvik;
import java.util.Scanner;
public class CalculateProfitOrLoss {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the cost price");
	double costprice = sc.nextDouble();
	System.out.println("enter the selling price");
	double selling = sc.nextDouble();
	if(selling >  costprice) {
		double profit = selling - costprice;
		System.out.println("profit:"+profit);
	}
	  else if(costprice > selling) {
		  double loss = costprice - selling;
		  System.out.println("loss:"+loss);
	}
	  else {
		  System.out.println("nithere no profit or loss");
	  }
	}

}
