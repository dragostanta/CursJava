package curs9;

import java.util.Scanner;

/*
 * Simulam lucrul cu un ATM
 * avem 3 operatiuni :
 * 1. withdraw
 * 2. deposit
 * 3. checkBalance
 * 
 * Intrebam userul ce operatiune vrea sa faca
 * Daca vrea withdraw (balance = balance - amount) si printam soldul 
 * --> daca withdraw este mai mare decat balanta arunc InsuficientFunds
 * daca vrea deposit (balance = balance + amnout)  si printam soldul
 * -> daca amount <=0 throw InvalidAmountExcetion
 * Daca vrea checkBalance (printam soldul)
 * 
 * Programul face parte dintr-un intreg sistem bancar, ceea ce implica multiple conturi
 * (cont curent, cond de economii, cont de credit , etc)
 * Toate conturile au aceasli 3 operatiuni, dar implementari specifice.
 * Noi implementam ATM pe cont curent
 * 
 * Dupa ce utilizatorul efectueaza o operatiunie, il intrebam daca vrea sa continue
 * 
 * 
 * 
 */

public class Atm {
	
	double amount;
	static Scanner  scan  = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		CurrentAccount acc =  new CurrentAccount();
		acc.balance =1000;
		//acc.checkBalance();
		Atm atm = new Atm();
		boolean flag = true;
		
		while(flag) {
			//Scanner  scan  = new Scanner(System.in);
			
			try {
				atm.atmOperations(acc);
				System.out.println("Do you want to continue ?");
				flag = scan.nextBoolean();
				
			} catch (InvalidAmountException | InsuficientFundsException e) {
				e.printStackTrace();
			}
			
		}
		scan.close();
		
	
	}

	public void atmOperations(CurrentAccount obj) throws InvalidAmountException, InsuficientFundsException {
		//Scanner scan  = new Scanner(System.in);
		System.out.println("Hi, Available operations are:");
		System.out.println("1 Deposit");
		System.out.println("2 Withdraw");
		System.out.println("3 Check balance");
		
		int option =  scan.nextInt();
		
		switch(option) {
		
		case 1:
			System.out.println("Please enter the deposit amount:");
			double amount = scan.nextDouble();
			obj.deposit(amount);
			break;
		case 2:
			System.out.println("Please enter the withdraw amount:");
			double amount2 = scan.nextDouble();
			obj.withdraw(amount2);
			break;
		case 3:
			obj.checkBalance();
			break;
		default:
			System.out.println("Invalid option!");
		}
		//scan.close();
		//scan.reset();

	}
	
	
	
	
	
	
	
	
	
	
	
}
