public class Car extends Vehicle {
    int doors;
    public Car(int doors, int maxSpeed, String type) {
        super(maxSpeed, type);
        this.doors = doors;
    }
}
