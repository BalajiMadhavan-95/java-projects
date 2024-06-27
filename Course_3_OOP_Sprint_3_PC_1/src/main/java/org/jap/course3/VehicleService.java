package org.jap.course3;

public class VehicleService {
    public static void main(String[] args) {
        Bike b=new Bike("Bajaj Pulsar","Bajaj Pulsar NS200","sportsBike");
 int speed= b.maxSpeed("sportsBike");
        System.out.println("Bike type is "+b.getVehicleType()+" its speed is "+speed);
        System.out.println( b.getManufaturerInformation());
        Car c=new Car("Santro","Santro123","sedan");
    speed=c.maxSpeed("sedan");
        System.out.println("Car type is "+c.getVehicleType()+" its speed is "+speed);
        System.out.println(c.getManufaturerInformation());
    }
}
