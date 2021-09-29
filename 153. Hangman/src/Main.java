import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        //initiating the word to be hidden. It will be declared within the try block using a BufferedReader.
        //The initial value of "placeholder" changes.
        String word = "placeholder";
        //total wrong guess number to put a limit to the guesses
        int wrongGuessCount = 0;
        //total number of correct guesses to finish the game if the player successfully finds the word.
        int correctGuessCount = 0;
        //This array list will be used to display the wrong guesses that are not in the word. i.e. "Wrong guesses are: [a, c]" and so forth.
        ArrayList<Character> wrongLetters = new ArrayList<>();

        //Reading "wordlist.txt" in order to grab a random word for the game
        //This chooses a random word everytime the application is run. You can expand the list by adding more lines to the "wordlist.txt"
        try(BufferedReader buffer = new BufferedReader(new FileReader("wordlist.txt"))){
            int totalWordCount = 0;
            while (buffer.readLine() != null){
                totalWordCount++;
            }
            word = Files.readAllLines(Paths.get("wordlist.txt")).get(rand.nextInt((totalWordCount)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    //making an array of letters of the chosen word
        char [] wordchars = word.toCharArray();

    for (int i = 0; i < wordchars.length ; i++) {
        //hiding all the letters with a for loop, this way whatever the word is, it will work just fine.
        wordchars[i] = '_';
        System.out.print(wordchars[i] + " ");
    }
    while(wrongGuessCount < 10) {
        try {
            System.out.print("\nGuess a letter: ");
            Scanner scanner = new Scanner(System.in);
            char guess = scanner.nextLine().charAt(0);
            //Asking the player for a letter input and assigning it to a variable

            for (int i = 0; i < wordchars.length; i++) {
                //Using the word.charAt() to check whether the letter is a correct guess
                //since we set all the word chars to '_'.
                //If the letter is a correct one, we swap the word char from '_' to the actual letter
                if (guess == word.charAt(i)) {
                    wordchars[i] = guess;
                    //Increase the correct guess by one, each time a letter is discovered.
                    correctGuessCount++;
                }
                System.out.print(wordchars[i] + " ");
            }
            //if the letter doesn't exist in the letter array, the player has one less attempt.
            //This is outside the for loop, so it only increases by one.
            if (!word.contains(guess + "")){
                wrongLetters.add(guess);
                wrongGuessCount++;
                System.out.println("\nThat letter is not in the word!");
                System.out.println("Remaining guesses: " + (10-wrongGuessCount));

            }
            if (wrongGuessCount > 0) {
                System.out.println("Wrong guesses are: " + wrongLetters);
            }
            //Win-condition for the player
            if(correctGuessCount == word.length()){
                System.out.println("\nYou WIN! The word is " + word);
            }

            //If the user gives an empty input, we catch the error.
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Please guess a letter. " + e);
        }
    }
        //When the player runs out of guesses, the game's over.
        System.out.println("\nYou ran out of guesses! You LOSE! The word was " + word);
    }
}
