package sathvik;
import java.util.Scanner;
public class CountTotalNumberNotes {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int amount = sc.nextInt();
	        int note500, note200, note100, note50, note20, note10, note5, note2, note1;
	        note500=note200=note100=note50=note20=note10=note5=note2=note1=0;
	        if(amount>500){
	            note500 = amount/500;
	                amount-=note500*500;
	            }
	            if(amount>500){
	                note500 = amount/500;
	                    amount-=note500*500;
	                }
	                if(amount>500){
	                    note500 = amount/500;
	                        amount-=note500*500;
	                    }
	                    if(amount>=200){
	                        note200 = amount/200;
	                            amount-=note200*200;
	                        }
	                        if(amount>=100){
	                            note100 = amount/100;
	                                amount-=note100*100;
	                            }
	                            if(amount>=50){
	                                note50 = amount/50;
	                                    amount-=note50*50;
	                                }
	                                if(amount>=20){
	                                    note20 = amount/20;
	                                        amount-=note20*20;
	                                    }
	                                    if(amount>=10){
	                                        note10 = amount/10;
	                                            amount-=note10*10;
	                                        }
	                                        if(amount>=5){
	                                            note5 = amount/5;
	                                                amount-=note5*5;
	                                            }
	                                            if(amount>=2){
	                                                note2 = amount/2;
	                                                    amount-=note2*2;
	                                                }
	                                                if(amount>=1){
	                                                    note1 = amount/1;
	                                                        amount-=note1*1;
	                                                    }
	  System.out.println("500 Notes are "+ note500);
	  System.out.println("200 Notes are "+ note200);
	  System.out.println("100 Notes are "+ note100);
	  System.out.println("50 Notes are "+ note50);
	  System.out.println("20 Notes are "+ note20);
	  System.out.println("10 Notes are "+ note10);
	  System.out.println("5Notes are "+ note5);
	  System.out.println("2 Notes are "+ note2);
	  System.out.println("1 Notes are "+ note1);
	    sc.close();
	 }
	}
