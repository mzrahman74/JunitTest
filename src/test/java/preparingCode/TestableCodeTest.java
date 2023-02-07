package preparingCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import preparingCode.TestableCode;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TestableCodeTest {
    private static TestableCode tc = new TestableCode();
    @Test
    @DisplayName("Test greeting special name")
    public void testSpecialNameGreeting() {
        String name = "Noah";
        String outcome = "I don't know you, Noah. But you are on VIP list!";
        assertEquals(outcome, tc.greetUser(name));
    }
    @Test
    @DisplayName("Test greeting special and know name")
    public void testSpecialAndKnownNameGreeting() {
        String name = "Tess";
        String outcome = "I know you, Tess.you're even on our VIP list!";
        assertEquals(outcome, tc.greetUser(name));

    }
    @Test
    @DisplayName("Test greeting unknown name")
    public void testUnknownNameGreeting() {
        String name = "Sascha";
        String outcome = "stranger";
        assertEquals(outcome, tc.greetUser(name));
    }
    @Test
    @DisplayName("Test part of the day greeting")
    public void testDayPart() {
        LocalDateTime dateTime = LocalDateTime.of(2022, 2, 6, 18,39 );
        String outcome = "Good evening, ";
        assertEquals(outcome, tc.greetDay(dateTime));

    }
}
