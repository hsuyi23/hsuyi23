package codewall1;
import java.util.Scanner;

//Write a Java program to check if a given number is even or odd.
public class Evenoroddtest {

	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number");
		int a= input.nextInt();
		if(a%2 == 0) {
			System.out.printf("%d is an even number",a);
			
		}
		else {
			System.out.printf("%d is an odd number",a);
		}
		
	}
}
