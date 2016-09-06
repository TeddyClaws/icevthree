package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubastractionTest {

    @Test
    public void testCalculate() {
        assertEquals(2, SubstractionMachine.getInstance().calculate(13, 11), 0);
        assertEquals(24, SubstractionMachine.getInstance().calculate(13, -11), 0);
        assertEquals(-24, SubstractionMachine.getInstance().calculate(-13, 11), 0);
        assertEquals(-2, SubstractionMachine.getInstance().calculate(-13, -11), 0);
    }

}
