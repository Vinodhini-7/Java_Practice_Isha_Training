package day5;

import java.util.Scanner;

public class FindingFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=s.nextInt();
		
		FindingFactorial ffobj=new FindingFactorial();
		long factorial=FindingFactorial.factorialCalculation(number);
	
		System.out.println("The Factorial of the number " + number +" is " + factorial);
		s.close();
	}

	static long factorialCalculation(int number)
	{
		// TODO Auto-generated method stub
		//int factorial;
		long temp=1;
		for(int i=2;i<=number;i++)
		{
			temp =temp*i;
		}
		return temp;
		
	}

}
