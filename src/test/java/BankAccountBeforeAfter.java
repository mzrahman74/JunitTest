import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
/*
@BeforeEach or AfterEach required method not to static but with @TestInstance does not need static for @BeforeAll or @AfterAll
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankAccountBeforeAfter {
    static BankAccount bankAccount;
    @BeforeAll
    public  void prepTest() {
        System.out.println("Test started");
        bankAccount = new BankAccount(500, 0);
    }

    @Test
    public void testWithdraw() {
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }
    @Test

    public void testDeposit() {
        bankAccount.deposit(500);
        assertEquals(700, bankAccount.getBalance());
    }
    @AfterAll
    public void endTest () {
        System.out.println("completed");

    }
}
