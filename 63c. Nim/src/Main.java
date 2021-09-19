import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        //Get user input
        System.out.print("Player 1, enter your name:\t");
        String player1 = scanner.nextLine();
        System.out.print("Player 2, enter your name:\t");
        String player2 = scanner.nextLine();

        //Variables to make the players take turns
        String playerName = null;
        int moveCount = 0;

        //Creating heaps of random numbers between 3-5
        int aStack = rand.nextInt(3)+3;
        int bStack = rand.nextInt(3)+3;
        int cStack = rand.nextInt(3)+3;

        //this while loop is to make the game run until there is nothing in the stacks
        while(aStack > 0 || bStack > 0 || cStack > 0) {
            //Making a move counter to check which player's turn it is to play
            if (moveCount % 2 == 0) {
                playerName = player1;
            } else {
                playerName = player2;
            }
            //VISUALISATION
            System.out.print("\nA: ");
            for (int a = 0; a < aStack; a++) {
                System.out.print(" * ");
            }
            System.out.print("\nB: ");
            for (int b = 0; b < bStack; b++) {
                System.out.print(" * ");
            }
            System.out.print("\nC: ");
            for (int c = 0; c < cStack; c++) {
                System.out.print(" * ");
            }
            //Asking the player to choose a stack
            System.out.print("\n" + playerName + ", choose a pile: ");
            String choice = scanner.nextLine();

            //A HEAP
            if (choice.equals("A") || choice.equals("a") && aStack > 0) {
                System.out.print("How many to remove from the pile: ");
                try {
                    int remove = scanner.nextInt();
                    scanner.nextLine(); //to clear the scanner inputs
                    //Making sure the player can not go below 0
                    if (remove <= aStack && remove > 0) {
                        aStack = aStack - remove;
                        moveCount++;
                    } else if (remove <= 0) {
                        System.out.println("You cannot take THAT out of a pile. The number must be at least 1!");
                    } else {
                        System.out.println("The pile is smaller than that! The biggest number you can take is " + aStack);
                    } //Prevent the user from picking up from a pile that has nothing remaining in it
                } catch (Exception e) {
                    System.out.println("There was an error. Please type a number to take out of A.");
                    scanner.nextLine(); //clear the previous input so as not to have multiple occurrences after an error
                }
            } else if (choice.equals("A") || choice.equals("a") && aStack == 0) {
                System.out.println("You cannot pick anymore out of this pile, " + playerName + ", choose another!");
            }

            //B HEAP
            if (choice.equals("B") || choice.equals("b") && bStack > 0) {
                System.out.println("How many to remove from the pile?");
                try {
                    int remove = scanner.nextInt();
                    scanner.nextLine();
                    //Making sure the player can not go below 0
                    if (remove <= bStack && remove > 0) {
                        bStack = bStack - remove;
                        moveCount++;
                    } else if (remove <= 0) {
                        System.out.println("You cannot take THAT out of a pile. The number must be at least 1!");
                    } else {
                        System.out.println("The pile is smaller than that! The biggest number you can take is " + bStack);
                    } //Prevent the user from picking up from a pile that has nothing remaining in it
                } catch (Exception e) {
                    System.out.println("There was an error. Please type a number to take out of B.");
                    scanner.nextLine();
                }
            } else if (choice.equals("B") || choice.equals("b") && bStack == 0) {
                System.out.println("You cannot pick anymore out of this pile, " + playerName + ", choose another!");
            }

            //C HEAP
            if (choice.equals("C") || choice.equals("c") && cStack > 0) {
                System.out.println("How many to remove from the pile?");
                try {
                    int remove = scanner.nextInt();
                    scanner.nextLine();
                    //Making sure the player can not go below 0
                    if (remove <= cStack && remove > 0) {
                        cStack = cStack - remove;
                        moveCount++;
                    } else if (remove <= 0) {
                        System.out.println("You cannot take THAT out of a pile. The number must be at least 1!");
                    } else {
                        System.out.println("The pile is smaller than that! The biggest number you can take is " + cStack);
                    } //Prevent the user from picking up from a pile that has nothing remaining in it
                } catch (Exception e) {
                    System.out.println("There was an error. Please type a number to take out of C.");
                    scanner.nextLine();
                }
            } else if (choice.equals("C") || choice.equals("c") && cStack == 0) {
                System.out.println("You cannot pick anymore out of this pile, " + playerName + ", choose another!");
            }

            //Early win declaration if there is only one more counter to pick, and stopping the game early
            //The player taking the last counter LOSES
            if (aStack + bStack + cStack == 1) {
                if (moveCount%2==0){
                    playerName = player1;
                } else {
                    playerName = player2;
                }
                System.out.println(playerName + ", there is only one legal move you can and you LOSE.");
                //Changing the player name's to declare the winner
                if (playerName == player1){
                    playerName = player2;
                } else{
                    playerName = player1;
                }
                System.out.println("So " + playerName + ", you WIN!");
                //Closing the application
                System.exit(0);
            }
        } //Result: Whichever player is forced to take the last counter is the LOSER.
        //Because you exit the while loop, we need to check the updated moveCount in order to determine the winner.
        if(aStack == 0 && bStack == 0 && cStack == 0){
            if (moveCount%2==0){
                playerName = player1;
            } else {
                playerName = player2;
            }
            System.out.println(playerName + ", there is nothing to take, you WIN!");
        }

    }
}
