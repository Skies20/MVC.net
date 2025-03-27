package Library.com.example;

public class Teacher extends Person{
	int employeeNumber = 0;
	//Constructor
	public Teacher(String fname, String lname, String s, int a) {
		this.setFirstName(fname);
		this.setLastName(lname);
		this.setSex (s);
		this.setAge (a);
	}
	
	public Teacher(String fname, String lname) {
		this.setFirstName(fname);
		this.setLastName(lname);
	}
	public Teacher() {
		}
	
	@Override
	public String toString() {
		return "Teacher [FirstName= " + getFirstName() 
		+ ", LastName= " + getLastName() + ", Sex= "
				+ getSex() + ", Age= " + getAge() + "]";
	}

	public void setEmployeeNumber(int en) {
		this.employeeNumber = en;
	}
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}
}
