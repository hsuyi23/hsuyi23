package codewall1;
import java.util.Scanner;
//Write a Java program to determine whether a given year is a leap year or not.
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner year= new Scanner(System.in);
		System.out.println("Enter a year:");
		int Y=year.nextInt();
		
		if(Y%4==0) {
			System.out.printf("%d is a leap year.",Y);
		}
		else {
			System.out.printf("%d is not a leap year.",Y);
		}
	}

}
