import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

 Main main;
 @BeforeEach
 void setUp() {
     main = new Main();
 }

    @Test
    void toNameFormat() {
     assertEquals("anna", main.toNameFormat("anna"));
    }
}