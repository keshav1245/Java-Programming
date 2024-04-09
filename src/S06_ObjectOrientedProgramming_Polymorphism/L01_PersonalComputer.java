package S06_ObjectOrientedProgramming_Polymorphism;

public class L01_PersonalComputer extends L01_Product{

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public L01_PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }


    private void drawLogo(){
        monitor.drawPixel(1200, 50, "yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }


}
