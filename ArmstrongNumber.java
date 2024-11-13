package day5;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArmstrongNumber	 armnum=new ArmstrongNumber();
	armnum.isArmstrongNumber();
	}
void isArmstrongNumber()
	{
	Scanner s;
	System.out.println("Enter a number:");
	s = new Scanner(System.in);
	int i=s.nextInt();
	System.out.println("The value is: " + i);
	 double len;
	 len=String.valueOf(i).length();
	 /*int loopi;
	 loopi=i;*/
	/* len=0;*/
	 int result;
	// len=i.maxlen();
	 double mainresult = 0;
	 int temp=i;
/*	 while(temp!=0)
	 {
		 temp=temp/10;
		 ++len;
	 }*/
	 System.out.println("The number of digits is " + len);
	 	int i1=i;
	 /*	if(len==1 || len==0)
	 		System.out.println("This number is an Armstrong number "+ i1);*/
	 	 if(len>0)
	 		do
	 		{
	 			result=i1 % 10; 
	 		    mainresult+= (Math.pow(result, len));
	 		    i1=i1/10;
	 		}
	 		while(i1>0);
	 	if(mainresult==i)
	 		System.out.println("The number is an armstrong number "+ i);
	 	else 
	 		System.out.println("This number is not an Armstrong number:" + i);
	}
	

}