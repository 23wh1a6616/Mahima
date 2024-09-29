class Invoice {
    // Instance variables
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor to initialize the instance variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Method to calculate the invoice amount
    public double getInvoiceAmount() {
        // Calculate total amount, ensuring quantity and price are non-negative
        if (quantity < 0 || pricePerItem < 0) {
            return 0.0;
        }
        return quantity * pricePerItem;
    }

    // Get methods
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Set methods
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Invoice object
        Invoice invoice = new Invoice("12345", "Hammer", 3, 15.99);
        
        // Display invoice details and the total amount
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: $" + invoice.getPricePerItem());
        System.out.printf("Invoice Amount: $%.2f%n", invoice.getInvoiceAmount());
    }
}
