public class Main{
    public static void main(String[] args){
        TV tv = new TV();
        TurnOff offCommand = new TurnOff(tv);
        TurnOn onCommand = new TurnOn(tv);

        Remote remote = new Remote();
        remote.submitCommand(onCommand);
        remote.submitCommand(offCommand);
    }
}