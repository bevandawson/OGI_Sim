/**
 * Created by Bevan on 4/14/2017.
 */
import java.util.*;

public class deck {
    public static void main(String[] args) {

     /*
     resourceCard[] deckOfCards = new ;

             deckOfCards[0] = new resourceCard("runes",1);
      */

     List<Object> deckOfCards = new ArrayList<Object>();
     deckOfCards.add(new resourceCard("runes", 1));
     deckOfCards.add(new resourceCard("Artifacts", 2));

     System.out.println(deckOfCards);




    }
}
