public class Phone {
    public PhoneState state;

    public Phone(){
        state = new OffState(this);
    }

    public void pressPowerButton(){
        state.pressPowerButton();
    }

    public void setState(PhoneState state){
        this.state = state;
    }
}
