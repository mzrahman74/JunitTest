import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParallelExecutionTestOne {
    @Test
    @DisplayName("Deposit 400 successfully")
    public void depositOne(BankAccount bankAccount) {
        bankAccount.deposit(400);
        assertEquals(400, bankAccount.getBalance());
    }
    @Test
    @DisplayName("Deposit 500 successfully")
    public void depositTwo(BankAccount bankAccount) {
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }

}
