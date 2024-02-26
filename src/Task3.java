import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        String userParty = " ";
        boolean done = false;

        //Loop
        do {
            System.out.println("What is your political affiliation? Put R for Republican, D for Democratic, I for Independent, and O for Other");

            userParty = in.nextLine();
            userParty.toLowerCase();

            switch (userParty) {

                case "r":
                    System.out.println("You are a Republican Person");
                    break;
                case "d":
                    System.out.println("You are a Democratic Donkey");
                    break;
                case "i":
                    System.out.println("You are an Independent Elephant");
                    break;
                case "o":
                    System.out.println("You are Other");
                    break;
                default:
                    System.out.println("You entered an incorrect value: " + userParty);

            }

        } while (!done);

    }
}
