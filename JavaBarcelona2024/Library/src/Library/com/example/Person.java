package Library.com.example;

public class Person {
	//fields
	private String firstName;
	private String lastName;
	private String sex;
	private int age;
	
	//constructor
	
	public Person(String fname, String lname, String s, int a) {
		this.firstName = fname;
		this.lastName = lname;
		this.sex = s;
		this.age = a;
		
	}
	
	public Person(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
	}
	
	public Person() {
		
	}
	//methods
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName ) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName= " + firstName + ", lastName= " 
				+ lastName + ", sex= " + sex + ", age= " + age + "]";
	}
	
	
}//closing ng class/object
