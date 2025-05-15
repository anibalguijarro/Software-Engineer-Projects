public class SportCar extends Vehicle{
    private int cylinders;

    public SportCar(String licensePlate, String brand, String model, int cylinders){
        super(licensePlate, brand, model);
        this.cylinders = cylinders;
    }

    public int getCylinders(){
        return cylinders;
    }

    @Override
    public String showData(){
        return "License plate number: " + licensePlate + "\nBrand: " + brand + "\nModel: " + model + "\nCylinders: " + cylinders;
    }

}