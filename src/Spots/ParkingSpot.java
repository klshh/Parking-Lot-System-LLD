package Spots;

import Vehicles.Vehicle;

public abstract class ParkingSpot {
    public ParkingSpot(int spotNo, String spotType) {
        this.isOccupied = false;
        this.spotNo = spotNo;
        this.spotType = spotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getSpotNo() {
        return spotNo;
    }

    public void setSpotNo(int spotNo) {
        this.spotNo = spotNo;
    }

    public String getSpotType() {
        return spotType;
    }

    public void setSpotType(String spotType) {
        this.spotType = spotType;
    }

    private Vehicle vehicle;

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    private boolean isOccupied;
    private int spotNo;
    private String spotType;

    public boolean isOccupied(){
        return isOccupied;
    }

    public abstract boolean canParkVehicle(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle){
        if(isOccupied){
            System.out.println("Already Occupied Spot");
        }
         if(!canParkVehicle(vehicle)){
             System.out.println("Not Suitable Parking Spot");
         }
         this.vehicle = vehicle;
         this.isOccupied = true;
    }

    public void vacate(){
        if(!isOccupied){
            System.out.println("Already vacant");
        }
    }

}
