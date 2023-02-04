
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateMethodsTest {
    private CalculatorMethod calculatorMethod;
    @BeforeEach
    public void initTest() {
        calculatorMethod = new CalculatorMethod();
    }
    @Test
    public void testDivide() {
        assertEquals(10, calculatorMethod.divide(100, 10));

    }
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class,() -> calculatorMethod.divide(100, 0) );

    }
}
