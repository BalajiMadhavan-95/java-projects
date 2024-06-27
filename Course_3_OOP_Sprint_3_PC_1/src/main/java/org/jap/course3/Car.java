package org.jap.course3;

public class Car extends VehicleManufacturer implements Vehicle{


    @Override
    public int maxSpeed(String vehicleType) {
       int speed=0;
        if(vehicleType.equals("SprtsCar"))
       {
           speed=250;
       } else if (vehicleType.equals("Sedan")) {
            speed=170;
        }
        return speed;
    }

    @Override
    public String getManufaturerInformation() {
        return super.toString();
    }

    public Car(String vehicleName, String vehicleModelName, String vehicleType) {

        super(vehicleName, vehicleModelName, vehicleType);
        System.out.println("In Car class -> Parameterized Constructor");
    }

    public Car() {
    }
}
