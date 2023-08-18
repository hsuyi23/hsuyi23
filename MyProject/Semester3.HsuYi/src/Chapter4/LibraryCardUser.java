package Chapter4;

public class LibraryCardUser {
	public static void main(String[]args) {
		Student st1= new Student();
		st1.setName("MA MA");
		st1.setEmail("mama@ucsy.edu.mm");
		LibraryCard card1= new LibraryCard();
		LibraryCard card2= new LibraryCard();
		card1.setOwner(st1);
		card1.checkOut(3);
		card2.setOwner(st1);
		card2.checkOut(5);
		card1.display();
		System.out.println(card1.getOwnerName()+"="+ card1.getNumberofBooks());
		System.out.println(card2.getOwnerName()+"="+ card2.getNumberofBooks());


	}

}
 