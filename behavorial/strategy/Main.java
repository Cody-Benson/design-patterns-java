public class Main {
    public static void main(String[] args){
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment();

        paymentService.setPaymentStrategy(new VenmoStrategy());
        paymentService.processPayment();
    }
}