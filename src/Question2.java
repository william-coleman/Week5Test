/**
 * Created by lrterry on 10/13/16.
 */
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        //Ask a user to add in a number, save it to a variable and print out that variable.
        Scanner heyYou = new Scanner(System.in);
        int num1;
        System.out.println("Please input a number now");
        num1 = heyYou.nextInt();
        System.out.println(num1);
    }
}
