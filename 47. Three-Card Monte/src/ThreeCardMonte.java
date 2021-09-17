import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {

    public static void main(String[] args) {
        //getting our random object in order to get a random number between 1-3 for the player to guess.
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(3)+1; //+1 in order to increase the range from 0-2 to 1-3.
        System.out.print("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.\n\n" +
                "Which one is the ace?\n" +
                "\t###\t###\t###\n"+
                "\t###\t###\t###\n"+
                "\t1\t2\t3\n\n");
        int choice = scanner.nextInt(); //Getting user input

        //The result
        if(choice == answer){
            System.out.println("You nailed it! " + choice + " was right! Fast Eddie reluctantly hands over your winnings, scowling.");
        }else{
            System.out.println("Ha! Fast Eddie wins again! You answered " + choice + ". But the ace was card number " + answer + ".");
        }
        //Visual result here
        if (answer == 1){
            System.out.println("\tAAA\t###\t###\n"+
                    "\tAAA\t###\t###\n"+
                    "\t\"1\"\t2\t3");
        } else if (answer == 2){
            System.out.println("\t###\tAAA\t###\n"+
                    "\t###\tAAA\t###\n"+
                    "\t1\t\"2\"\t3");
        }else{
            System.out.println("\t###\t###\tAAA\n"+
                    "\t###\t###\tAAA\n"+
                    "\t1\t2\t\"3\"");
        }
    }
}
