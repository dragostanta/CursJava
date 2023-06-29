package curs14.package2;

import curs14.package1.ProtectedAccesModifier;

public class SubClassProtectedModifier extends ProtectedAccesModifier {

	//* Sub-clasa in alt pachet : yes
	
	public static void main(String[] args) {

		SubClassProtectedModifier obj =  new SubClassProtectedModifier();
		obj.printMesaj();
				
	}

}
