package curs14.package1;

class DefualtAccesModifier {

	/*
	 * Default inseamna ca nu specificam niciun access modifier
	 * Scopul lui este limitat la pachetul in care se afla
	 * 
	 * Aceasi clasa : yes
	 * Sub-clasa acealsi pachet : yes
	 * Alta clasa in acelasi pachet : yes
	 * 
	 * Sub-clasa in alt pachet : no
	 * Alta clasa in alt pachet : no
	 * 
	 */
	
	String mesaj = "Default modfifer";
	
	void printMesaj() {
		System.out.println(mesaj);
	}
	
	
	public static void main(String[] args) {

		DefualtAccesModifier obj =  new DefualtAccesModifier();
		obj.printMesaj();
		
		
	}

}
