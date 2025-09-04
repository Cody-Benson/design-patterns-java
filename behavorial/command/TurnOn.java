public class TurnOn implements Command{
    public TV tv;

    public TurnOn(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}