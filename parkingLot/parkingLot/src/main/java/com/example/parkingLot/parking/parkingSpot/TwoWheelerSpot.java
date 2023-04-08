package interviewQuestions.parkingLot.parking.parkingSpot;

public class TwoWheelerSpot extends ParkingSpot {

    private final int price;

    public TwoWheelerSpot(int price) {
        super(id);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}