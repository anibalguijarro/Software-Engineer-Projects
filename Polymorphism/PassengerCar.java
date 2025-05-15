public class PassengerCar extends Vehicle{
    private int numberOfDoors;

    public PassengerCar(String licensePlate, String brand, String model, int numberOfDoors){
        super(licensePlate, brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    @Override
    public String showData(){
        return "License plate number: " + licensePlate + "\nBrand: " + brand + "\nModel: " + model + "\nNumber of doors: " + numberOfDoors;
    }

}