public class Main{
    public static void main(String[] args){
        Game game = new Game();
        CareTaker saveManager = new CareTaker();

        game.levelUp();
        game.addSkill("fireball");
        saveManager.addSave(game.save());
        game.currentState();

        game.levelUp();
        game.addSkill("ice spike");
        game.addSkill("earth wall");
        saveManager.addSave(game.save());
        game.currentState();


        game.loadSave(saveManager.getMemento(0));
        game.currentState();

        game.loadSave(saveManager.getMemento(1));
        game.currentState();
    }
}