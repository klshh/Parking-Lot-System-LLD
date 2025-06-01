package Strategy.FeeStrategy;

import Utils.EnumUtils;

public class BasicFeeStrategy implements ParkingFeeStrategy{

    @Override
    public double calculateFee(String vehicleType, int duration, EnumUtils.DurationType durationType) {
        double fare;
       if(vehicleType.equals(EnumUtils.Vehicles.CAR.name())){
           if(durationType.equals(EnumUtils.DurationType.HOURS)){
               fare = duration * 60 * 10;
           } else {
               fare = duration * 24 * 60 * 5;
           }
       } else if (vehicleType.equals(EnumUtils.Vehicles.BIKE.name())) {
           if(durationType.equals(EnumUtils.DurationType.HOURS)){
               fare = duration * 60 * 5;
           } else {
               fare = duration * 24 * 60 * 3;
           }
       } else {
           fare = 50.0;
       }
       return fare;
    }
}
