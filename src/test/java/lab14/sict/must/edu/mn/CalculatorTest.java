package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(5.0, c.add(2.0, 3.0));
    }

    @Test
    void testAddNegative() {
        Calculator c = new Calculator();
        assertEquals(-5.0, c.add(-2.0, -3.0));
    }
}
