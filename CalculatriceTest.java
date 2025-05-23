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
        assertEquals(5.0f, calculator.add(2.0f, 3.0f));
    }

    @Test
    public void testDiv() {
        assertEquals(2.0f, calculator.div(4.0f, 2.0f));
    }

    @Test
    public void testMult() {
        assertEquals(6.0f, calculator.mult(2.0f, 3.0f));
    }

    @Test
    public void testMinus() {
        assertEquals(2.0f, calculator.minus(5.0f, 3.0f)); //doit retourner erruer car mauvais valeur attendu
    }
}
