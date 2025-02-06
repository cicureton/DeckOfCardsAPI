package csc340.deckofcard;

import csc340.deckofcard.DeckResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeckOfCardsApiController {

    @GetMapping("/draw")
    public DeckResponse drawCards(@RequestParam(defaultValue = "2") int count) {
        RestTemplate restTemplate = new RestTemplate();

        // Create a new deck and get it's the id of a deck
        String newDeckUrl = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";
        DeckResponse newDeck = restTemplate.getForObject(newDeckUrl, DeckResponse.class);

        if (newDeck == null || newDeck.deck_id == null) {
            throw new RuntimeException("Failed to create a new deck.");
        }
        
        //Use the deck id to draw cards
        String drawUrl = "https://deckofcardsapi.com/api/deck/" + newDeck.deck_id + "/draw/?count=" + count;
        return restTemplate.getForObject(drawUrl, DeckResponse.class);
    }
}
