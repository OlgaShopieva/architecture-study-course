public class Bus extends Vehicle{
    int seats;
    public Bus(int maxSpeed, String type, int seats) {
        super(maxSpeed, type);
        this.seats = seats;
    }
}
