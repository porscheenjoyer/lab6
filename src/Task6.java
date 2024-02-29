import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        int userNum1 = 0;
        int userNum2 = 0;
        boolean done = false;
        String trash = " ";

        //Loop
        while (!done) {

            System.out.println("What is your first number?");

            if (in.hasNextInt()) {

                userNum1 = in.nextInt();
                done = true;

            }

            else {

                trash = in.nextLine();
                System.out.println("The first number must be an integer, you said: " + trash);

            }

        }

        done = false;

        while (!done) {

            System.out.println("What is the second number?");

            if (in.hasNextInt()) {

                userNum2 = in.nextInt();
                done = true;

            }

            else {

                trash = in.nextLine();
                System.out.println("The second number must be an integer, you said: " + trash);

            }

        }

        if (userNum1 == userNum2) {

            System.out.println(userNum1 + " is equal to " + userNum2);

        }

        else if (userNum1 > userNum2) {

            System.out.println(userNum1 + " is greater than " + userNum2);

        }

        else {

            System.out.println(userNum1 + " is less than " + userNum2);

        }

    }
}
