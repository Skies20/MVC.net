package org.totalbeginner.tutorial;

public class Person {

		// fields
		private String name; // pangalan ng person
		private int maximumBooks; // most books na pwedeng icheck ng person
		
		// constructors
		public Person() {
			name = "unknown name";
			maximumBooks = 3;
		}
		
		//methods
		public String getName () {
			return name;
		}
		public void setName(String anyName) {
			name = anyName;
		}
		public int getMaximumBooks () {
			return maximumBooks;
		}
		
		public void setMaximumBooks(int maximumBooks) {
			this.maximumBooks = maximumBooks;
		}
		
	}
