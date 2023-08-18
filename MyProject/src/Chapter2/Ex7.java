package Chapter2;
import java.util.Scanner;
//convert centi to feet and inches , 1 in= 2.54 cm
public class Ex7 {

	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter length in centimeters:");
		double centi= input.nextDouble();
		double inches= centi/2.54;
		
		double feet= inches/12;
		inches= inches%12;
		
		System.out.println("The length in feet and inches: " +feet+ " / " +inches );
	}
}
