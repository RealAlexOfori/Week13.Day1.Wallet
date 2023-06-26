public class DebitCard extends PaymentCard implements IChargeable{
    private String accountNumber;
    private String sortCode;
    private double balance;

    public DebitCard(String cardNumber, String expiryDate, String securityNumber, String accountNumber, String sortCode, double balance){
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void charge(double purchaseAmount){
        balance -= purchaseAmount;
    }
}
