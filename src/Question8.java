/**
 * Created by lrterry on 10/13/16.
 */
import java.util.ArrayList;
public class Question8 {
    public static void main(String[] args) {

        // Copy the array list from the previous question to this one.
        // Iterate over the ArrayList and print out each element.
        ArrayList<String> new1 = new ArrayList<>();

        new1.add("Hey");
        new1.add("You");
        new1.add("there");
        new1.add("over");
        new1.add("here");

        for (int i = 0; i < new1.size(); ++i) {
            new1.get(i);
            System.out.println(new1.get(i).toString());
        }
    }
}
