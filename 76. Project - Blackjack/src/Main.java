import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

    System.out.println("Welcome to Salim's blackjack program! Press \"ENTER\" to play!");

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    scanner.nextLine();
    //Making an array of suits to grab using a random number
    String [] suits = {"spades", "hearts", "diamonds", "clubs"};
    // Information about the player's hand
    int playerCard1 = rand.nextInt(10)+2; //In order to get a card between 2-11
    int playerCard2 = rand.nextInt(10)+2;
    int playerTotal = playerCard1 + playerCard2;

    //Selecting different suits for different cards, so they are not the same
    int playerSuit1 = rand.nextInt(3);
    int playerSuit2 = rand.nextInt(3);

    System.out.println("You get " + playerCard1 + " of " + suits[playerSuit1] + " and " + playerCard2 + " of " + suits[playerSuit2] + ".");
    Thread.sleep(1000);
    System.out.println("Your total is " + playerTotal + ".\n");
    // Information about the computer's hand
    int dealerCard1 = rand.nextInt(10) + 2;
    int dealerCard2 = rand.nextInt(10) + 2;
    int dealerTotal = dealerCard1 + dealerCard2;
    int dealerSuit1 = rand.nextInt(3);
    int dealerSuit2 = rand.nextInt(3);
    //Using Thread.sleep to create a sense of excitement instead of reflecting a huge amount of text all at once.
    Thread.sleep(1000);
    System.out.println("The dealer has " + dealerCard1 + " of " + suits[dealerSuit1] + " and a hidden card.");
    Thread.sleep(1000);
    System.out.println("His total is hidden too.\n");

    try{
        //21 is the total number that, by default, ends the game.
        while(playerTotal <= 21) {
            //Asking the player what they want to do
            System.out.println("Would you like to \"hit\" or \"stay\"?");
            String prompt = scanner.nextLine();
            if (prompt.equals("hit") || prompt.equals("HIT")) {
                int newPlayerCard = rand.nextInt(10) + 2;
                int newPlayerSuit = rand.nextInt(3);
                Thread.sleep(1000);
                System.out.println("You drew " + newPlayerCard + " of " + suits[newPlayerSuit] + ".");
                playerTotal = playerTotal + newPlayerCard;
                Thread.sleep(1000);
                System.out.println("Your new total is " + playerTotal + ".\n");

            } else if (prompt.equals("stay") || prompt.equals("STAY")) {
                Thread.sleep(1000);
                System.out.println("It's the dealer's turn.");
                Thread.sleep(1000);
                System.out.println("His hidden card was " + dealerCard2 + " of " + suits[dealerSuit2] + ".");
                Thread.sleep(1000);
                System.out.println("His total was " + dealerTotal + ".\n");
                //Dealer's moves
                //While 16, or below 16, he hits
                while(dealerTotal <= 16){
                    int newDealerCard = rand.nextInt(10) +2;
                    int newDealerSuit = rand.nextInt(3);
                    Thread.sleep(1000);
                    System.out.println("Dealer chooses to hit.");
                    Thread.sleep(1000);
                    System.out.println("He draws " + newDealerCard + " of " + suits[newDealerSuit] + ".");
                    dealerTotal = dealerTotal + newDealerCard;
                    Thread.sleep(1000);
                    System.out.println("His new total is " + dealerTotal + ".\n");
                } //Above 16, the dealer stays
                Thread.sleep(1000);
                System.out.println("Dealer stays.");
                Thread.sleep(1000);
                System.out.println("The dealer's total is " + dealerTotal);
                Thread.sleep(1000);
                System.out.println("Your total is " + playerTotal + ".\n");

                //Announcing the winner
                if(dealerTotal > 21){
                    Thread.sleep(1000);
                    System.out.println("The dealer's hand totals more than 21. He loses.");
                    playerWin();
                } else if (playerTotal > dealerTotal){
                    Thread.sleep(1000);
                    playerWin();
                } else if (playerTotal == dealerTotal) {
                    Thread.sleep(1000);
                    System.out.println("Tie means a win for the dealer!");
                    dealerWin();
                } else {
                    Thread.sleep(1000);
                    dealerWin();
                }
            }
        }
        System.out.println("Your hand totals more than 21. You lose.");
        dealerWin();
    }catch (Exception e){
        System.out.println("There was an error!" + e);
    }
}

    //Two functions to announce the winner within the main class, using some condition statements
    public static void dealerWin(){
        System.out.println("The dealer wins. YOU LOSE!");
        System.exit(0);
    }

    public static void playerWin(){
        System.out.println("YOU WIN!");
        System.exit(0);

    }
}
