class PaymentProcessor {
  private String paymentMethod;
  public PaymentProcessor(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
  // Processes payment only
  public void processPayment(double amount) {
    if (paymentMethod.equalsIgnoreCase("CreditCard")) {
      System.out.println("Processing payment of $" + amount + " via Credit Card.");
    } 
    else if (paymentMethod.equalsIgnoreCase("DebitCard")) {
      System.out.println("Processing payment of $" + amount + " via Debit Card.");
    }
    else {
      System.out.println("Payment method not supported.");
    }
  }
}
//fulfills requirement
public class GoodPayementProcessor {
  public static void main(String[] args) {
    // Interviewer's requirement: Only DebitCard and CreditCard payments
    PaymentProcessor creditCardProcessor = new PaymentProcessor("CreditCard");
    creditCardProcessor.processPayment(100); // Output: Processing payment of $100 via Credit Card.
    PaymentProcessor debitCardProcessor = new PaymentProcessor("DebitCard");
    debitCardProcessor.processPayment(50); // Output: Processing payment of $50 via Credit Card.
  }
}