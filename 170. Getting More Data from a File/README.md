## 170th ASSIGNMENT
### Getting More Data from a File

Using Notepad or the text editor of your choice, create a text file containing five names and five ages. Save this file in your home directory.

Make a record to store information about a person. It should contain fields for:

a single name, which is a String, and
an age, which is an integer
Create an array of type Person with five slots.

Ask the user for the name of a file to open, and open that file and read in five names and ages from the file.

Display the contents of the array using a loop.

---

This was a tricky one. I tried to tackle with the scanner, but everytime I tried to get both the string and integer values in the same line, I would either get the whole line, or merely get the integer values.
I had to research the internet a little bit and read what could be done, and I saw two solutions. I implemented the one I thought that fit better into this project. What it does is, it uses two scanner instances, reading each line with one of them, and basically using the other to get the string and the integer values with the other. After that, I simply store those values for the Person class' variables, and use a for loop to display all of them. I override the toString method in order to make the display simpler. I used the same variables that were given in the example. 