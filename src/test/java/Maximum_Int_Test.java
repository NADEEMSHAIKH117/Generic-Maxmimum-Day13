import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgeLabz.Maximum_Integer;

public class Maximum_Int_Test {

	@Test
	public void integerMax_AtFirstPosition() {
		int actualResult = Maximum_Integer.findMaximum(9,3,7);
		assertEquals(9,actualResult);
	}
	@Test
	public void integerMax_AtSecondPosition() {
		int actualResult = Maximum_Integer.findMaximum(3,9,7);
		assertEquals(9,actualResult);
	}
	@Test
	public void integerMax_AtThirdPosition() {
		int actualResult = Maximum_Integer.findMaximum(3,7,9);
		assertEquals(9,actualResult);
	}
}
