import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountExecutionTest {
    static BankAccount bankAccount = new BankAccount(0, 0);
    @Test
    @Order(2)
    public void testWithdraw() {
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }
    @Test
    @Order(1)
    public void testDeposit() {
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }
    @Test
    @Order(3)
    @DisplayName("Deposit 1000 dollar")
    public void testDepositSecond() {
        bankAccount.deposit(1000);
        assertEquals(1200, bankAccount.getBalance());
    }
}
