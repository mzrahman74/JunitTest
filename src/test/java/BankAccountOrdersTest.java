import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountOrdersTest {
    static BankAccount bankAccount = new BankAccount(0, 0);

    @Test
    @Order(4)
    public void testWithdraw() {
        bankAccount.withdraw(5000);
        assertEquals(10000, bankAccount.getBalance());
    }
    @Test
    @Order(1)
    public void testDeposit() {
        bankAccount.deposit(20000);
        assertEquals(20000, bankAccount.getBalance());
    }
    @Test
    @Order(2)
    public void depositTestSecond() {
        bankAccount.deposit(6000);
        assertEquals(26000, bankAccount.getBalance());
    }
    @Test
    @Order(3)
    public void withdrawTestSecond(){
        bankAccount.withdraw(11000);
        assertEquals(15000, bankAccount.getBalance());
    }
}
