package rice;

public class CostOfRice {
    public static void main(String[] args) {
        int quantity = 20;
        double pricePerUnit = 5.0;
        double miles = 60.0;
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
        } else if (miles > 50){
            deliveryFee = 20.0;
        }

        // Calculate and display the total cost
        double totalCost = (quantity * pricePerUnit) + deliveryFee;
        System.out.println("Total cost: $" + totalCost);
    }

}
