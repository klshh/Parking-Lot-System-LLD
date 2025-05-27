package Strategy.PaymentStrategy;

public class CreditCardIPayment implements IPaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment of :" + amount + " through credit card");
    }
}
