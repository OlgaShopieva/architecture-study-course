public class Cube implements Shape {
    private int edge;
    private double volume;

    public Cube(int edge, double volume) {
        this.edge = edge;
        this.volume = volume;
    }

    public double volume() {
        return edge * edge * edge;
    }
    @Override
    public double area() {
        return 6 * edge * edge;
    }

}
