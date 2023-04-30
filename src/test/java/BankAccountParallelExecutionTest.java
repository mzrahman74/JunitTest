import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParallelExecutionTest {
    @Test
    @DisplayName("Deposit 500 successfully 1")
    public void testDeposit(BankAccount bankAccount) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());

    }
    @Test
    @DisplayName("Deposit 500 successfully 2")
    public void testDeposit1(BankAccount bankAccount) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());

    }
    @Test
    @DisplayName("Deposit 500 successfully 3 ")
    public void testDeposit2(BankAccount bankAccount) {
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());

    }
    @Test
    @DisplayName("Withdraw 500 dollar")
    public void testWithdraw(BankAccount bankAccount) {
        try {
            bankAccount.deposit(1000);
            bankAccount.withdraw(500);
            assertEquals(500, bankAccount.getBalance());
      System.out.println(bankAccount.getBalance());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
