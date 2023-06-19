package curs11;

import java.util.Arrays;

public class VarargsExample {

	public static void main(String[] args) {

		printCeva("unu", "doi");
		printCeva("unu", "doi", "trei", "patru");
		
		String[] array = {"text", "text1"};
		System.out.println(array);
		System.out.println(Arrays.toString(array));
		

	}

	//executeScript(" script JS", element)
	//executeScript(" script JS", element, element2)
	//executeScript(" script JS", element, element2, element3)
	
	public static void printCeva(String...text) {
		
		//System.out.println(text);
		
		for(String element : text) {
			System.out.println(element);
		}
	}
	
	
	public static void printAltceva(int numar, boolean flag, String...values) {
		
		for(String element : values) {
			System.out.println(element);
		}
	}
	

}
