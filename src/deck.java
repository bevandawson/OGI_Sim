import java.util.*;

public class deck {
    public static void main(String[] args) {

     List<resourceCard> deckOfCards = new ArrayList<>();
     int newId = 1;
     String newType = "";

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    newType = "Runes";
                    break;
                case 1:
                    newType = "Artifact";
                    break;
                case 2:
                    newType = "Offering";
                    break;
                case 3:
                    newType = "Woot";
                    break;
                }
            for (int k = 0; k < 4; k++, newId++) {
                deckOfCards.add(new resourceCard(newType, newId));
            }
        }
     for (resourceCard c: deckOfCards) {
         System.out.println(c.getCardType() + " " + c.getCardID());
     }

    }
}