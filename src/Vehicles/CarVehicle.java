package Vehicles;

import Strategy.FeeStrategy.ParkingFeeStrategy;

public class CarVehicle extends Vehicle{

    public CarVehicle(String vehicleNo,  ParkingFeeStrategy parkingFeeStrategy) {
        super(vehicleNo, "CAR", parkingFeeStrategy);
    }
}
