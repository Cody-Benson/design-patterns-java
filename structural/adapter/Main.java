public class Main {
    public static void main(String[] args){
        Greeter englishGreeter = new EnglishSpeaker();
        englishGreeter.sayHello();

        Saludor spanishSpeaker = new SpanishSpeaker();
        spanishSpeaker.diceHola();

        //using adapter to greet in spanish
        GreeterAdapter adapter = new GreeterAdapter();
        adapter.sayHello();
    }
}
