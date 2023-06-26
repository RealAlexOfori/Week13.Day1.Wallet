public class CreditCard extends PaymentCard implements IChargeable{

    private double availableCredit;
    public CreditCard(String cardNumber, String expiryDate, String securityNumber, double availableCredit){
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }


    public void charge(double purchaseAmount){
        availableCredit -= purchaseAmount + purchaseAmount * 0.1;
    }

}
