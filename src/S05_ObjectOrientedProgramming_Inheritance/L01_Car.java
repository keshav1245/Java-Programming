package S05_ObjectOrientedProgramming_Inheritance;

public class L01_Car {

     private String make = "Mercedes";
     private String model = "G Class";
     private String color = "black";
     private int doors = 5;
     private boolean isConvertible = false;


     public void describeCar(){
         System.out.println(doors + "-Door "+
                 color + " " +
                 make + " " +
                 model + " " +
                 (isConvertible ? "convertible" : ""));
     }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }
}
