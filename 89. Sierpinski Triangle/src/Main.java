import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Main extends Canvas {
    public static void main(String[] args) {
        //Creating the panel
        JFrame frame = new JFrame();
        Main canvas = new Main(); //the main class extends canvas
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024,768);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.add(canvas); //adding the canvas to the frame
    }
    public void paint (Graphics graphics) {
        //storing points to draw lines between. These numbers are provided on "programmingbydoing.com"
        int x1 = 512;   //x1 is half the width of the screen (512)
        int y1 = 109;   //y1 is 1/7 the height of the screen (109)
        int x2 = 146;   //x2 is 1/7 the width of the screen (146)
        int y2 = 654;   //y2 is 6/7 the height of the screen (654)
        int x3 = 876;   //x3 is 6/7 the width of the screen (876)
        int y3 = 654;   //y3 is 6/7 the height of the screen (again, 654)
        //current points
        int x = 512;
        int y = 382;
        //Counter to specify how many times you want to place dots on the canvas. It's the base for our while-loop.
        int counter=0;
        //Loop to draw the triangle, each iteration marks a single spot.
        while (counter<50000) {
            //Putting a dot on the current points
            graphics.drawLine(x,y,x,y);
            //getting a random between 0-2.
            Random random = new Random();
            int next = random.nextInt(3);
            //Changing the current point to put a dot on, depending on the random number we get.
            if (next == 0) {
                int distancex = x - x1;
                int distancey = y - y1;
                x = x - distancex / 2;
                y = y - distancey / 2;
            } else if (next == 1) {
                int distancex = x - x2;
                int distancey = y - y2;
                x = x - distancex / 2;
                y = y - distancey / 2;
            } else {
                int distancex = x - x3;
                int distancey = y - y3;
                x = x - distancex / 2;
                y = y - distancey / 2;
            }
        //increasing the counter by one everytime a dot is placed.
        counter++;
        }
        //Displays the message after the for loop
        graphics.drawString("Sierpinski triangle!", 462, 484);
    }
}

