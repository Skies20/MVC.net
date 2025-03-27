package Library.com.example;

import java.util.ArrayList;

public class Library {
	//field
	ArrayList<Student> studentList;
	ArrayList<Teacher> teacherList;
	ArrayList<Book> bookList;
	//constructor
	public Library () {
		studentList = new ArrayList<Student>();
		bookList = new ArrayList<Book>();
		teacherList = new ArrayList<Teacher>();
	}
	//method
	public void addStudent(Student s) {
		s.setStudentNumber(1000 + studentList.size() +1 );
		studentList.add(s);
	}
	public void listStudent() {
		for(int i = 0;i<studentList.size();i++) {
			String ln = studentList.get(i).getLastName();
			String fn = studentList.get(i).getFirstName();
			System.out.println((i + 1)+". " + fn + " " + ln);
		}
	}
	public void listBook() {
		for(int i = 0;i<bookList.size();i++) {
			String Tt = bookList.get(i).getTitle();
			String Ar = bookList.get(i).Author();
			System.out.println((i + 1)+". " + Tt + " by " + Ar);
		}		
	}
	public void addTeacher(Teacher t) {
		t.setEmployeeNumber(100 + teacherList.size() +1 );
		teacherList.add(t);
	}
	public void listTeacher() {
		for(int i = 0;i<teacherList.size();i++) {
			String t = teacherList.get(i).getFirstName();
			String a = teacherList.get(i).getLastName();
			System.out.println((i + 1)+". " + t + " " + a);
		}		
	}
	public void addBook(Book b) {
		bookList.add(b);
	}
	public boolean checkOutBookS(Student s, Book b) {
		int numBook = this.getBookForStudent(s).size();
		if(b.getBorrowerS()==null && 
			numBook<s.getmaximumBook()) {
			b.setBorrowerS(s);
			System.out.println(s.getLastName() +
					" borrowed the book " +
					b.getTitle());
			return true;
		}else {
			System.out.println(s.getLastName() +
					" already reached the maximum number " +
					" of books that can be borrowed.");
			return false;
		}
	}
	
	public boolean checkInBookS(Book b) {
		if(b.getBorrowerS() !=null) {
			b.setBorrowerS(null);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkOutBookT(Teacher t, Book b) {
		if(b.getBorrowerT()==null) {
			b.setBorrowerT(t);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkoutBookS(Student s ,Book b) {
		int numBook = this.getBookForStudent(s).size();
		if(b.getBorrowerS() !=null) {
				System.out.println(b.getTitle() + 
						" already reached the maximum number " +
						"of books that can be borrowed.");
			return true;
		}else {
			b.setBorrowerS(s);
			System.out.println(s.getLastName() +
					" borrowed the book " +
					b.getTitle());
			return false;
		}
	}
	
	public ArrayList<Book> getBookForStudent(Student s){
		ArrayList<Book> borrowedBook = new ArrayList<Book>();
		for(Book aBook : this.bookList) {
			if((aBook.getBorrowerS()!=null) && 
			  aBook.getBorrowerS().getLastName()==s.getLastName()) {
			  borrowedBook.add(aBook);
			}
		}
		return borrowedBook;
	}
	
	
	public int searchStudent(int sn) {
		int index = -1;
			for(int i = 0;i<studentList.size();i++) {
				if(sn==studentList.get(i).getStudentNumber()) {
					index = i;
					break;
				}
			}
		return index;
	}
	
	
	public int searchTeacher(int en) {
		int index = -1;
			for(int i = 0;i<teacherList.size();i++) {
				if(en==teacherList.get(i).getEmployeeNumber()) {
					index = i;
					break;
				}
			}
		return index;
	}
	public void searchTeacher(String lname) {
		boolean found = false;
		for(Teacher t : this.teacherList) {
			if(lname.equals(t.getLastName())) {
                System.out.println("Teacher found:");
                System.out.println(t.toString());
                found = true;
                break;
			}
		}
		if(!found) {
			System.out.println("System can't find " + lname);
		}
	}
	
	public void searchBook(String Title) {
		boolean found = false;
		for(Book b : this.bookList) {
			if(Title.equals(b.getTitle())) {
                System.out.println("Title found:");
                System.out.println(b.toString());
                found = true;
                break;
			}
		}
		if(!found) {
			System.out.println("System can't find " + Title);
		}
	}
	public ArrayList<Book> kuhaBookForStudent(){
		ArrayList<Book> availBook = new ArrayList<Book>();
		for(Book aBook : this.bookList) {
			if(aBook.getBorrowerS()==null)
			{availBook.add(aBook);			
					}
			}
		return availBook;
	}
	
	public ArrayList<Book> kinuhaBookForStudent(){
		ArrayList<Book> unavailBook = new ArrayList<Book>();
		for(Book aBook : this.bookList) {
			if(aBook.getBorrowerS()!=null)
			{unavailBook.add(aBook);			
					}
			}
		return unavailBook;
	}
}//closing ng main
