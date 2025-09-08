public class Monkey implements Animal{
    @Override
    public void accept(AnimalVisitor animalVisitor){
        animalVisitor.visitMonkey(this);
    }
}
