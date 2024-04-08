package S05_ObjectOrientedProgramming_Inheritance;

public class L02_Main {

    public static void main(String[] args) {

        L02_Animal animal = new L02_Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "Slow");

        L02_Dog dog = new L02_Dog();
        doAnimalStuff(dog, "Fast");

        L02_Dog yorkie = new L02_Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "Fast");

        L02_Dog retriever = new L02_Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "Slow");

        L02_Dog wolf = new L02_Dog("Wolf", 40);
        doAnimalStuff(wolf, "Slow");


        L02_Fish goldie = new L02_Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "Fast");

    }

    public static void doAnimalStuff(L02_Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }

}
