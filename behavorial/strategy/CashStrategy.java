public class CashStrategy implements PaymentStrategy{
    @Override
    public void makePayment(){
        System.out.println("making payment with cash");
    }
}
