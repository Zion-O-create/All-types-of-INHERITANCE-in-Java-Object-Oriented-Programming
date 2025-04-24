//single Inheritance : parent class => Animal ; Child Class => PLant
public class Plant extends Animal{
   String type;

    public Plant(String Habitat, String Name, int age, String ModeOfNutrition, String type){
        super(Habitat, Name, age, ModeOfNutrition);
        this.type = type;

    }

    public void DisplayPLant(){
        System.out.println(Name + " is " + age + " years old, feed through" + ModeOfNutrition + ". it is a " + type + " plant. Lives on "+ Habitat +". ");
    }


    public String grow() {
        this.age += 100;
        return "New age is " + this.age;
    }
}
