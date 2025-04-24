//Multilevel Inheritance: citizen extends Human, Human extends Animal
public class Citizen extends Human {
    String nationality;

    public Citizen(String Habitat, String Name, int age, String ModeOfNutrition, String occupation, String nationality){
        super(Habitat, Name, age, ModeOfNutrition, occupation);
        this.nationality = nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public void getNationality() {
        System.out.println(Name + " is a citizen of "+nationality);
    }
}
