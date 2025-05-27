package Spots;

import Utils.EnumUtils;
import Vehicles.Vehicle;

public class CarParkingSpot extends ParkingSpot{
    public CarParkingSpot(int spotNo) {
        super(spotNo, "CAR");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType().equals(EnumUtils.Vehicles.CAR.name());
    }
}
