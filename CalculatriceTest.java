import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    private Calculatrice calculator;

    @BeforeEach
    public void start() {
        calculator = new Calculatrice();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        //assertEquals(85644, calculator.add(2, 3), "marche pas message d'erreur explicit");
    }


    @Test
    public void testDiv() {
        assertEquals(2, calculator.div(4, 2));
    }


    @Test
    public void testDivZero() {
        assertThrows(ArithmeticException.class, () -> calculator.div(444564564.12f, 0));
    }

    @Test
    public void testMult() {
        assertEquals(6, calculator.mult(2, 3));
    }

    @Test
    public void testMinus() {
        assertEquals(2, calculator.minus(5, 3));
        assertNotEquals(7892, calculator.minus(5, 3));
    }
}
