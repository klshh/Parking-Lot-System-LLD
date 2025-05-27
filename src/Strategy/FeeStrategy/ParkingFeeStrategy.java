package Strategy.FeeStrategy;

import Utils.EnumUtils;

public interface ParkingFeeStrategy {

    double calculateFee(String vehicleType, int duration, EnumUtils.DurationType durationType);
}
