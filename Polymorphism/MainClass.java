public class MainClass{

    public static void main(String[] args){
        Vehicle myVehicles[] = new Vehicle[4];

        myVehicles[0] = new Vehicle("YUI18", "Audi", "RS3");
        myVehicles[1] = new PassengerCar("IQ90", "Honda", "Accord", 4);
        myVehicles[2] = new SportCar("BH72", "Ferrari", "LaFerrari", 10);
        myVehicles[3] = new Van("OI22", "VW", "18", 1234);

        for(Vehicle vehicles : myVehicles){
            System.out.println(vehicles.showData() + "\n");
        }

    }

}