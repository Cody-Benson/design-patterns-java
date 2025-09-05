import java.util.ArrayList;

public class Game {
    private State characterState;

    public Game(){
        this.characterState = new State(1,new ArrayList<>(),"0");
    }

    public void levelUp(){
        int currentLevel = this.characterState.getLevel();
        this.characterState.setLevel(currentLevel+1);
    }

    public void addSkill(String skill){
        characterState.addSkill(skill);
    }

    public Memento save(){
        ArrayList<String> skills = new ArrayList<>(characterState.getSkills());
        State newState = new State(characterState.getLevel(), skills, characterState.getTimePlayed());
        return new Memento(newState);
    }

    public void loadSave(Memento memento){
        State savedState = memento.getState();
        this.characterState.level = savedState.getLevel();
        this.characterState.skills = new ArrayList<>(savedState.getSkills());
        this.characterState.timePlayed = savedState.getTimePlayed();
    }

    public void currentState(){
        System.out.println("the current state is");
        System.out.println(characterState.getLevel());
        System.out.println(characterState.getSkills());
        System.out.println(characterState.getTimePlayed());
    }
}
