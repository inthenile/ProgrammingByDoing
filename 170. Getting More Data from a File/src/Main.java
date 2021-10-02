import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What file to read from? ");
        //Getting the user to pick a file.
        String fileName = scanner.nextLine();

        File file = new File(fileName);
        scanner = new Scanner(file);
        //This variable is used to give values to the instances of the Person class.
        int numberOfPerson = 0;
        //Initiating an array with 5 values.
        Person [] persons = new Person[5];

        try {
            //As long as there are lines, we create instances of the Person class for the values inside the array.
            // Increasing the numberOfPerson each time the while loop is completed, so it runs up to 5.
            while (scanner.hasNextLine()) {
            persons[numberOfPerson] = new Person();
            String line = scanner.nextLine();
            //Here the second scanner is activated to, in effect, parse each line for the string and integer values.
            // I then assign the name and age of each instance by reading the lines on the file chosen.
            Scanner lineScanner = new Scanner(line);
            persons[numberOfPerson].name = lineScanner.next();
            persons[numberOfPerson].age = lineScanner.nextInt();
            numberOfPerson++;
        }
            //Displaying the instances of the person class in the array.
            for (Person person : persons) {
                System.out.println(person.toString());
            }
        } catch (Exception e){
            System.out.println("Something went wrong " + e);
        }

    }
}



class Person{
    String name;
    int age;
    //I override the toString() method to make the for loop look a little better.
    @Override
    public String toString(){
        return this.name + " is " + this.age + " years old.";
    }
}