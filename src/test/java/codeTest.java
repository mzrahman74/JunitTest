import org.junit.jupiter.api.Test;

import  static org.junit.jupiter.api.Assertions.*;

public class codeTest {
    @Test
    public void testSayHello() {
        Code code = new Code();
        code.sayHello();
        assertEquals("Hello world!", code.sayHello());
    }
}
