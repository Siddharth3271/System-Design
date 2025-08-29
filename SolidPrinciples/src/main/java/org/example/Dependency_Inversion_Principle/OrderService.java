package org.example.Dependency_Inversion_Principle;

// Problematic approach that violates DIP
class EmailNotifier {
  public void sendEmail(String message) {
    // Configure SMTP
    // Set up email templates
    // Send email implementation
  }
}

class OrderService {
  private EmailNotifier emailNotifier;
  private DatabaseLogger logger;
  private InventorySystem inventory;
  public OrderService() {
    // Direct dependencies on concrete implementations
    //hard coded
    //difficult in implementing different notification strategies
    this.emailNotifier = new EmailNotifier();
    this.logger = new DatabaseLogger();
    this.inventory = new InventorySystem();
  }
  public void placeOrder(Order order) {
    // Process order
    inventory.updateStock(order);
    emailNotifier.sendEmail("Order #" + order.getId() + " placed successfully");
    logger.logTransaction("Order placed: " + order.getId());
  }
}
