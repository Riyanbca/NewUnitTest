import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyDivideTest {

	@Test
	void testMultiply() {
		MultiplyDivide a = new MultiplyDivide();
		double expected = 15;
		double actual = a.multiply(3, 5);
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		MultiplyDivide a = new MultiplyDivide();
		double expected = 2;
		double actual = a.divide(10, 5);
		assertEquals(expected, actual);
	}

}
