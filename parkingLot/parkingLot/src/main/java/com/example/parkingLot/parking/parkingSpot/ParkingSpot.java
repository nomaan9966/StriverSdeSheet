package interviewQuestions.parkingLot.parking.parkingSpot;

import interviewQuestions.parkingLot.vehicle.Vehicle;

public abstract class ParkingSpot {

    private final int id;
    private boolean isEmpty;
    private Vehicle vehicle;

    protected ParkingSpot(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public abstract int getPrice();
}
