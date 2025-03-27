public static void main(String[] args) {
	// initialization
	String Login = "Irene";
	String Password = "omkii";
	String userLog = null;
	String userPassword = null;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Welcome User! Please enter your Username");
	do {
		System.out.print("Username: ");
		userLog = input.next();
		System.out.print("Password: ");
		userPassword = input.next();
			if(userLog.equals(Login) && userPassword.equals(Password)) {
				System.out.println("Correct Username and Password! =)");
                logInAccess = true
			}else {
				System.out.println("One of the Username or Password is incorrect =(");
			}
	}while(attempt>0 && !logInAccess);
}
}