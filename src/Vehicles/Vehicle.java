package Vehicles;

import Strategy.FeeStrategy.ParkingFeeStrategy;
import Utils.EnumUtils;

public abstract class Vehicle {
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingFeeStrategy getParkingFeeStrategy() {
        return parkingFeeStrategy;
    }

    public void setParkingFeeStrategy(ParkingFeeStrategy parkingFeeStrategy) {
        this.parkingFeeStrategy = parkingFeeStrategy;
    }

    private String vehicleNo;
    private String vehicleType;
    private ParkingFeeStrategy parkingFeeStrategy;


    protected Vehicle(String vehicleNo, String vehicleType, ParkingFeeStrategy parkingFeeStrategy) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.parkingFeeStrategy = parkingFeeStrategy;
    }

    public double calculateFee(int duration, EnumUtils.DurationType durationType){
        return parkingFeeStrategy.calculateFee(vehicleType,duration,durationType);
    }
}
