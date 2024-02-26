import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double SHIPFEE = 0.02;
        double shipCost = 0;
        double total = 0;
        boolean done = false;
        String trash;

        do {

            System.out.println("Enter the cost of the item");

            if (in.hasNextDouble()) {

                itemCost = in.nextDouble();
                done = true;

            }

            else {

                trash = in.nextLine();
                System.out.println("You input an invalid value: " + trash);

            }

        } while (!done);

        if (itemCost >= 100) {

            System.out.println("You qualify for free shipping!");

        }

        else {

            shipCost = itemCost * SHIPFEE;
            total = shipCost + itemCost;

            System.out.println("The shipping fee is " + SHIPFEE + "%\nThe shipping cost is $" + shipCost + "\nThe total is $" + total);

        }


    }
}
