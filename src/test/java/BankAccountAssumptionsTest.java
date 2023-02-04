import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
public class BankAccountAssumptionsTest {
    @Test
    @DisplayName("Test activation account after creation")
    public void TestActive() {
        BankAccount bankAccount = new BankAccount(500, 0);
        /*
        assumeTrue will abort and assumeFalse will pass
         */
        assumingThat(bankAccount != null, () -> assertTrue(bankAccount.isActive()));
    }
}
