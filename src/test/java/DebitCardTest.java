import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;
    @Before
    public void before(){
        debitCard = new DebitCard("12345", "04/28", "076", "12345", "234", 1000.00);
    }
    @Test
    public void canCharge(){
        debitCard.charge(100.00);
        assertEquals(900.00, debitCard.getBalance(), 0.00);
    }
}
