package csc340.deckofcard;
import java.util.List;

public class DeckResponse {
    public final boolean success;
    public final String deck_id;
    public final List<Card> cards;
    public final int remaining;

    public DeckResponse(boolean success, String deck_id, List<Card> cards, int remaining){
        this.success = success;
        this.deck_id = deck_id;
        this.cards = cards;
        this.remaining = remaining;
    }
}
