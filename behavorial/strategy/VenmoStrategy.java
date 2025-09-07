public class VenmoStrategy implements PaymentStrategy{
    @Override
    public void makePayment(){
        System.out.println("making payment with Venmo");
    }
}
