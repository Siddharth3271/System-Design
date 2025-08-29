// SubmitButton class with its own onClick() implementation
class SubmitButton {
  void onClick() { System.out.println("Form submitted."); }
}

// CancelButton class with its own onClick() implementation
class CancelButton {
  void onClick() { System.out.println("Action canceled."); }
}

public class WithoutOOP {
 public static void main(String[] args) {
    SubmitButton submit = new SubmitButton();
    submit.onClick();  // Output: Form submitted.
    CancelButton cancel = new CancelButton();
    cancel.onClick();  // Output: Action canceled.
  }
}