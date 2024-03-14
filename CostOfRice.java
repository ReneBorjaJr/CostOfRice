package rice;

import javax.sound.midi.Soundbank;
import java.util.Scanner; // Import the Scanner class
import java.util.SortedMap;

public class CostOfRice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter the name of what you are purchasing: ");
        String name = scanner.nextLine(); //Read user input for name

        System.out.println("Enter the quantity: ");
        int quantity = scanner.nextInt(); //Read user input for quantity

        System.out.println("Enter the price per unit: ");
        double pricePerUnit = scanner.nextDouble(); // Read user input for price per unit

        System.out.println("Enter the miles for delivery: ");
        double miles = scanner.nextDouble();// Read user input for miles

        double deliveryFee;

        // calculate delivery fee based on distance
        if (miles <= 4) {
            deliveryFee = 2.0;
        } else if (miles <= 15) {
            deliveryFee = 5.0;
        } else if (miles <= 25) {
            deliveryFee = 10.0;
        } else if (miles <= 50) {
            deliveryFee = 15.0;
        } else {
            deliveryFee = 20.0;
        }

        //name of the product
        System.out.println("You purchased: " + name);

        // Calculate and display the total cost
        double totalCost = (quantity * pricePerUnit) + deliveryFee;
        System.out.println("Total cost: $" + String.format("%.2f", totalCost));

        scanner.close(); //Close the scanner
    }

}
