import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        //filling list1 with 10 random numbers
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(100)+1;
            list1.add(num);
        }
        //copying list1 into list2
        ArrayList<Integer> list2 = new ArrayList<>(list1);
        //changing last item in list1
        int x = list1.size();
        list1.set(x-1,-7);

        System.out.println(list1);
        System.out.println(list2);
    }
}