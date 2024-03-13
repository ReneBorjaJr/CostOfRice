package rice;

import java.util.Scanner; // Import the Scanner class

public class CostOfRice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter the quantity of rice: ");
        int quantity = scanner.nextInt(); //Read user input for quantity

        System.out.println("Enter the price per unit: ");
        double pricePerUnit = scanner.nextDouble(); // Read user input for price per unit

        System.out.println("Enter the miles for delivery: ");
        double miles = scanner.nextDouble();// Read user input for miles

        double deliveryFee = 0;

        // calculate delivery fee based on distance
        if (miles <= 4) {
            deliveryFee = 2.0;
        } else if (miles <= 15) {
            deliveryFee = 5.0;
        } else if (miles <= 25) {
            deliveryFee = 10.0;
        } else if (miles <= 50) {
            deliveryFee = 15.0;
        } else if (miles > 50) {
            deliveryFee = 20.0;
        }

        // Calculate and display the total cost
        double totalCost = (quantity * pricePerUnit) + deliveryFee;
        System.out.println("Total cost: $" + totalCost);

        scanner.close(); //Close the scanner
    }

}
