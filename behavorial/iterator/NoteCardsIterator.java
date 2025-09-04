public class NoteCardsIterator implements Iterator{
    public int position;
    public NoteCards cards;
    
    public NoteCardsIterator(NoteCards cards){
        this.cards = cards;
        this.position = 0;
    }

    @Override
    public boolean hasNext(){
        return position < cards.getCards().size();
    }

    @Override
    public String next(){
        if(hasNext()){
            return cards.getCards().get(position++);
        }
        return null;
    }
}
