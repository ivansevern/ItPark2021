package lesson9;

public abstract class Truck extends Automobile{
    public Truck(String model, int maxDistance, int distance) {
        super(model, maxDistance);
        this.distance = distance;
    }

    private int distance = 1200;

    public void move() {

    }
}
