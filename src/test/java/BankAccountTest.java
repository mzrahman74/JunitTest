
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test BankAccount class")
public class BankAccountTest {
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
    @Test
    @DisplayName("Withdraw will become negative")
    public void testWithdrawNotStuckAtZero() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(800);
        assertNotEquals(0, bankAccount.getBalance());
    }
    @Test
    @DisplayName("Test activation account after creation")
    public void testActive() {
        BankAccount bankAccount = new BankAccount(500, 0);
        assertTrue(bankAccount.isActive());
    }
    @Test
    @DisplayName("Test set holder name")
    public void testHolderNameSet() {
        BankAccount bankAccount = new BankAccount(500, 0);
        bankAccount.setHolderName("Yusuf");
        assertNotNull(bankAccount.getHolderName());
    }

    @Test
    @DisplayName("Test that we can't withdraw below minimum")
    public void testWithdrawMinimum() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertThrows(RuntimeException.class, () -> bankAccount.withdraw(2000));

    }
    @Test
    @DisplayName("Test no exception for withdraw and deposit")
    public void testWithdrawAndDepositWithoutException() {
        BankAccount bankAccount = new BankAccount(500, -1000);
       // fail(); // fail() method will fail the test
        assertAll(() -> bankAccount.deposit(200),() -> bankAccount.withdraw(450) );
    }
    @Test
    @DisplayName("Test speed deposit")
    public void testDepositTimeOut() {
        BankAccount bankAccount = new BankAccount(400, 0);
        assertTimeout(Duration.ofNanos(10), () -> bankAccount.deposit(200));
//        assertEquals(0.33, 1/3, "Oops not the same");

    }
}
