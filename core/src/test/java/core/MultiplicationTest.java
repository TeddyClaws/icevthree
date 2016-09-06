package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplicationTest {

    @Test
    public void testCalculate() {
        assertEquals(4, MultiplicationMachine.getInstance().calculate(2, 2), 0);
    }

}
