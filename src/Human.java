// human extends animal
public class Human extends Animal{
    String occupation;

    public Human(String Habitat, String Name, int age, String ModeOfNutrition, String occupation){
        super(Habitat, Name, age, ModeOfNutrition);
        this.occupation = occupation;

    }

    public String grow() {
        age += 10;
        return "New age is " + age;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void getOccupation() {

        System.out.println(Name + " is a " + occupation + " by profession");
    }

}
