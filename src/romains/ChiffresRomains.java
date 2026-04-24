package romains;

public class ChiffresRomains {
	
	public String toChiffresRomains(int nombre) {
		StringBuilder sb = new StringBuilder();
		if(nombre<=0 || nombre>3999) {
			throw new IllegalArgumentException("Le nombre doit être compris entre 1 et 3999.");
		}
		while(nombre > 0) {
			if(nombre == 4) {
				sb.append("IV");
				nombre -= 4;
			} else if (nombre >= 5) {
				sb.append("V");
				nombre -= 5;
			} else {
			sb.append("I");
			nombre--;
			}
		}
	return sb.toString();
	}

}
