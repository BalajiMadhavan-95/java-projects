package org.jap.course3;

public abstract class VehicleManufacturer {
    private String vehicleName;
    private String vehicleModelName;
    private String vehicleType;

    public VehicleManufacturer(String vehicleName, String vehicleModelName, String vehicleType) {
        System.out.println("In Vehicle Manufacturer class -> parameterized constructor");
        this.vehicleName = vehicleName;
        this.vehicleModelName = vehicleModelName;
        this.vehicleType = vehicleType;
    }

    public VehicleManufacturer() {
        System.out.println("In Vehicle class -> no-arg constructor");
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "VehicleManufacturer{" +
                "vehicleName='" + vehicleName + '\'' +
                ", vehicleModelName='" + vehicleModelName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }

    public abstract  String getManufaturerInformation();
}
