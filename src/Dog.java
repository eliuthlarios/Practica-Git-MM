public class Dog extends Mamals {
    private String Breed;

    public Dog(String Name, int MonthsOfLactancy, String Breed) {
        super(Name, MonthsOfLactancy);
        this.Breed = Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }

    public String getBreed() {
        return Breed;
    }

    @Override
    public void Attack() {
        System.out.println("Estoy mordiendo");
    }
}