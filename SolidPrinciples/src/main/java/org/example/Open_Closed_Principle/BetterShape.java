package org.example.Open_Closed_Principle;

public // Better approach following Open/Closed Principle
abstract class BetterShape {
  abstract double calculateArea();
  // We can also use an interface instead of an abstract class
}

class Circle extends BetterShape {
 private
  double radius;
  @Override 
public double calculateArea() {
    return Math.PI * radius * radius;
  }
}

class Rectangle extends BetterShape {
 private
  double width;
 private
  double height;
  @Override 
public double calculateArea() {
    return width * height;
  }
}

// Adding a new Shape without modifying existing code(Prevents breaking of existing code)
class Triangle extends BetterShape {
 private
  double base;
 private
  double height;
  @Override 
public double calculateArea() {
    return 0.5 * base * height;
  }
} 
