package S06_ObjectOrientedProgramming_Polymorphism;

public class L01_SmartKitchen{

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;


    public L01_SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    private void addWater(boolean makeCoffee){
        brewMaster.setHasWorkToDo(makeCoffee);
    }


    private void pourMilk(boolean getMilk){
        iceBox.setHasWorkToDo(getMilk);
    }


    private void loadDishwasher(boolean doDishes){
        dishWasher.setHasWorkToDo(doDishes);
    }

    public void setKitchenState(boolean makeCoffee, boolean getMilk, boolean doDishes){
        addWater(makeCoffee);
        pourMilk(getMilk);
        loadDishwasher(doDishes);
    }

    public void doKitchenWork(){
        iceBox.orderFood();
        brewMaster.brewCoffee();
        dishWasher.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}
