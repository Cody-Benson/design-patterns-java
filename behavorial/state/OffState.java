public class OffState extends PhoneState{
    
    public OffState(Phone phone){
        super(phone);
    }

    @Override
    public void pressPowerButton(){
        System.out.println("turning phone on");
        this.phone.setState(new OnState(this.phone));
    }
}