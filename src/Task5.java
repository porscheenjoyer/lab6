import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double materialCost = 0;
        double total = 0;
        double area = 0;
        boolean done = false;
        String trash = " ";

        //Loop
        do {

            //Collect width

            System.out.println("What is the width?");

            if (in.hasNextDouble()) {

                width = in.nextDouble();

                //Collect height

                System.out.println("What is the height?");

                if (in.hasNextDouble()) {

                    height = in.nextDouble();

                    //Collect the cost of materials

                    System.out.println("What is the cost per square foot of materials?");

                    if (in.hasNextDouble()) {

                        materialCost = in.nextDouble();

                        done = true;

                    }

                    else {

                        trash = in.nextLine();
                        System.out.println("The cost must be a number, you said: " + trash);

                    }

                }

                else {

                    trash = in.nextLine();
                    System.out.println("The height must be a number, you said: " + trash);

                }

            }

            else {

                trash = in.nextLine();
                System.out.println("The width must be a number, you said: " + trash);

            }

        } while (!done);

        area = width * height;

        total = area * materialCost;

        System.out.println("The total cost for " + area + " square feet is $" + total);

    }
}
