import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgeLabz.MaximumString;

public class Maximum_String_test {

    @Test
    public void stringMax_AtFirstPosition() {
        String actualResult = MaximumString.findMaximum("Peach","Apple","Banana");
        	assertEquals("Peach",actualResult);
    }

    @Test
    public void stringMax_AtSecondPosition() {
        String actualResult = MaximumString.findMaximum("Apple","Peach","Banana");
        assertEquals("Peach",actualResult);
    }

    @Test
    public void floatMax_AtThirdPosition() {
        String actualResult = MaximumString.findMaximum("Apple","Banana","Peach");
        assertEquals("Peach",actualResult);
    }
}
