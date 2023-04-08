package interviewQuestions.parkingLot.parking.parkingSpot;

public class FourWheelerSpot extends ParkingSpot {

    private final int price;

    public FourWheelerSpot(int price) {
        super(id);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
