package Javapractice;
import java.util.Scanner;

// find and print the average of three numbers.
public class findaverage {

	public static void main(String[]args) {
		
		Scanner number= new Scanner(System.in);
		System.out.println("Enter First number:");
		int num1= number.nextInt();
		
		System.out.println("Enter Second number:");
		int num2= number.nextInt();
		
		System.out.println("Enter Third number:");
		int num3= number.nextInt();
		
		int total= num1+num2+ num3;
		double average= total/3;
		
		System.out.println("Average of three numbers:"+ average);

	}
}
