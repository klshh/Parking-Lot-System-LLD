package Spots;

import Utils.EnumUtils;
import Vehicles.Vehicle;

public class BikeParkingSpot extends ParkingSpot{
    public BikeParkingSpot(int spotNo) {
        super(spotNo, "BIKE");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType().equals(EnumUtils.Vehicles.BIKE.name());
    }
}
