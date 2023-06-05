public class Game {

    public Card card1;
    public Card[] deck;
    public int count = 0;

    public static void main(String[] args) {
        Game blackjack = new Game();


    }

    public Game() {
        //  card1 = new Card();
//        card1.print();
        deck = new Card[52];
        for (int w = 0; w < 4; w++) {
            for (int e = 0; e < 13; e++) {
                deck[count] = new Card(w, e);
                count++;

            }
        }
//            card1.print();
            shuffle();


    }

    public void shuffle() {
        Card[] shuffledeck = new Card[52];
        for (int f = 0; f < shuffledeck.length; f++) {
            int randomcard = (int) (Math.random() * 52);
                Card shufflecard = deck[randomcard];
                shufflecard.print();
            }
        }

    }



