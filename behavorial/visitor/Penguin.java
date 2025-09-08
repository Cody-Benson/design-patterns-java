public class Penguin implements Animal{
    @Override
    public void accept(AnimalVisitor animalVisitor){
        animalVisitor.visitPenguin(this);
    }
}
