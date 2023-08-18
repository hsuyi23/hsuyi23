package Chapter4;

public class LibraryCard {
	private Student owner;
	int borrowCnt;
	
	public Student getOwnerName() {
		return owner;
	}

	public void setOwner(Student owner) {
		this.owner= owner;
	}
	public int getNumberofBooks() {
		return borrowCnt;
	}
	public void checkOut(int borrowCnt) {
		this.borrowCnt= borrowCnt;
	}
	public void display() {
		System.out.println(owner.getName()+" / "+ owner.getEmail()+" / "+ borrowCnt);
		
	}
}
