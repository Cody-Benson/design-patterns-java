public class OnState extends PhoneState {
    
    public OnState(Phone phone){
        super(phone);
    }

    @Override
    public void pressPowerButton(){
        System.out.println("turning phone off");
        this.phone.setState(new OffState(this.phone));
    }
}