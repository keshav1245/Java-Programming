package S06_ObjectOrientedProgramming_Polymorphism;

public class L01_Product {

    private String model;
    private String manufacturer;
    private int width, height, depth;


    public L01_Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends L01_Product{

    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void drawPixel(int x, int y, String color){
        System.out.println(String.format(

                "Drawing pixel at %d,%d in color %s ", x, y, color

        ));
    }

}

class Motherboard extends L01_Product{

    private int ramSlots, cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }

}

class ComputerCase extends L01_Product{

    private String powerSupply;

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }


    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }


}

