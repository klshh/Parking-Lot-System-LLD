import Spots.ParkingSpot;
import Vehicles.Vehicle;

import java.util.List;

public class ParkingLot {
    public List<ParkingSpot> getSlotList() {
        return slotList;
    }
    private List<ParkingSpot> slotList;

    public ParkingLot(List<ParkingSpot> slotList) {
        this.slotList = slotList;
    }

    public ParkingSpot findAvailableSpot(String vehicleType){
        for(ParkingSpot spot : slotList){
            if(!spot.isOccupied() && spot.getSpotType().equals(vehicleType)){
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle){
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
        if(spot != null){
            spot.setOccupied(true);
            return spot;
        }
        System.out.println("Not Available Parking Spot for vehicleType: " + vehicle.getVehicleType());
        return null;
    }

    public void vacateSpot(ParkingSpot spot, Vehicle vehicle){
        if(spot != null && spot.isOccupied() && spot.getVehicle().equals(vehicle)){
            spot.vacate();
        } else {
            System.out.println("Unable to vacant the spot");
        }
    }
}
