package Javapractice;
import java.util.Scanner;
//swap the values of two variables without using a third variable.
public class swaptest {

	public static void main(String[]args) {
		Scanner number= new Scanner(System.in);
		System.out.println("Enter two numbers to test the Swaping test:");
		int a= number.nextInt();
		int b= number.nextInt();
		
		System.out.println("Before Swapping:");
		System.out.println("a= "+ a);
		System.out.println("b= "+ b);
		
			a = a + b; // 10+5=15
	        b = a - b; //10-5= 5
	        a = a - b;// 15-5=10
	        
	    	System.out.println("After Swapping:");
	    	System.out.println("a="+a);
	    	System.out.println("b="+b);
	    	
		
	}
}
