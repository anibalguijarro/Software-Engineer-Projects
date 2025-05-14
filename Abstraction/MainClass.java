public class MainClass{

    public static void main(String[] args){

        // IMPORTANT: Abstract class can't be instantiated

        Plant plant = new Plant();
        CarnivoreAnimal animal1 = new CarnivoreAnimal();
        HerbivoreAnimal animal2 = new HerbivoreAnimal();

        plant.feed();
        animal1.feed();
        animal2.feed();
    }

}