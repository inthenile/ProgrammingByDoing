## 89th ASSIGNMENT
### Sierpinski Triangle

We're going to use what we've been learning to draw a famous fractal: the Sierpinski triangle. You'll need to implement the following steps:

Make certain that your application specifies a WIDTH of 1024 and a HEIGHT of 768 for the Canvas.

Create six variables to represent three vertices: (512,109), (146,654), and (876,654). I recommend storing these as (x1,y1), (x2,y2), and (x3,y3).

Create another pair of variables which will store the "current" point. You should really call them x and y. Start x at 512, and start y at 382.

Then, in a loop that repeats 50,000 times:

-Draw the current point on the screen by using the following line of code: g.drawLine(x,y,x,y);

-(optional) Delay for a bit using Thread.sleep()

-Have the computer choose a random number from 1 to 3

-If the random number was a 1, find the distance between (x,y) and (x1,y1)

-(You can find the x-distance (which I call dx) by subtracting x - x1, and you can find dy in a similar way.)

-If the random number was a 2, find the distance between (x,y) and (x2,y2)

-If the random number was a 3, find the distance between (x,y) and (x3,y3)

-Move the "current" point half the distance to the chosen vertex like so: x = x - dx/2; and (similarly) y = y - dy/2;

-Again, all of this is in a loop that repeats 50,000 times or so.

(optional) Once the loop ends, draw the string "Sierpinski Triangle" at (462,484) or so.

---

I wanted to do this assignment in particular owing to its pleasing visuals, and I wanted to learn a little more what you can do in terms of Graphics with Java using the Swing library.

