public class Feed implements AnimalVisitor{
    @Override
    public void visitLion(Lion lion){
        System.out.println("giving the lion some meat!");
    }
    @Override
    public void visitMonkey(Monkey monkey){
        System.out.println("giving the monkey some bananas!");
    }
    @Override
    public void visitPenguin(Penguin penguin){
        System.out.println("giving the Penguin some fish!");
    }
}
