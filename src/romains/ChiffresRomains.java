package romains;

public class ChiffresRomains {
	
	private static final int[] VALEURS = {
			1000, 900, 500, 400,
			100, 90, 50, 40,
			10, 9, 5, 4,
			1
			};
	
	private static final String[] SYMBOLES = {
			"M", "CM", "D", "CD",
			"C", "XC", "L", "XL",
			"X", "IX", "V", "IV",
			"I"
			};
	
	
	public String toChiffresRomains(int nombre) {
	    if (nombre <= 0 || nombre > 3999) {
	        throw new IllegalArgumentException("Le nombre doit être compris entre 1 et 3999.");
	    }

	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < VALEURS.length; i++) {
	     
	        while (nombre >= VALEURS[i]) {
	            sb.append(SYMBOLES[i]); // On ajoute le symbole correspondant
	            nombre -= VALEURS[i];   // On déduit la valeur de notre nombre
	        }
	    }
	    return sb.toString();
	}
	

}
