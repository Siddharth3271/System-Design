package org.example.Open_Closed_Principle;

//Incorrect Appproach
public class Shape {
    private String type;

    public double calculateArea(){
        if(type.equals("circle")){
            //circle area calculation
        }
        else if(type.equals("rectangle")){
            //reactangle area calculation
        }

        //Adding a triangle requires modifying this method
        //
    }
}
