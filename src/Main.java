public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Terrestial", "Zebra", 7,"Herbivorous");


        // Single inheritance: Plant extends Animal;
        Plant cactus = new Plant("Dessert", "Cactus 1", 600, "Photosinthesis", "Bull Cactus");

        // Hierarchical inheritance : Plant extends Animal, Human extends animal;
        Human bobby = new Human("Terrestial", "Bobby", 17, "Cafeteria", "Student");

        //Multilevel Inheritance: Citizen extends Human, Human extends Animal
        Citizen toby = new Citizen("Terrestial", "Toby", 17, "Cafeteria","Student", "Nigeria");

        // Java does not support Multiple inheritance,but it can be acheived by interfaces
        cactus.DisplayPLant();
        bobby.getOccupation();
        toby.getNationality();


    }
}