// Smart Payment Gateway

abstract class Payment {

    // Private fields
    private String transactionId;
    private double amount;

    // Constructor
    Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    // Getter methods
    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    // Abstract method
    abstract double processPayment();
}


// Credit Card Payment
class CreditCardPayment extends Payment {

    CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    // Method overriding
    @Override
    double processPayment() {
        double fee = getAmount() * 0.02;
        return getAmount() + fee;
    }
}


// UPI Payment
class UPIPayment extends Payment {

    private String upiId;

    UPIPayment(String transactionId, double amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }

    // Method overriding
    @Override
    double processPayment() {

        // UPI ID check
        if (upiId == null || !upiId.contains("@")) {
            System.out.println("Invalid UPI ID");
            return 0;
        }

        return getAmount();
    }
}


// Payment Processor
class PaymentProcessor {

    void process(Payment payment) {

        double total = payment.processPayment();

        System.out.println("Transaction ID: "
                + payment.getTransactionId());

        System.out.println("Amount: " + payment.getAmount());

        System.out.println("Total Payment: " + total);
        System.out.println();
    }
}


// Main Class
public class Main {

    public static void main(String[] args) {

        // Create payment objects
        Payment creditCard =
                new CreditCardPayment("CC101", 1000);

        Payment upi =
                new UPIPayment("UPI101", 1000, "user@upi");

        // Payment Processor
        PaymentProcessor processor = new PaymentProcessor();

        // Polymorphic array
        Payment[] payments = {
            creditCard,
            upi
        };

        // Process payments polymorphically
        double total = 0;

        for (Payment payment : payments) {

            double amount = payment.processPayment();

            System.out.println("Transaction ID: "
                    + payment.getTransactionId());

            System.out.println("Processed Amount: "
                    + amount);

            System.out.println();

            total += amount;
        }

        System.out.println("Total = " + total);
    }
}