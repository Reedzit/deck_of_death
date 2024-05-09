package cards;

import java.util.HashSet;

public class Deck {

    public HashSet<Card> deck;

    public Deck(){
        reset();
    }

    public void reset(){
        for (Suit suit : Suit.values()){
            for (CardID cardID : CardID.values()){
                deck.add(new Card(suit,cardID));
            }
        }
        deck.add(new Card(Suit.JOKER, null));
        deck.add(new Card(Suit.JOKER, null));
    }

}
