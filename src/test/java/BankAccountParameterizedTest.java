import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParameterizedTest {
    @ParameterizedTest
    @ValueSource(ints = {100, 400, 800, 1000})
    @DisplayName("Deposit 500 successfully")
    public void testDeposit(int amount, BankAccount bankAccount) {
        bankAccount.deposit(amount);
        assertEquals(amount, bankAccount.getBalance());

    }
    @ParameterizedTest
    @ValueSource(ints = {5000, 4000, 8000, 10000})
    public void testDepositTest_01(int amount, BankAccount bankAccount) {
        bankAccount.deposit(amount);
        assertEquals(amount, bankAccount.getBalance() );
    }
    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = {"TUESDAY", "THURSDAY"})
    public void testDayWeek(DayOfWeek day) {
        assertTrue(day.toString().startsWith("T"));
}

@ParameterizedTest
//@CsvSource({"100, Mary", "200, Richard", "150, Rashid"})
@CsvFileSource(resources = "details.csv")
    public void depositAndNameTest(double amount, String name, BankAccount bankAccount) {
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        assertEquals(amount, bankAccount.getBalance());
        assertEquals(name, bankAccount.getHolderName());

    }
    @ParameterizedTest
    @CsvFileSource(resources = "deposit.csv")
    public void depositAndNameTest_01(double amount, String name, BankAccount bankAccount) {
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        assertEquals(amount, bankAccount.getBalance());
        assertEquals(name, bankAccount.getHolderName());


    }
    @ParameterizedTest
    @CsvFileSource(resources = "2ndDeposit.csv")
    public void depositAndNameTest_02(double amount, String name, BankAccount bankAccount){
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        assertEquals(amount, bankAccount.getBalance());
        assertEquals(name,bankAccount.getHolderName());

    }
    @ParameterizedTest
    @CsvFileSource(resources = "3rdDeposit.csv")
    public void depositAndNameTest_03(double amount, String name, BankAccount bankAccount ) {
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        assertEquals(amount, bankAccount.getBalance() );
        assertEquals(name, bankAccount.getHolderName());

    }
    @ParameterizedTest
    @CsvFileSource(resources = "yusuf.csv")
    public void depositAndNameTest_04(double amount, String name, BankAccount bankAccount) {
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        assertEquals(amount, bankAccount.getBalance());
        assertEquals(name, bankAccount.getHolderName());

    }

}
