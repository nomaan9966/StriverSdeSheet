package interviewQuestions.parkingLot.parking.parkingManager;

import interviewQuestions.parkingLot.parking.parkingSpot.ParkingSpot;
import interviewQuestions.parkingLot.parking.parkingStrategy.ParkingStrategy;
import interviewQuestions.parkingLot.vehicle.Vehicle;

import java.util.List;

public class ParkingManager {

    private List<ParkingSpot> parkingSpots;

    public ParkingManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public void addParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots.addAll(parkingSpots);
    }

    public void removeParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots.removeAll(parkingSpots);
    }

    public void parkVehicle(Vehicle vehicle, ParkingStrategy parkingStrategy) {
        ParkingSpot parkingSpot = parkingStrategy.findParkingSpot(parkingSpots);
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setEmpty(false);
    }

    public void removeVehicle(ParkingSpot parkingSpot) {
        parkingSpot.setVehicle(null);
        parkingSpot.setEmpty(true);
    }
}
