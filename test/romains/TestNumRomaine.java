package romains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestNumRomaine {
	private ChiffresRomains num;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		assertEquals(num.toChiffresRomains(1), "I");
	}

}
