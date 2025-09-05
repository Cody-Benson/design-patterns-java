import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    public List<Memento> saves = new ArrayList<>();

    public void addSave(Memento save){
        saves.add(save);
    }

    public Memento getMemento(int index){
        return saves.get(index);
    }
}