import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double efficiency = 0;
        double price = 0;
        double DRIVE_MILES = 100;
        double distance = 0;
        double costMiles = 0;
        String trash = "";
        boolean gasDone = false;

        do {
            System.out.println("Enter the number of gallons of gas in your tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                gasDone = true;
            } else {
                trash = in.next();
                System.out.println("Invalid input.");
                System.out.println("Please try again.");
            }
            System.out.println("Enter the number of efficiency of gas in your tank: ");
            if (in.hasNextDouble()) {
                efficiency = in.nextDouble();
                gasDone = true;
            } else {
                trash = in.next();
                System.out.println("Invalid input.");
                System.out.println("Please try again.");
            }
            System.out.println("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                gasDone = true;
            } else {
                trash = in.next();
                System.out.println("Invalid input.");
                System.out.println("Please try again.");
            }
        }while(!gasDone);

        distance = gallons * efficiency;
        System.out.println("On a full tank of gas, you will get " + distance + " miles.");
        costMiles = (DRIVE_MILES/efficiency)*price;
        System.out.println("The cost to drive 100 miles will be " + costMiles + ".");

    }
}
