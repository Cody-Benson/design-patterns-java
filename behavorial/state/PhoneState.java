public abstract class PhoneState {
    public Phone phone;

    public PhoneState(Phone phone){
        this.phone = phone;
    }
    public abstract void pressPowerButton();
}