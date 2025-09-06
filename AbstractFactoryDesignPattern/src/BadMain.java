// Vehicle.java - Common Interface
interface Vehicle {
    void start();
    void stop();
}

// Concrete Classes for Car Brands
class Honda implements Vehicle {
    public void start() {
        System.out.println("Honda Car is starting");
    }

    public void stop() {
        System.out.println("Honda Car is stopping");
    }
}

class Toyota implements Vehicle {
    public void start() {
        System.out.println("Toyota Car is starting");
    }

    public void stop() {
        System.out.println("Toyota Car is stopping");
    }
}

class BMW implements Vehicle {
    public void start() {
        System.out.println("BMW Car is starting");
    }

    public void stop() {
        System.out.println("BMW Car is stopping");
    }
}

// Factory Method to Create Vehicles
class CarFactory {
    public Vehicle createVehicle(String brand) {
        if (brand.equals("Honda")) {
            return new Honda();
        } 
        else if (brand.equals("Toyota")) {
            return new Toyota();
        } 
        else if (brand.equals("BMW")) {
            return new BMW();
        } 
        else {
            throw new IllegalArgumentException("Unknown car brand");
        }
    }
}

// Main Method
public class BadMain {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Vehicle vehicle = factory.createVehicle("Honda");
        vehicle.start();
        vehicle.stop();
    }
}
