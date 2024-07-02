package sathvik;

public class Terinaryoperator {

	public static void main(String[] args) {
	 int a=5,b=8,c=12;
     int val= (a>b)?((a>c)?a:c):((b>c)?b:c);
     System.out.println(val);
	}

}
