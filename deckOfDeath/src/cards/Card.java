package cards;

public class Card {
    public Suit suit;
    public CardID cardID;


    public Card(Suit suit, CardID cardID){
        setCardID(cardID);
        setSuit(suit);
    }
    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardID getCardID() {
        return cardID;
    }

    public void setCardID(CardID cardID) {
        this.cardID = cardID;
    }
}
