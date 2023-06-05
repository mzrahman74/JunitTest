import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDITest {
    @Test
    @DisplayName("Deposit 500 successfully")
    public void testDeposit(BankAccount bankAccount) {

        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());

    }
    @Test
    @DisplayName("Deposit 1000 and withdraw 500")
    public void testDepositWithdraw(BankAccount bankAccount) {
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);
        assertEquals(500, bankAccount.getBalance());

    }
}
