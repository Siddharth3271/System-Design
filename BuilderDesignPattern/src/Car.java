public class Car {
  private String engine;
  private int wheels;
  private int seats;
  private String color;
  private boolean sunroof;
  private boolean navigationSystem;

  public Car(String engine, int wheels, int seats, String color,boolean sunroof, boolean navigationSystem){
    this.engine = engine;
    this.wheels = wheels;
    this.seats = seats;
    this.color = color;
    this.sunroof = sunroof;
    this.navigationSystem = navigationSystem;
  }
  
  //multiple constructors with different parameters leads to cubersome code
  public Car(String engine, int wheels, int seats, String color) {
    
  }
  public Car(String engine, int wheels, int seats) {
  
  }


}
