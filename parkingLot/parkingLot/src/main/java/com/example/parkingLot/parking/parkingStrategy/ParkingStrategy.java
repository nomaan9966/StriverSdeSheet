package interviewQuestions.parkingLot.parking.parkingStrategy;

import interviewQuestions.parkingLot.parking.parkingSpot.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {

    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots);
}
