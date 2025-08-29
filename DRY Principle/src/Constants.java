//Before
// public class BeforeDry {
//   public static void main(String[] args) {
//     System.out.println("Connecting to http://example.com");
//   }
// }
  //After DRY

  // Constants class
  class Config {
    public static final String BASE_URL = "http://example.com";
  }

  // Main class
  public class Constants {
    public static void main(String[] args) {
      System.out.println(
          "Connecting to " +
              Config.BASE_URL); // Output: Connecting to http://example.com
    }
}