package curs3;

import java.util.Scanner;

/*
 * Facem un program care citeste de la tastatura un user si o parola si le verifica 
 * daca sunt la fel ca urmatorele :
 * String "TestUser" -> username
 * int 1234 -> parola
 * Daca sunt la fel printeaza : "Login sucessfull"
 * Daca nu sunt la fel printeaza : "Username or password is incorect"
 */

public class LoginExample {
	
	public String username;
	public int password;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the username :");
		username = scan.next();
		System.out.println("Please enter the password :");
		password = scan.nextInt();
		scan.close();
		
	}
	// pentru string intodeauna folosim equals pentru comparare
	// && --> and operator
	// ||-- > or operator
	
	
	public void checkCredentials() {
		
		if(username.equals("TestUser") && password == 1234) {
			
			System.out.println("Login sucessfull!");
			
		}else {
			
			System.out.println("Username or password is incorect");
			
		}
		
	}
	

}
