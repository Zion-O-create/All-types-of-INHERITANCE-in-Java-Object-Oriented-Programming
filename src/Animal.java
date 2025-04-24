public class Animal {
    String Habitat;
    String Name;
    int age;
    String ModeOfNutrition;

    public Animal(String Habitat, String Name, int age, String ModeOfNutrition){
        this.Habitat = Habitat;
        this.age = age;
        this.Name = Name;
        this.ModeOfNutrition = ModeOfNutrition;

    }


    public String grow() {
        this.age += 1;
        return "New age is " + this.age;
    }
}