// Bad Code: Process order logic is combined into a single function
public class BadOrder {
  public static double processOrder(Item[] order, double taxRate) {
    double total = 0;
    for (Item item : order) {
      total += item.price * item.quantity; // Calculate item totals
    }
    total += total * taxRate; // Add tax
    return total; // Return final total
  }
}