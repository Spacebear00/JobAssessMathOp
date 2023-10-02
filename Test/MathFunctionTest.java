import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathOperationsTest {

    @Test
    public void testAddition() {
        assertEquals("+", MathOperations.mathFunction(1, 2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals("-", MathOperations.mathFunction(2, 2, 0));
    }

    @Test
    public void testMultiplication() {
        assertEquals("*", MathOperations.mathFunction(3, -3, -9));
    }

    @Test
    public void testDivision() {
        assertEquals("/", MathOperations.mathFunction(3, 3, 1));
    }

    @Test
    public void testNone() {
        assertEquals("None", MathOperations.mathFunction(7, 1, 11));
    }
}
