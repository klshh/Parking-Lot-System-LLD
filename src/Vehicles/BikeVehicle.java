package Vehicles;

import Strategy.FeeStrategy.ParkingFeeStrategy;

public class BikeVehicle extends Vehicle{
    public BikeVehicle(String vehicleNo, ParkingFeeStrategy parkingFeeStrategy) {
        super(vehicleNo, "BIKE", parkingFeeStrategy);
    }
}
