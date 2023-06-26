import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {
    GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard(50.00);
    }
    @Test
    public void canCharge(){
        giftCard.charge(10.00);
        assertEquals(40.00, giftCard.getBalance(), 0.00);
    }
}
