import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;
    @Before
    public void before(){
        creditCard = new CreditCard("12345", "05/29", "321", 900.00);
    }
    @Test
    public void canCharge(){
        creditCard.charge(100.00);
        assertEquals(790.00, creditCard.getAvailableCredit(), 0.00);
    }
}
