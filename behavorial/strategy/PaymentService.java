public class PaymentService {
    public PaymentStrategy paymentStrategy;
    public PaymentService(){
        paymentStrategy = new CashStrategy();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(){
        this.paymentStrategy.makePayment();
    }
}