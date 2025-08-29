// Reusable method for button rendering
class Button {
  private String label;

  public Button(String label) {
    this.label = label;
  }

  public void render() {
    System.out.println("Rendering button: " + label);
  }
}

public class ReusableComponent {
  public static void main(String[] args) {
    Button submitButton = new Button("Submit");
    submitButton.render(); // Output: Rendering button: Submit
    Button cancelButton = new Button("Cancel");
    cancelButton.render(); // Output: Rendering button: Cancel
  }
}