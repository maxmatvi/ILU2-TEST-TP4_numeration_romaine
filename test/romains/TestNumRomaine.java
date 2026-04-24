package romains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestNumRomaine {
	private ChiffresRomains num;

	@BeforeEach
	void setUp() throws Exception {
		num = new ChiffresRomains();
	}

	@Test
	void testUn() { //Iter 1
		assertEquals(num.toChiffresRomains(1), "I");
	}
	
	@Test
	void testDeuxEtTrois() { //Iter 2
		assertEquals(num.toChiffresRomains(2), "II");
		assertEquals(num.toChiffresRomains(3), "III");
	}
	
	@Test
	void testCasLimites() { //Iter 3
		assertThrows(IllegalArgumentException.class, () -> num.toChiffresRomains(0));
		assertThrows(IllegalArgumentException.class, () -> num.toChiffresRomains(-1));
		assertThrows(IllegalArgumentException.class, () -> num.toChiffresRomains(4000));
	}

	@Test
	void testQuatre() { //Iter 4
		assertEquals(num.toChiffresRomains(4), "IV");
	}
	
	@Test
	void testCinqEtAuDela() { //Iter 5
		assertEquals(num.toChiffresRomains(5), "V");
		assertEquals(num.toChiffresRomains(6), "VI");
		assertEquals(num.toChiffresRomains(8), "VIII");
	}
	
	@Test
	void testNeuf() {
		assertEquals(num.toChiffresRomains(9), "IX");
	}
	
	
	
	
}
