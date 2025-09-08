class Newcar {
  private String engine;
  private int wheels;
  private int seats;
  private String color;
  private boolean sunroof;
  private boolean navigationSystem;
  // Car constructor should be private, ensuring it's only created through the

  // builder
  private Newcar(CarBuilder builder) {
    this.engine = builder.engine;
    this.wheels = builder.wheels;
    this.seats = builder.seats;
    this.color = builder.color;
    this.sunroof = builder.sunroof;
    this.navigationSystem = builder.navigationSystem;
  }

  // Getter methods for the fields
  public String getEngine() {
    return engine;
  }
  public int getWheels() {
    return wheels;
  }
  public int getSeats() {
    return seats;
  }
  public String getColor() {
    return color;
  }
  public boolean hasSunroof() {
    return sunroof;
  }
  public boolean hasNavigationSystem() {
    return navigationSystem;
  }
  @Override
  public String toString() {
    return "Car [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats
        + ", color=" + color + ", sunroof=" + sunroof
        + ", navigationSystem=" + navigationSystem + "]";
  }

  // CarBuilder nested class
  public static class CarBuilder {
    private String engine;
    private int wheels = 4; // Default value
    private int seats = 5; // Default value
    private String color = "Black"; // Default value
    private boolean sunroof = false; // Default value
    private boolean navigationSystem = false; // Default value

    // Builder methods to set attributes
    public CarBuilder setEngine(String engine) {
      this.engine = engine;
      return this;
    }
    public CarBuilder setWheels(int wheels) {
      this.wheels = wheels;
      return this;
    }
    public CarBuilder setSeats(int seats) {
      this.seats = seats;
      return this;
    }
    public CarBuilder setColor(String color) {
      this.color = color;
      return this;
    }
    public CarBuilder setSunroof(boolean sunroof) {
      this.sunroof = sunroof;
      return this;
    }
    public CarBuilder setNavigationSystem(boolean navigationSystem) {
      this.navigationSystem = navigationSystem;
      return this;
    }

    // Build method to create a Car object
    public Newcar build() {
      return new Newcar(this); // Return a new Car created using the builder's values
    }
  }

}
public class Main {
  public static void main(String[] args) {
    // Creating a car using the Builder pattern
    Newcar.CarBuilder builder = new Newcar.CarBuilder();
    Newcar car1 = builder.setEngine("V8")
                   .setColor("Red")
                   .setSeats(5)
                   .setSunroof(true)
                   .build(); // The build method returns the final product
    System.out.println(car1);

    // Creating another car with different specifications
    Newcar car2 = builder.setEngine("V6")
                   .setColor("Blue")
                   .setSeats(4)
                   .build(); // Sunroof and Navigation are default
    System.out.println(car2);
  }
}

/*
 Why is the CarBuilder Nested in the Car Class?
1. Encapsulation:

The CarBuilder is tightly related to the Car class, so it’s grouped inside it. This makes it clear that the builder is for creating Car objects.

Access to Private Fields:
The CarBuilder can directly access private fields of Car (like engine, wheels) without needing getters/setters.

Logical Grouping:
By nesting, we keep the CarBuilder and Car together, making the code cleaner and easier to understand.


Why is the CarBuilder Static?
1. No Need for Car Instance:

The CarBuilder doesn't need an instance of Car to create a new one, so it’s made static. You can use the builder without creating a Car object first.

2. Efficiency:

It avoids unnecessary object creation. You don't need to instantiate Car just to use the builder.

3.Simpler Usage:

The static builder allows clients to create a Car object directly with Car.CarBuilder() without needing a separate builder instance.
 */