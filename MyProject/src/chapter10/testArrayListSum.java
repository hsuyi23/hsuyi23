package chapter10;
import java.util.*;

public class testArrayListSum {
	
	public static void main(String[]args) {
		ArrayList<Integer> numA= new ArrayList<Integer>();
		Scanner sc= new Scanner(System.in);
		int sum=0; double avg=0;
		for(int i=0; i<10; i++) {
			System.out.println("Enter a number");
			numA.add(sc.nextInt());
			sum+=numA.get(i);
		}
		avg=(double)sum/numA.size();

		System.out.println("avg is: "+avg);
	}
}
