import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        int userMonth = 0;
        boolean done = false;
        String trash;

        //Loop
        do {

            System.out.println("Enter your birth month (number 1 - 12)");

            if (in.hasNextInt()) {

                userMonth = in.nextInt();

                if (userMonth >= 0 && userMonth <= 12) {

                    done = true;

                }

                else {

                    System.out.println("You must enter a number 1 through 12, you said: " + userMonth);

                }

            }

            else {

                trash = in.nextLine();
                System.out.println("The month must be a number, you said: " + trash);

            }

        } while (!done);

        System.out.println("Your birth month is: " + userMonth);

    }
}
