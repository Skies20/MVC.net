package Library.com.example;

public class Book {
	//field
	String Title;
	String Author;
	Student borrowerS;
	Teacher borrowerT;
	
	
	//constructor
	public Book() {
		
	}
	public Book(String title,String author) {
		this.Title = title;
		this.Author = author;
	}
	
	//method 
	public void setTitle(String title) {
		this.Title = title;
	}
	
	public String getTitle() {
		return Title;
	}
	
	public void setAuthor(String author) {
		this.Title = author;
	}
	
	public String Author() {
		return Author;
	}
 	public Student getBorrowerS() {
		return borrowerS;
	}

	public void setBorrowerS(Student setBorrowerS) {
		this.borrowerS = borrowerS;
	}

	public Teacher getBorrowerT() {
		return borrowerT;
	}
	public void setBorrowerT(Teacher setBorrowerT) {
		this.borrowerT = borrowerT;
	}
	@Override
	public String toString() {
		return "Book [Title=" + Title + ", Author=" + Author + "]";
	}
	
	public void setStudentNumber(int sn) {
		this.studentNumber = sn;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
}//closing ng class
