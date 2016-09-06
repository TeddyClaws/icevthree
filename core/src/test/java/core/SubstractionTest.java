package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubstractionTest {

    @Test
    public void testCalculate() throws DivisonByZeroException {
        assertEquals(0, SubstractionMachine.getInstance().calculate(2, 2), 0);
    }

}
