//10.Write a program to check whether a character is uppercase or lowercase alphabet?
package sathvik;

public class Question10 {

	public static void main(String[] args) {
		char c='s';
		if(c>='a'&& c<='z') {
			 System.out.println("its a lower case");
		}
		else if(c>='A'&&c<='Z'){
			System.out.println("its a upper case");
		}
		else {
			System.out.println("its a invalid");
		}
	}

}
