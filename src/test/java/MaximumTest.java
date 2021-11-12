import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgeLabz.Maximum;

public class MaximumTest {

    @Test
    public void intMax() {
        int actualResult = Maximum.findMaximum(9,10,5);
        assertEquals(10,actualResult);
    }
    @Test
    public void floatMax() {
        float actualResult = Maximum.findMaximum(8f,7f,12f);
        assertEquals(12f,actualResult,0.0);
    }
    @Test
    public void stringMax() {
        String actualResult = Maximum.findMaximum("Apple","Banana","Peach");
        assertEquals("Peach",actualResult);
    }

}
