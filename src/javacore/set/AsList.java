package javacore.set;

import javax.smartcardio.Card;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsList {
    public static void main(String[] args) {
        Card[] cardDeck = new Card[52];
        List<Card> cardList = Arrays.asList(cardDeck);
        List<String> names = Arrays.asList("Amy","Bob","Carl");
        List<String> settings = Collections.nCopies(100,"DEFAULT");
    }
}
