import java.util.Scanner;

class ElectricityBill {
    private String consumerNo;
    private String consumerName;
    private double previousMonthReading;
    private double currentMonthReading;
    private String connectionType; // "domestic" or "commercial"
    private double billAmount;

    // Constructor to initialize the electricity bill
    public ElectricityBill(String consumerNo, String consumerName, double previousMonthReading,
                           double currentMonthReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = currentMonthReading;
        this.connectionType = connectionType.toLowerCase();
        this.billAmount = calculateBill();
    }

    // Method to calculate the bill based on user-defined tariffs
    private double calculateBill() {
        double unitsConsumed = currentMonthReading - previousMonthReading;
        double rate;

        // Define the tariff rates based on connection type
        if (connectionType.equals("domestic")) {
            if (unitsConsumed <= 100) {
                rate = 1.5; // Rate per unit for domestic
            } else if (unitsConsumed <= 300) {
                rate = 2.5;
            } else {
                rate = 3.5;
            }
        } else if (connectionType.equals("commercial")) {
            if (unitsConsumed <= 100) {
                rate = 2.0; // Rate per unit for commercial
            } else if (unitsConsumed <= 300) {
                rate = 3.0;
            } else {
                rate = 4.0;
            }
        } else {
            throw new IllegalArgumentException("Invalid connection type.");
        }

        return unitsConsumed * rate;
    }

    // Method to display the bill details
    public void displayBill() {
        System.out.println("Electricity Bill Details:");
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.printf("Previous Month Reading: %.2f%n", previousMonthReading);
        System.out.printf("Current Month Reading: %.2f%n", currentMonthReading);
        System.out.printf("Units Consumed: %.2f%n", currentMonthReading - previousMonthReading);
        System.out.printf("Connection Type: %s%n", connectionType.substring(0, 1).toUpperCase() + connectionType.substring(1));
        System.out.printf("Bill Amount: $%.2f%n", billAmount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details from the user
        System.out.println("Enter Consumer No:");
        String consumerNo = scanner.nextLine();

        System.out.println("Enter Consumer Name:");
        String consumerName = scanner.nextLine();

        System.out.println("Enter Previous Month Reading:");
        double previousMonthReading = scanner.nextDouble();

        System.out.println("Enter Current Month Reading:");
        double currentMonthReading = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter Type of Connection (domestic/commercial):");
        String connectionType = scanner.nextLine();

        // Create ElectricityBill object
        try {
            ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousMonthReading,
                    currentMonthReading, connectionType);

            // Display the bill
            bill.displayBill();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

    
