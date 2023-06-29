package curs14.package1;

public class ProtectedAccesModifier {

	/*
	 * Protected 
	 * Scopul lui este in acealsi pachet si sub-clase din pachete diferite
	 * Clasele NU pot fi declarate ca protected
	 * 
	 * Aceasi clasa : yes
	 * Alta clasa in acelasi pachet : yes
	 * Sub-clasa in acelasi pachet : yes
	 * 
	 * Sub-clasa in alt pachet : yes
	 * Alta clasa i alt pachet : no
	 * 
	 * 
	 */
		
	protected String mesaj = "Protected Access";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {

		ProtectedAccesModifier obj =  new ProtectedAccesModifier();
		obj.printMesaj();
	}

}
