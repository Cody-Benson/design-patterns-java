public class GreeterAdapter implements Greeter{
    public Saludor saludor = new SpanishSpeaker();

    @Override
    public void sayHello(){
        saludor.diceHola();
    }
}