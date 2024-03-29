import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CalculateMethodsMockitoTest {
    @Mock
    CalculatorMethod calculatorMethod;
//    @BeforeEach
//    public void setupMocks() {
//        Mockito.when(calculatorMethod.divide(12, 6)).thenReturn(2.0);
//    }
    @Test
    public void testDivide() {
        Mockito.when(calculatorMethod.divide(6, 3)).thenReturn(2.0);
        assertEquals(2.0, calculatorMethod.divide(6, 3) );
    }

    @Test
    public void test_01() {
        assertEquals(2.0, calculatorMethod.divide(12, 6));
    }

    @Test
    @DisplayName("Divide 18 by 3 and the result is 6")
    public void test_o2() {
        Mockito.when(calculatorMethod.divide(18, 3)).thenReturn(6.0);
        assertEquals(6.0, calculatorMethod.divide(18, 3));

    }
    @Test
    @DisplayName("Divide 9 by 3 and the result is 3")
    public void test_03() {
        Mockito.when(calculatorMethod.divide(9, 3)).thenReturn(3.0);
        assertEquals(3, calculatorMethod.divide(9, 3));
    }
    @Test
    @DisplayName("Divide 10 by 2 and the result is 5")
    public void test_04() {
        Mockito.when(calculatorMethod.divide(10, 2)).thenReturn(5.0);
        assertEquals(5.0, calculatorMethod.divide(10, 2));
    }
}


