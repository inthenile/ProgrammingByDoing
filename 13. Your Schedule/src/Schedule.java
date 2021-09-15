import java.util.HashMap;
import java.util.LinkedHashMap;

public class Schedule {
    //Using a LinkedHashMap to preserve the order of the inputs
    static HashMap <String, String> schedule = new LinkedHashMap<String, String>();

    public static void main(String[] args) {
        Add.add();
    }
    //Function to display with some formatting the result when the user wants to stop
    static void display(){

        for (int j = 1 ; j <= schedule.size(); j++) {
            for (String i : schedule.keySet()) {
                System.out.print(j + "." + i + "\t\t" + "=");
                System.out.println("\t\t" + schedule.get(i));
                j++;
            }

        }
        }
    }
