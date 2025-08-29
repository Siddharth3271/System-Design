// Vehicle.java - Common interface
interface Vehicle {
  void start();
  void stop();
}

// Car.java - Concrete class for Car
class Car implements Vehicle {
  public void start() {
    System.out.println("Car is starting...");
  }
  public void stop() {
    System.out.println("Car is stopping...");
  }
}

// Truck.java - Concrete class for Truck
class Truck implements Vehicle {
  public void start() {
    System.out.println("Truck is starting...");
  }
  public void stop() {
    System.out.println("Truck is stopping...");
  }
}

// Bike.java - Concrete class for Bike
class Bike implements Vehicle {
  public void start() {
    System.out.println("Bike is starting...");
  }
  public void stop() {
    System.out.println("Bike is stopping...");
  }
}
//maintenance becomes a nightmare
public class BadMain {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        vehicle1.start();
        vehicle1.stop();
        Vehicle vehicle2 = new Truck();
        vehicle2.start();
        vehicle2.stop();
        Vehicle vehicle3 = new Bike();
        vehicle3.start();
        vehicle3.stop();
  }
}

/*Interviewer’s Follow-up Questions: Can We Improve the Code?
An interviewer might ask:

• What if we need to add more vehicle types in the future? 🚙

• What if the logic of vehicle creation changes? 🔧

In this case, the code could become harder to maintain as you add more vehicle types or change the vehicle creation logic. For example, if you had to introduce new behavior or properties for vehicle creation, you would need to modify the creation code in many places, which could lead to potential errors. */


// Main.java becomes a mess as you add more vehicle creation logic
// public class Main {
//   public static void main(String[] args) {
//     String vehicleType = "Truck"; // Imagine this value is dynamic
//     Vehicle vehicle;
//     if (vehicleType.equals("Car")) {
//       vehicle = new Car();
//     } else if (vehicleType.equals("Truck")) {
//       vehicle = new Truck();
//     } else if (vehicleType.equals("Bike")) {
//       vehicle = new Bike();
//     } else {
//       throw new IllegalArgumentException("Unknown vehicle type");
//     }
//     vehicle.start();
//     vehicle.stop();
//   }
// }

//This code is fragile. If we want to add another vehicle type, we need to modify this code again, which is error-prone and hard to maintain.
