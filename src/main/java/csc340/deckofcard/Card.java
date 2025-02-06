package csc340.deckofcard;

public final class Card {
   public final String code;
   public final String image;
   public final String value;
   public final String suit;

   public Card(String code, String image, String value, String suit){
       this.code = code;
       this.image = image;
       this.value = value;
       this.suit = suit;
   }
}
