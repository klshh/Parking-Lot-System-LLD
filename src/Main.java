
import Spots.BikeParkingSpot;
import Spots.CarParkingSpot;
import Spots.ParkingSpot;
import Strategy.FeeStrategy.BasicFeeStrategy;
import Strategy.FeeStrategy.ParkingFeeStrategy;
import Strategy.PaymentStrategy.CashIPayment;
import Strategy.PaymentStrategy.CreditCardIPayment;
import Strategy.PaymentStrategy.IPaymentStrategy;
import Utils.EnumUtils;
import Vehicles.BikeVehicle;
import Vehicles.CarVehicle;
import Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new CarParkingSpot(1));
        parkingSpots.add(new BikeParkingSpot(2));
        parkingSpots.add(new CarParkingSpot(3));
        parkingSpots.add(new CarParkingSpot(4));


        ParkingLot parkingLot = new ParkingLot(parkingSpots);

        ParkingFeeStrategy basicFee = new BasicFeeStrategy();

        Vehicle carVehicle = new CarVehicle("CAR123", basicFee);
        Vehicle bikeVehicle1 = new BikeVehicle("BIKE123", basicFee);
        Vehicle bikeVehicle2 = new BikeVehicle("BIKE456", basicFee);

        ParkingSpot carSpot = parkingLot.parkVehicle(carVehicle);
        ParkingSpot bikeSpot1 = parkingLot.parkVehicle(bikeVehicle1);
        ParkingSpot bikeSpot2 = parkingLot.parkVehicle(bikeVehicle2);

        if(carSpot != null){
            double farePrice = carVehicle.calculateFee(2, EnumUtils.DurationType.HOURS);
            IPaymentStrategy paymentStrategy = getPaymentStrategy(1,farePrice);

            paymentStrategy.processPayment(farePrice);

        }
        if(bikeSpot1 != null){
            double bikeFarePrice = bikeVehicle1.calculateFee(3, EnumUtils.DurationType.DAYS);
            IPaymentStrategy paymentStrategy = getPaymentStrategy(1,bikeFarePrice);

            paymentStrategy.processPayment(bikeFarePrice);
        }
    }

    private static IPaymentStrategy getPaymentStrategy(int paymentMethod, double amount){
        if (paymentMethod == 1) {
            return new CreditCardIPayment();
        }
        return new CashIPayment();
    }
}