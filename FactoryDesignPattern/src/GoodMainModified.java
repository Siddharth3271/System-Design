
// Vehicle.java - Common interface
interface Vehicle {
  void start();
  void stop();
}

// Engine.java - A component class
//a simple Engine class with start() and stop() methods. This encapsulates the logic for the engine itself, separating it from the vehicle's other concerns.
class Engine {
    public void start() {
        System.out.println("Engine is starting...");
    }
    public void stop() {
        System.out.println("Engine is stopping...");
    }
}

//you would create this Engine instance within the Car's constructor. Then, instead of directly printing to the console, the start() and stop() methods of the Car will call the corresponding methods on the engine object. This is an example of composition—a "has-a" relationship (a Car "has an" Engine)
class Car implements Vehicle {
    private Engine engine;

    public Car() {
        // Composition: Car has a dependency on Engine
        this.engine = new Engine();
    }

    public void start() {
        System.out.println("Car is initiating start sequence...");
        this.engine.start();
    }

    public void stop() {
        System.out.println("Car is initiating stop sequence...");
        this.engine.stop();
    }
}

class Truck implements Vehicle {
  public void start() {
    System.out.println("Truck is starting...");
  }
  public void stop() {
    System.out.println("Truck is stopping...");
  }
}

class Bike implements Vehicle {
  public void start() {
    System.out.println("Bike is starting...");
  }
  public void stop() {
    System.out.println("Bike is stopping...");
  }
}

// VehicleFactory.java - Factory to create vehicles
class VehicleFactory {
  public static Vehicle getVehicle(String vehicleType) {
    if (vehicleType.equals("Car")) {
      return new Car();
    } else if (vehicleType.equals("Truck")) {
      return new Truck();
    } else if (vehicleType.equals("Bike")) {
      return new Bike();
    } else {
      throw new IllegalArgumentException("Unknown vehicle type");
    }
  }
}
public class GoodMainModified {
    // Create a Car object using the factory
    public static void main(String[] args) {
        Vehicle myCar = VehicleFactory.getVehicle("Car");
        
        // Now you can use the object without knowing its internal details
        System.out.println("--- Testing My Car ---");
        myCar.start();
        myCar.stop();
    }
}
