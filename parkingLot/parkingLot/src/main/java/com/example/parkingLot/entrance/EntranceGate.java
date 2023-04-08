package interviewQuestions.parkingLot.entrance;

import interviewQuestions.parkingLot.parking.parkingManager.ParkingManager;
import interviewQuestions.parkingLot.parking.parkingManager.TwoWheelerParkingManager;
import interviewQuestions.parkingLot.parking.parkingStrategy.ParkingStrategyType;
import interviewQuestions.parkingLot.ticket.Ticket;
import interviewQuestions.parkingLot.vehicle.Vehicle;
import interviewQuestions.parkingLot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public interface EntranceGate {

    public abstract Ticket entry(Vehicle vehicle, ParkingStrategyType type);

    public abstract ParkingManager getParkingManager(VehicleType vehicleType);
}
