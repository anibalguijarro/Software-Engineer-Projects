public class Van extends Vehicle{
    private int payloadCapacity;

    public Van(String licensePlate, String brand, String model, int payloadCapacity){
        super(licensePlate, brand, model);
        this.payloadCapacity = payloadCapacity;
    }

    public int getPayloadCapacity(){
        return payloadCapacity;
    }

    @Override
    public String showData(){
        return "License plate number: " + licensePlate + "\nBrand: " + brand + "\nModel: " + model + "\nPayload capacity: " + payloadCapacity;
    }
}