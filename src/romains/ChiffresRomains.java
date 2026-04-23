package romains;

public class ChiffresRomains {
	
	public String toChiffresRomains(int nombre) {
		StringBuilder sb = new StringBuilder();
		while(nombre > 0) {
			sb.append("I");
			nombre--;
		}
	return sb.toString();
	}

}
