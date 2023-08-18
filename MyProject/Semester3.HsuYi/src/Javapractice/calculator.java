package Javapractice;
import java.util.Scanner;

//Write a Java program to calculate and print the sum of two numbers.
public class calculator {

	public static void main(String[]args ) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1= input.nextInt();
		
		System.out.println("Enter second number:");
		int num2= input.nextInt();
		
		System.out.println("Select an operation '+,-,*,/' :");
		int choice= input.nextInt();
		
		double result;
		
		switch (choice) {
		case 1:
			result= num1+num2;
			System.out.println("The answer is "+ result);
			break;
			
		case 2:
			result= num1- num2;
			System.out.println("The answer is "+ result);
			break;
			
		case 3:
			result= num1* num2;System.out.println("The answer is "+ result);
			break;
			
		case 4:
			if (num2 != 0)
			{
			result= num1/ num2;
			System.out.println("The answer is "+ result);
			}
			else {
				System.out.println("Error");
			}
		break;
		}
		
	}
}
