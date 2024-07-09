//9.Write a program to input any character and check whether it is alphabet, digit or special character?
package sathvik;

public class Question9 {

	public static void main(String[] args) {
		char c= 'a';
		if(c>='A'&&c<='Z'||c>='a'&& c<='z') {
			System.out.println("its a alphabet");
		}
		else if (c>=0 && c<=99) {
			System.out.println("ist a digits");
		}
	else {
	 System.out.println("its a speacial char");	
	}
	}
}
