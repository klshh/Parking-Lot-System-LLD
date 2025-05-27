package Strategy.PaymentStrategy;

public class CashIPayment implements IPaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment of :" + amount);
    }
}
