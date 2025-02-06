package csc340.deckofcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeckOfCardsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeckOfCardsApiApplication.class, args);
	}

}
