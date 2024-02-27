import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        double userDouble = 0;
        int userInt = 0;
        String userString = " ";

        //Collect Input
        System.out.println("Enter something: ");

        if (in.hasNextInt()) {

            userInt = in.nextInt();
            System.out.println("You said: " + userInt + "\nWhich is an integer");

        }

        else if (in.hasNextDouble()) {

            userDouble = in.nextDouble();
            System.out.println("You said: " + userDouble + "\nWhich is a double");

        }

        else {

            userString = in.nextLine();
            System.out.println("You said: " + userString + "\nWhich is a string");

        }

    }
}
