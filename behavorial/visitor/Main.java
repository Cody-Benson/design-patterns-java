public class Main{
    public static void main(String[] args){
        AnimalVisitor feeder = new Feed();
        Lion lion = new Lion();
        Penguin penguin = new Penguin();
        Monkey monkey = new Monkey();

        lion.accept(feeder);
        penguin.accept(feeder);
        monkey.accept(feeder);
    }
}