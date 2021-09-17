import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int guessCount = 1;

        System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
        int answer = rand.nextInt(100) + 1; //+100 so it is not 0-99 but 1-100.

        System.out.print("First guess: \t"); //Here we get the first guess and increase the guess number by one
        try {
            int guess = scanner.nextInt();
            //Here the user is given feedback depending on their answer, whether they are too low or high.
            //It will continue as long as the guess count is less than 7.
            while (guess != answer && guessCount < 7) {
                guessCount++;
                if (guess < answer) {
                    System.out.println("Sorry, you are too low.");
                    System.out.print("Guess #" + guessCount + ": \t");
                    guess = scanner.nextInt();
                } else {
                    System.out.println("Sorry, that guess is too high.");
                    System.out.print("Guess #" + guessCount + ": \t");
                    guess = scanner.nextInt();
                }
            }
            //Here is the win condition.
            if (guess == answer) {
                System.out.println("You guessed it!  What are the odds?!? The answer was indeed " + answer + ".\n");
            } else { //Exits the program after 7 tries.
                System.out.println("Sorry, you didn't guess it in 7 tries.  You lose. The correct number was " + answer + ".");
            }
        } catch (Exception e){
            System.out.println("There was an error: " + e + ". Please only use numbers.");
        }
    }
}
