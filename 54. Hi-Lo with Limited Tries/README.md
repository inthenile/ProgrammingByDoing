### 54TH ASSIGNMENT

Hi-Lo with Limited Tries

Write a program that picks a random number from 1-100. The user keeps guessing as long as their guess is wrong, and they've guessed less than 7 times. If their guess is higher than the number, say "Too high." If their guess is lower than the number, say "Too low." When they get it right, the game stops. Or, if they hit seven guesses, the game stops even if they never got it right.

This means your while loop will have a compound condition using &&.

---

I used a while loop that runs as long as the guess is not the answer, and the user did not guess more than seven times. With if/else statements I also prepared a win condition that stops the while loop if they are met.
To top it all, I finished the program by catching a possible error, which would occur if the user gave a string input, instead of integers.