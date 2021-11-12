import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgeLabz.Maximu_Floats;

public class Maximum_Float_Test {

	@Test
	public void floatMax_AtFirstPosition() {
		float actualResult = Maximu_Floats.findMaximum(9.657f,3.257f,7.123f);
		assertEquals(9.657f, actualResult,0.0);
		
	}
	@Test
	public void floatMax_AtSecondPosition() {
		float actualResult = Maximu_Floats.findMaximum(3.257f,9.657f,7.123f);
		assertEquals(9.657f, actualResult,0.0);
		
	}
	@Test
	public void floatMax_AtThirdPosition() {
		float actualResult = Maximu_Floats.findMaximum(7.123f,3.257f,9.657f);
		assertEquals(9.657f, actualResult,0.0);
		
	}

}
