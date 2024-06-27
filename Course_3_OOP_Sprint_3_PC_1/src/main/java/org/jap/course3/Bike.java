package org.jap.course3;

public class Bike extends  VehicleManufacturer implements Vehicle{

    @Override
    public int maxSpeed(String vehicleType) {
        int speed=0;
        if(vehicleType.equals("sportsBike"))
        {
            speed=300;
        } else if (vehicleType.equals("cruiser")) {
            speed=170;
        }
        return speed;
    }

    @Override
    public String getManufaturerInformation() {
        return super.toString();
    }



    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
        System.out.println("In Bike Class -> param constructor");
    }
}
