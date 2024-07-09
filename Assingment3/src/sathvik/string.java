package sathvik;
import java.util.Scanner;
public class string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the martial status");
		String martial_status= sc.nextLine().toLowerCase();
        System.out.println("gender");
        String Gender = sc.nextLine().toLowerCase();
        System.out.println("age");
        int age = sc.nextInt();
        boolean is_insured = false;
        if (martial_status.equals("married")) {
          is_insured =true;
        }
        else if(martial_status.equals("single")){
          if (Gender=="male"&&age>30 ) {
            is_insured =true;
          }
          else if (Gender.equals("female")&& age>25) {
            is_insured =true;
          }
        }
        if (is_insured) {
          System.out.println("insured");
        }
        else{
          System.out.println("Not insured");
        }

        
        sc.close();
	}
	
}
