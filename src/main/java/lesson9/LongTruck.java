package lesson9;

public class LongTruck extends Truck {
    @Override
    public void move(int maxDistance) {

    }

    public LongTruck(String model, int maxDistance, int distance) {
        super(model, maxDistance, distance);
        System.out.println("Максимальная дистанция = " + model + " " + maxDistance + " км");
    }
}
