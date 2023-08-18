package Chapter2;
import java.util.Scanner;
public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Mark1,Mark2,Mark3;
		
		System.out.println("Enter your English Mark:");
		Scanner mark=new Scanner(System.in);
		Mark1= mark.nextInt();
		System.out.println("Enter your Chinese Mark:");
		Mark2= mark.nextInt();
		System.out.println("Enter your Mathematics Mark:");
		Mark3= mark.nextInt();
		System.out.println("Total mark is "+ (Mark1+Mark2+Mark3));
	}
	

}
