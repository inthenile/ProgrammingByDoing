import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

    System.out.println("Welcome to Salim's blackjack program! Press \"ENTER\" to play!");

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    scanner.nextLine();
    // Information about the player's hand
    int playerCard1 = rand.nextInt(10)+2; //In order to get a card between 2-11
    int playerCard2 = rand.nextInt(10)+2;
    int playerTotal = playerCard1 + playerCard2;
    System.out.println("You get a " + playerCard1 + " and a " + playerCard2 + ".");
    Thread.sleep(1000);
    System.out.println("Your total is " + playerTotal + "\n");
    // Information about the computer's hand
    int dealerCard1 = rand.nextInt(10) + 2;
    int dealerCard2 = rand.nextInt(10) + 2;
    int dealerTotal = dealerCard1 + dealerCard2;
    //Using Thread.sleep to create a sense of excitement instead of reflecting a huge amount of text all at once.
    Thread.sleep(1000);
    System.out.println("The dealer has a " + dealerCard1 + " and a hidden card.");
    Thread.sleep(1000);
    System.out.println("His total is hidden too.\n");

    try{
        //21 is the total number that, by default, ends the game.
        while(playerTotal < 21) {
            //Asking the player what they want to do
            System.out.println("Would you like to \"hit\" or \"stay\"?");
            String prompt = scanner.nextLine();
            if (prompt.equals("hit") || prompt.equals("HIT")) {
                int newPlayerCard = rand.nextInt(10) + 2;
                Thread.sleep(1000);
                System.out.println("You drew a " + newPlayerCard + ".");
                playerTotal = playerTotal + newPlayerCard;
                Thread.sleep(1000);
                System.out.println("Your new total is " + playerTotal + ".\n");

            } else if (prompt.equals("stay") || prompt.equals("STAY")) {
                Thread.sleep(1000);
                System.out.println("It's the dealer's turn.");
                Thread.sleep(1000);
                System.out.println("His hidden card was a " + dealerCard2 + ".");
                Thread.sleep(1000);
                System.out.println("His total was " + dealerTotal + ".");
                //Dealer's moves
                //While below 16, he hits
                while(dealerTotal <= 16){
                    int newDealerCard = rand.nextInt(10) +2;
                    Thread.sleep(1000);
                    System.out.println("Dealer chooses to hit");
                    Thread.sleep(1000);
                    System.out.println("He draws a " + newDealerCard + ".");
                    dealerTotal = dealerTotal + newDealerCard;
                    Thread.sleep(1000);
                    System.out.println("His new total is " + dealerTotal + ".\n");
                } //Above 16, the dealer stays
                Thread.sleep(1000);
                System.out.println("Dealer stays.");
                Thread.sleep(1000);
                System.out.println("The dealer's total is " + dealerTotal);
                Thread.sleep(1000);
                System.out.println("Your total is " + playerTotal);

                //Announcing the winner
                if (playerTotal > dealerTotal){
                    playerWin();
                } else if (playerTotal == dealerTotal) {
                    System.out.println("Tie means a win for the dealer!");
                    dealerWin();
                } else {
                    dealerWin();
                }
            }
        }
        System.out.println("Your hand totals more than 21.");
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
