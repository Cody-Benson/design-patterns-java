public class TurnOff implements Command{
    public TV tv;

    public TurnOff(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute(){
        tv.turnOff();
    }
}