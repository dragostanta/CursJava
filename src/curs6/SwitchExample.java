package curs6;

import java.util.Scanner;

public class SwitchExample {
	/*
	 * Intreb userul un calificativ
	 * In functie de calificativ printez:
	 * A->> Felicitari!
	 * B->> Destul de bine!
	 * C->> Suficient!
	 * D->> Insuficient!
	 * Daca introduce alt califictiv printez nota invalida! 
	 */
	
	public static void main(String[] args) {

	System.out.println("Te rog introdu un calificativ: ");
	Scanner scan = new Scanner(System.in);
	String calificativ = scan.next();	
		
	switch(calificativ.toUpperCase()) {
	
	case "A" :
		System.out.println("Felicitari!");
		break;
	case "B" :
		System.out.println("Destul de bine!");
		break;
	case "C" :
		System.out.println("Suficient!");
		break;
	case "D" :
		System.out.println("Insuficient!");
		break;
	default :
		System.out.println("Nota invalida!");

	}
		
	
		
	}

}
