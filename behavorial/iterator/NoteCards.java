import java.util.ArrayList;
import java.util.List;

public class NoteCards implements Collection {
    public List<String> cards = new ArrayList<>();

    public void addCard(String card){
        cards.add(card);
    }

    public Iterator createIterator(){
        return new NoteCardsIterator(this);
    }

    public List<String> getCards(){
        return this.cards;
    }
}