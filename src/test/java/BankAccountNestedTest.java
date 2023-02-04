import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Nested Tests - Used to control the relationship between
tests | Useful when: feature separation; code
organized around method or feature
 */
public class BankAccountNestedTest {
    @Test
    @DisplayName("Withdraw 500 successfully")
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());

    }
    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount(400, 0);
        bankAccount.deposit(500);
        assertEquals(900, bankAccount.getBalance());
    }
    @Nested()
    class WhenBalanceEqualsZero {
        @Test
        @DisplayName("Withdraw below minimum balance exception ")
        public void testWithdrawMinimumBalance0() {
            BankAccount bankAccount = new BankAccount(0, 0);
            assertThrows(RuntimeException.class, () -> bankAccount.withdraw(500));

        }
        @Test
        @DisplayName("Withdrawing and getting negative balance ")
        public void testWithdrawMinimumBalanceNegative1000() {
            BankAccount bankAccount = new BankAccount(0, -1000);
            bankAccount.withdraw(500);
            assertEquals(-500, bankAccount.getBalance());

        }
    }

    }
