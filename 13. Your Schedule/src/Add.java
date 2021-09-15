import java.util.InputMismatchException;
import java.util.Scanner;

public class Add {

    static void add(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter course: ");
        String course = scanner.nextLine();
        System.out.println("Enter teacher: ");
        String teacher = scanner.nextLine();
        Schedule.schedule.put(course.toUpperCase(), teacher.toUpperCase());

        //Ask the user whether they want more items in the schedule
        System.out.println("If you want to add more, enter 1. If you want to see your schedule, enter any other number.");
        try {
        int prompt = scanner.nextInt();
        if (prompt == 1){
            //If they do, we keep repeating the function, until they stop adding key-values.
            Add.add();
        } else {
            Schedule.display();
        }
        } catch (InputMismatchException e){
            System.out.println("There was an error." + e + " You can keep adding items to your list.");
            add();
        }
    }

}
