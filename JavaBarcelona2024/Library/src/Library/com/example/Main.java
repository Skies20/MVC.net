package Library.com.example;
import java.util.Scanner;

public class Main {
	//field
//	static int response = 0;//sagot ng user
//	static boolean repeat;//kung uulitin
	static Scanner scanner  = new Scanner(System.in);//lalagyan ng input
	static Library czshsLibrary = new Library();//create a library
	
	public static void main(String[] args) {
		initailizeLibrary();//magagawa yung library at yung mga iba pang object
		System.out.println("Welcome to CZSHS Library!");
		System.out.println("How can I help you?");
//		System.out.println(czshsLibrary.studentList.get(0).getStudentNumber());
//		System.out.println(czshsLibrary.studentList.get(1).getStudentNumber());
//		System.out.println(czshsLibrary.studentList.get(2).getStudentNumber());
//		System.out.println(czshsLibrary.studentList.get(3).getStudentNumber());
//		System.out.println(czshsLibrary.studentList.get(4).getStudentNumber());
//		scanner.nextLine();
		while (true) {
			System.out.println("Main Menu:");
			System.out.println("1. Student Management");
			System.out.println("2. Teacher Management");
			System.out.println("3. Book Management");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline left-over

			switch (choice) {
			case 1:
			studentManagementMenu();
			break;
			case 2:
			teacherManagementMenu();
			break;
			case 3:
			bookManagementMenu();
			break;
			case 4:
			System.out.println("Exiting...");
			return;
			default:
			System.out.println("Invalid choice. Please try again.");
			    }
			  }
			}

		static void studentManagementMenu() {
			while (true) {
			System.out.println("Student Management Menu:");
			System.out.println("1. Add Student");
			System.out.println("2. View Students");
			System.out.println("3. Search Student");
			System.out.println("4. Edit Student");
			System.out.println("5. Back");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline left-over

			switch (choice) {
			case 1:
				System.out.println("Enter Student first name");
				String fname = scanner.nextLine();
				System.out.println("Enter Student last name");
				String lname = scanner.nextLine();
				czshsLibrary.addStudent(new Student(fname, lname));
				System.out.println("Student added successfully!");
			break;
			case 2:
				System.out.println("Here are the List of Students");
				czshsLibrary.listStudent();
			break;
			case 3://search student
				System.out.println("Enter student number:");
				int sn = scanner.nextInt();
				if(czshsLibrary.searchStudent(sn)==-1) {
					System.out.println("Student not found!");
				}else {
					System.out.println(czshsLibrary.studentList.get(czshsLibrary.searchStudent(sn)).toString());
							
				}
			break;
			case 4://edit student
				System.out.println("Enter student name:");
				int sn1 = scanner.nextInt();
			break;
			case 5:
			return;
			default:
			System.out.println("Invalid choice. Please try again.");
			    }
			  }
			}

		static void teacherManagementMenu() {
			while (true) {
			System.out.println("Teacher Management Menu:");
			System.out.println("1. Add Teacher");
			System.out.println("2. View Teachers");
			System.out.println("3. Search Teachers");
			System.out.println("4. Back");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline left-over

			switch (choice) {
			case 1:
				System.out.println("Enter Teacher first name");
				String fname = scanner.nextLine();
				System.out.println("Enter Teacher last name");
				String lname = scanner.nextLine();
				czshsLibrary.addTeacher(new Teacher(fname, lname));
				System.out.println("Teacher added successfully!");
			break;
			case 2:
				System.out.println("Here are the List of Teachers");
				czshsLibrary.listTeacher();
			break;
			case 3:
				System.out.println("Enter employee number:");
				int en = scanner.nextInt();
				if(czshsLibrary.searchTeacher(en)==-1) {
					System.out.println("Teacher not found!");
				}else {
					System.out.println(czshsLibrary.teacherList.get(czshsLibrary.searchTeacher(en)).toString());
							
				}
			break;
			case 4:
			return;
			default:
			System.out.println("Invalid choice. Please try again.");
			    }
			  }
			}

		static void bookManagementMenu() {
			while (true) {
			System.out.println("Book Management Menu:");
			System.out.println("1. Add Book");
			System.out.println("2. View Books");
			System.out.println("3. Search Books");
			System.out.println("4. Back");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline left-over

			switch (choice) {
			case 1:
				System.out.println("Enter Book Title");
				String title = scanner.nextLine();
				System.out.println("Enter Book Author");
				String author = scanner.nextLine();
				czshsLibrary.addBook(new Book(title, author));
				System.out.println("Book added successfully!");
			break;
			case 2:
				System.out.println("Here are the List of Books");
				czshsLibrary.listBook();
			break;
			case 3:
				System.out.println("Enter book name:");
				String libro = scanner.nextLine();
				czshsLibrary.searchBook(libro);
			break;
			case 4:
			return;
			default:
			System.out.println("Invalid choice. Please try again.");
			    }
			  }
			}


			// Example methods for student and book management
			static void addStudent() {
			System.out.print("Enter student name: ");
			String name = scanner.nextLine();
			System.out.println("Student added successfully!");
			}

			static void viewStudents() {
			System.out.println("List of students:");
			// Implement logic to display students
			}

			static void searchStudent() {
			System.out.print("Enter student name: ");
			String name = scanner.nextLine();
			// Implement logic to search student
			}
			

			static void addTeacher() {
			System.out.print("Enter teacher name: ");
			String name = scanner.nextLine();
			System.out.println("Teacher added successfully!");
			}

			static void viewTeachers() {
			System.out.println("List of teacher:");
			// Implement logic to display students
			}

			static void searchTeachers() {
			System.out.print("Enter teacher name: ");
			String name = scanner.nextLine();
			// Implement logic to search student
			}
			
			static void addBook() {
			System.out.print("Enter book title: ");
			String title = scanner.nextLine();
			System.out.println("Book added successfully!");
			}

			static void viewBooks() {
			System.out.println("List of books:");
			// Implement logic to display books
			}

			static void searchBook() {
			System.out.print("Enter book title: ");
			String title = scanner.nextLine();
			// Implement logic to search book
			}
	//public static void main closing

	//methods ng menu

	static void initailizeLibrary(){

		Student s1 = new Student("Leo","Villanueva","Male",19);
		Student s2 = new Student("Joster","Broqueza","Male", 18);
		Student s3 = new Student("Kingley","Mahinay","Male", 17);
		Student s4 = new Student("Loreanne","Bolibol","Female", 16);
		Student s5 = new Student("Jordan","Penioles","Male", 18);
		
		s1.setLRN(136635102943l);
		s2.setLRN(136635102944l);
		s1.setLRN(136635102945l);
		s1.setLRN(136635102946l);
		s1.setLRN(136635102947l);
		
		Book b1 = new Book("Java", "Mr. Seraspe");
		Book b2 = new Book("Practical Research 2","Mrs. Abao");
		Book b3 = new Book("Piling Larang","Ms. Tayo");
		Book b4 = new Book("CPAR","Mr. Peter");
		Book b5 = new Book("PE","Mr. Aquino");
		Book b6 = new Book("Earth and Life Science","Mrs. Barnuevo");
		Book b7 = new Book("Entreprenueship","Mrs. Artuz");
		
		Teacher t1 = new Teacher("Ireneo","Seraspe","Male",21);
		Teacher t2 = new Teacher("Maria Elsa Rose","Abao","Female",22);
		Teacher t3 = new Teacher("Maryvie","Tayo","Male",23);
		Teacher t4 = new Teacher("Peter","Tamundong","Male",24);
		Teacher t5 = new Teacher("Marciano","Aquino","Male",25);
		Teacher t6 = new Teacher("Marylyn","Barnuevo","Female",26);
		Teacher t7 = new Teacher("Shyllajane","Artuz","Female",27);
		
		czshsLibrary.addStudent(s1);
		czshsLibrary.addStudent(s2);
		czshsLibrary.addStudent(s3);
		czshsLibrary.addStudent(s4);
		czshsLibrary.addStudent(s5);
		
		czshsLibrary.addBook(b1);
		czshsLibrary.addBook(b2);
		czshsLibrary.addBook(b3);
		czshsLibrary.addBook(b4);
		czshsLibrary.addBook(b5);
		czshsLibrary.addBook(b6);
		czshsLibrary.addBook(b7);
		
		czshsLibrary.addTeacher(t1);
		czshsLibrary.addTeacher(t2);
		czshsLibrary.addTeacher(t3);
		czshsLibrary.addTeacher(t4);
		czshsLibrary.addTeacher(t5);
		czshsLibrary.addTeacher(t6);
		czshsLibrary.addTeacher(t7);
	}

}//closing ng main
//System.out.println("");