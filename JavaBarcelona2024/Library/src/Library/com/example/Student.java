package Library.com.example;

public class Student extends Person{
	long lrn = 0;
	int studentNumber = 0;
	int maximumBook = 3;
	//constructor
	public Student(String fname, String lname, String s, int a) {
		this.setFirstName(fname);
		this.setLastName(lname);
		this.setSex (s);
		this.setAge (a);
	}
	
	public Student(String fname, String lname) {
		this.setFirstName(fname);
		this.setLastName(lname);
	}
	
		@Override
		public String toString() {
			return "Student [FirstName= " + getFirstName() 
			+ ", LastName= " + getLastName() + ", Sex= "
					+ getSex() + ", Age= " + getAge() + "]";
		

		
	}


		public int getmaximumBook() {
			// TODO Auto-generated method stub
			return maximumBook;
		}
		
		public void setLRN(long LRN) {
			this.lrn = LRN;
		}
		
		public long getLRN() {
			return lrn;
		}
		
		public void setStudentNumber(int sn) {
			this.studentNumber = sn;
		}
		
		public int getStudentNumber() {
			return studentNumber;
		}
}
