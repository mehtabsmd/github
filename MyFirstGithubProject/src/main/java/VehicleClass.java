public class VehicleClass {
    public static void main(String [] args)
    {
        Vehicle vehicle = new Vehicle();
        vehicle.vehicleName ="tesla";
        vehicle.vehicleType ="car";
        vehicle.noOfVehicles = 4;
        vehicle.isElectric = true;
        System.out.println(vehicle);
    }
}
class Vehicle {

    public String vehicleName;
    public String vehicleType;
    public int noOfVehicles;
    public boolean isElectric;

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", noOfVehicles=" + noOfVehicles +
                ", isElectric=" + isElectric +
                '}';
    }
}
