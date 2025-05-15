public class Vehicle{
    protected String licensePlate;
    protected String brand;
    protected String model;

    public Vehicle(String licensePlate, String brand, String model){
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public String showData(){
        return "License plate number: " + licensePlate + "\nBrand: " + brand + "\nModel: " + model;
    }

}