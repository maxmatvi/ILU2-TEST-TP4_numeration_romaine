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
	void testDeuxetTrois() { //Iter 2
		assertEquals(num.toChiffresRomains(2), "II");
		assertEquals(num.toChiffresRomains(3), "III");
		
		
	}

}
