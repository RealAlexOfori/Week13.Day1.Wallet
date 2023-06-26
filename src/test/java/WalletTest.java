import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WalletTest {
    Wallet wallet;
    GiftCard giftCard;
    CreditCard creditCard;
    DebitCard debitCard;

    private ArrayList<IChargeable> iChargeables;

    @Before
    public void before(){
        giftCard = new GiftCard(200.00);
        creditCard = new CreditCard("123", "09/56", "123", 300.00);
        debitCard = new DebitCard("12345", "09/23", "123", "56789", "1233", 900.00);
        iChargeables = new ArrayList<>();
        iChargeables.add(giftCard);
        iChargeables.add(creditCard);
        iChargeables.add(debitCard);
        wallet = new Wallet(iChargeables, creditCard);
    }

    @Test
    public void canSelect(){
        wallet.setSelectedIChargeable(debitCard);
        assertEquals(debitCard, wallet.getSelectedIChargeable());
    }
}
