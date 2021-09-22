## 76th ASSIGNMENT
### Project: Blackjack
Write a program that allows a human user to play a simplified version of Blackjack against a computer opponent. Make it as cool as you can.

The simplified blackjack rules are as follows:

Don't worry about suits or face cards; "cards" will have values from 2-11, and all values are equally likely (that is, unlike a real blackjack game, there's no greater chance of drawing a card with value 10).
Draw two cards for the player and display them.
Draw two cards for the "dealer" and display one of them, keeping the other one hidden.
Allow the player to "hit" as many times as he would like.
If the player "busts" (gets a total over 21), the dealer automatically wins.
Allow the dealer to hit as many times as he would like. Dealer should probably hit on sixteen or lower.
If the dealer busts, the player automatically wins.
Assuming no one has busted, the player with the highest total wins. Dealer wins all ties.
As will be the case with all projects, this is not an assigment with a fixed goal. Programs that merely do what is listed above will be passing, but will certainly not be worth 100. In order to score a high grade, programs must go above and beyond the specifications. Here are suggested additional features to add:

Use realistic card values, with suits and faces from ace to king.

Incorporate wagering.

Display some sort of graphical cards.

Anything else interesting you can think of.

Be aware that you won't get any extra points for adding additional features if the basic program doesn't work. That is, if your program can't successfully do the basics listed above, no amount of bells and whistles will save your grade. Programs will be graded on the following criteria:

-Functionality - Does your program fulfill the basic requirements? Is it done? And what else does it do? (50%)

-Overall Impression - Is your program efficiently organized, or is there a lot of duplicated code? Does it look well-written, or barely finished? (25%)

-Bugs - does it compile? Are there obvious errors? Are there subtle errors? (10%)

-Internal Documentation - How easy is your code to understand? Are you using good variable names? Are there any comments? (10%)
-Readability - Is your program consistently indented in a manner that reflects the structure of your code? Is it easy to read? Are there blank lines which break up the major sections of your code? (5%)

---

The bare minimum of this assignment was easy enough. Using some while loops and conditions to play the game out was simple. I also used Thread.sleep() in order to slow down the moves, so that it created some element of excitement.
I also added suits to the game for it to look more pleasing to the eye, and a little bit more convincing for the player.
