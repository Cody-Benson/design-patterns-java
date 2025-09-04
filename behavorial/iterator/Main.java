public class Main{
    public static void main(String[] args){
        System.out.println("in main");
        NoteCards cards = new NoteCards();
        cards.addCard("card1");
        cards.addCard("card2");
        cards.addCard("card3");

        NoteCardsIterator iterator = (NoteCardsIterator)cards.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}