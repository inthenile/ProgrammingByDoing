## 153rd ASSIGNMENT
### Hangman

Write a program to play a word-guessing game like Hangman.

It must randomly choose a word from a list of words.

It must stop when all the letters are guessed.

It must give them limited tries and stop after they run out.

It must display letters they have already guessed (either only the incorrect guesses or all guesses).

---

I covered every requirement needed in this assignment. Initially I used a String array to pick a random word out of, but then I changed my mind and wanted to improve the program by reading from a .txt file, and grab a random word from there. The "wordlist.txt" file can be changed to increase or decrease the amount of words found in the game.

The player has 10 choices. The wrong guesses, as well as the remaining number of guesses they have, are displayed during run-time.

Learnings: It was a good opportunity for me to have an experience working with files. I had to learn about BufferedReader in order to grab a word from the .txt file. What I did was, I counted the total number of lines, and then used a random number generator to grab one at random, then declared that word as the word for the player to find.