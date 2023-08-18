package chapter10;
import java.util.*;
public class nameArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> nameA=new ArrayList<String>();
		Scanner sc= new Scanner(System.in);
		String name; int i;
		nameA.add("Ma Ma");
		nameA.add("Mg Mg");
		while(true) {
			System.out.println("Enter name:");
			name= sc.nextLine();
			if(name.equals("Stop"))break;
			else {
				for(i=0;i<nameA.size();i++)
				{
					if(nameA.get(i).equals(name)){
						System.out.println("Duplicate!"); break;
					}
					if(i==nameA.size())nameA.add(name);
				}
				
			}
			for(String f:nameA)
				System.out.println(f);
			
		}
		
	}

}
