package Chapter2;
import java.util.Scanner;

public class inputoutputtest {

	public static void main(String[]args) {
		
		String name;
		Scanner kbip= new Scanner(System.in);
		System.out.println("Enter your name: ");
		name= kbip.nextLine();
		int age;
		System.out.println("Enter your age: ");
		age= kbip.nextInt()	;
		//System.out.println("Your name is:"+name);
		//System.out.println("Your age is:"+age);
		if (age>=20)
		{
			System.out.printf("%s,%d is old.",name,age);
		}
		else {
			System.out.printf("%s,%d is still young.",name,age);
		}
		
	}
}
