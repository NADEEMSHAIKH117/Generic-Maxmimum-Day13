import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgeLabz.Refactor1;

public class Refactor1Test {

    @Test
    public void intMax() {
        int actualResult = Refactor1.findMaximum(9,10,5);
        assertEquals(10,actualResult);
    }
    @Test
    public void floatMax() {
        float actualResult = Refactor1.findMaximum(8f,7f,12f);
        assertEquals(12f,actualResult,0.0);
    }
    @Test
    public void stringMax() {
        String actualResult = Refactor1.findMaximum("Apple","Banana","Peach");
        assertEquals("Peach",actualResult);
    }

}
