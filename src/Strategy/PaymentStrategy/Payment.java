package Strategy.PaymentStrategy;

public class Payment {
    private Double amount;
    private IPaymentStrategy paymentStrategy;

    public Payment(Double amount, IPaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(){
        if(amount > 0){
            paymentStrategy.processPayment(amount);
        } else {
            System.out.println("Invalid Payment");
        }
    }
}
